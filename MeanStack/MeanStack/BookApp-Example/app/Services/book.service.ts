import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
//An Angular Service is a Class with a directive called @Injectable which allows to create singleton object that can be used across all the components of the Angular App. A singleton object is one that makes only one instance on how many ever times U create the object. This makes the data and the functions to be shared among the components of the Application. 

@Injectable({
  providedIn: 'root'//this is new since Angular 6 where U dont need to add the service in the AppModule file...
})
export class BookService {
  url : string = "http://localhost:1234";
  //create an object of httpClient to make Ajax Calls to UR REST...
  constructor(private http:HttpClient) { }

  //The return of any REST Service would be an Observable object. Observable are async objects which has methods like then which can be used to retrive the data after the async operation is complete. 
  getAll() : any{
    return this.http.get(this.url);
  }

  find(id) : any{
    let temp = this.url + "/" + id;
    return this.http.get(temp);
  }

  postNewBook(bk) : any{
    return this.http.post(this.url, bk) ;
  }

  delete(id) : any{
    let temp = this.url + "/" + id;
    return this.http.delete(temp);
  }
}
