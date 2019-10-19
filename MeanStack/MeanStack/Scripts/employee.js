/*function employee(id, name, address){
	this.empId = id;
	this.empName = name;
	this.empAddress = address;
}*/

//New syntax of JavaScript....
class employee{
	constructor(id, name, address) {
		this.empId = id;
		this.empName = name;
		this.empAddress = address;
	}
	//JS does not have private scoped functions and variables, everything is public scoped.
	
}

class EmpRepository{
	//r data = [];//blank Array...
	constructor(){
		this.data = [];//initializing the array as blank...
		this.data.push(new employee(123, "Phaniraj", "Bangalore"));
		this.data.push(new employee(124, "Mahesh", "Bangalore"));
		this.data.push(new employee(125, "Gopal", "Mysore"));
		this.data.push(new employee(126, "Venkatesh", "Chennai"));
	}

	addEmployee(emp){
		this.data.push(emp);
		alert("Employee added successfully");
	}

	deleteEmployee(id){
		for (var i = 0; i < this.data.length; i++) {
			if(this.data[i].empId == id){
				this.data.splice(i, 1);
				alert("Employee deleted successfully");
			}
		}
		throw "Employee not found to delete";
	}

	find(id){
		for (var i = 0; i < this.data.length; i++) {
			if(this.data[i].empId == id){
				return this.data[i];				
			}
		}
		throw "Employee not found";	
	}

	update(emp){
		throw "Not available in the current version";
	}
}