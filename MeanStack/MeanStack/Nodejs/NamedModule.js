//NamedModule.js
module.exports.employee = function(id, name, address){
	this.empid = id;
	this.empName = name;
	this.empAddress = address;
}
module.exports.empApp = (function(){
	employees = [];

	addEmp = function(emp){
		employees.push(emp);
	}

	find = function(id){
		return employees.find((e)=>e.empid == id);
	}

	findAll = function(){
		return employees;
	}

	remove = function(id){
		for (var i = 0; i < employees.length; i++) {
			if(employees[i].empid == id){
				employees.splice(i, 1);
				return;
			}
		}
	}
	return{
		addEmp : addEmp,
		find : find,
		findAll : findAll, 
		remove : remove	
	}
})();
exports.title = "DAC MEAN Stack Course";
exports.developedBy = "Phaniraj B.N.";
exports.developedOn = new Date();
