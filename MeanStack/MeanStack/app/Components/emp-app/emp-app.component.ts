import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/Classes/employee';

@Component({
  selector: 'app-emp-app',
  templateUrl: './emp-app.component.html',
  styleUrls: ['./emp-app.component.css']
})
export class EmpAppComponent{
  employees : Employee[] = []; 
  newEmp : Employee;
  selectedEmp : Employee;
  constructor() { 
    this.employees.push(new Employee(123, "Phaniraj", "Bangalore"));
    this.employees.push(new Employee(124, "Rajesh", "Chennai"));
    this.employees.push(new Employee(125, "Kumar", "Mumbai"));
    this.employees.push(new Employee(126, "Robert", "New Delhi"));
  }

  addEmployee(){
    this.employees.push(this.newEmp);
  }
  
  findEmp(id: number){
    this.selectedEmp = this.employees.find((e)=>e.empId == id);
  }
  deleteEmployee(id: number){
    let emp = this.employees.find((e)=>e.empId == id);
    let index = this.employees.indexOf(emp);
    this.employees.splice(index, 1);  
  }

  updateEmployee(emp){
    let temp = this.employees.find((e) => e.empId == emp.empId);
    temp.empName = emp.empName;
    temp.empAddress = emp.empAddress;
  }
}
