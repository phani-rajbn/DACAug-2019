require("./SimpleFile.js");
var flipkart = require("./firstModule.js");
var app = require("./NamedModule");
var repository = app.empApp;


//Functions created in the js file will be represented as singleton objects and is used using require("..") api; 
//print(addFunc(123, 234));//from the SimpleFile.js
///////////////Cart Example/////////////////////

/*flipkart.addToCart({"id": 123, "name":"Mobile", "price" : 25000});
flipkart.addToCart({"id": 124, "name":"Laptop", "price" : 75000});
flipkart.addToCart({"id": 125, "name":"Pen drive", "price" : 500});
flipkart.addToCart({"id": 126, "name":"HeadSet", "price" : 1500});

var items = flipkart.getAllItems();
items.forEach(function(e, i){
	console.log("The Item name: " + e.name + "\nIt Costs " + e.price + "\nIt's ID is " + e.id);
})*/

//////////Named Module example/////////////////////////////
function getDateFormat(date){
	var info = date.getDate() + "/" + (date.getMonth() + 1) + "/" + date.getFullYear();
	return info; 
}
console.log("This app was developed for " + app.title);
console.log("This app was developed on " + getDateFormat(app.developedOn));
var emp = new app.employee(123, "Phaniraj", "Bangalore");
repository.addEmp(emp);
var emp2 = new app.employee(124, "Gopal", "Mysore");
repository.addEmp(emp2);
var data = repository.findAll();
data.forEach(function(e, i){
	console.log(e.empName);
})