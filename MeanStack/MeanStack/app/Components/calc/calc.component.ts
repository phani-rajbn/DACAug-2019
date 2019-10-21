import { Component, OnInit } from '@angular/core';

//A Component is a self contained class with a directive called @Component
@Component({
  selector: 'app-calc',
  templateUrl: './Calc.html'
})
export class CalcComponent{
  firstValue : number = 0;
  secondValue : number = 0;
  result : number = 0;
  operand : string ="Multiply";
  constructor() { }
  
  testFunc(){
    alert("Apple123");
  }

  //Function syntax in TypeScript...
  process(){
    switch(this.operand){
      case "Add":
        this.result = this.firstValue + this.secondValue;
        break;        
      case "Subtract":
        this.result = this.firstValue - this.secondValue;
        break;
      case "Multiply":
        this.result = this.firstValue * this.secondValue;
        break;
      case "Divide":
        this.result = this.firstValue / this.secondValue;
        break;
    }
  }

}
