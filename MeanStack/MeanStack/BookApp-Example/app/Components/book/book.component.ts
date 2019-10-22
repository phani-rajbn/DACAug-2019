import { Component, OnInit } from '@angular/core';
import { BookService } from '../../Services/book.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
//A service can be injected into UR component either by Constructor or ngOnInit Function, it is however good to inject the service at the constructor level so that it could be refered in the functions using this operator...

export class BookComponent implements OnInit {
  allBooks : any;
  selectedBook : any;
  id : number = 0;
  title : string ="";
  price : number = 0;
  filter : string = "";
  constructor(private service : BookService) { }

  ngOnInit() {
    //this.allBooks = this.service.getAll();
    this.service.getAll().subscribe((res)=>this.allBooks = res);
  }
  //Calling find function of the service....
  findEmp(id: number){
    let observable = this.service.find(id);
    //find function returns an observable object. The object will make the App wait for the result to come from the service. U could use a function called subscribe or then to wait for the result which is passed as arg to the callback function. The arg is this case would be the selectedBook. 
    observable.subscribe(res=>this.selectedBook = res);
  }

  addBook(){
    let bk = {"id" :this.id, "title" : this.title, "price" :this.price};
    this.service.postNewBook(bk).subscribe((res)=>{
      alert(res);
    })
  }

  delete(id:number){
    this.service.delete(id).subscribe((res)=>{
       alert(res);
    });
  }
}
