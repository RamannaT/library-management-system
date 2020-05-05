import { Component } from '@angular/core';
import { UserService } from './services/user.service';
import { User } from './model/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'lms';
  
  currentUser:User; 

  constructor(private userService: UserService,
    private route:Router){

      this.userService.currentUser.subscribe(
        data =>{
          this.currentUser = data;
        }
      );
  }


  logout(){
    this.userService.logout().subscribe(
      data =>{
        this.route.navigate(['/login']);
      }
    );
  }
}
