import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { User } from 'src/app/model/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  user: User = new User;
  errorMessage : String;

  constructor(private userService:UserService,private router:Router) { }

  ngOnInit(): void {
    if(this.userService.currentUserValue){
      this.router.navigate(['/home']);
      return;
    }
  }

  register(){
    this.userService.register(this.user).subscribe(date=>{
      this.router.navigate(['/login']);
    }, err =>{
      if(!err || err.status != 409){
          this.errorMessage = "Unexcepted error occurred. Error : "+ err;
      }else{
        this.errorMessage = "Username is already exist";
      }
    });
  }
}
