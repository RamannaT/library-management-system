import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { User } from 'src/app/model/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user: User = new User();
  errorMessage : String;
 

  constructor(private userSrvice: UserService,
    private route: Router) { }

  ngOnInit(): void {
    if(this.userSrvice.currentUserValue){
      this.route.navigate(['/home']);
      return;
    }
  }

  login(){
    this.userSrvice.login(this.user).subscribe(data =>{
      this.route.navigate(['/profile']);
    }, err =>{
      this.errorMessage = "Username or Password is incorrect"
    });
  }

}
