import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {BehaviorSubject,observable, Observable} from 'rxjs'
import {map} from 'rxjs/operators'
import {User} from '../model/user'
import { localizedString } from '@angular/compiler/src/output/output_ast';


let API_URL ="http://localhost:8080/book/";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  public currentUser: Observable<User>;
  private currentUserSubject: BehaviorSubject<User>;

  constructor(private http: HttpClient) { 
    this.currentUserSubject = new BehaviorSubject<User>(JSON.parse(localStorage.getItem('currentUser')));
    this.currentUser = this.currentUserSubject.asObservable();
  }

  public get currentUserValue(){
    return this.currentUserSubject.value;
  }

  login(user:User){
    const headers= new HttpHeaders(
      user ? {
        authirization : 'Basic' + btoa(user.username+':'+user.password)
      }:{}
    );
    return this.http.get<any>(API_URL + "login",{headers}).pipe(
        map(response => {
          if(response){
            localStorage.setItem('currentUser',JSON.stringify(response));
            this.currentUserSubject.next(response);
          }
        })
    );
    
  }

  logout(): Observable<any> {
    return this.http.post(API_URL + "logout", {}).pipe(
      map(response =>{    
        localStorage.removeItem('currentUser');
        this.currentUserSubject.next(null);
      })
    );
  }

  register(user:User):Observable<any>{
    return this.http.post(API_URL+ "registration", JSON.stringify(user),
    {headers:{"Content-Type":"application/json; charset-UTF-8"}});
  }



}
