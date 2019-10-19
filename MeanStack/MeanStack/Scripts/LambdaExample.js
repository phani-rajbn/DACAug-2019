//Lambda Functions in JS

var data = [];

function initRecords(){
	data.push("Apple");
	data.push("PineApple");
	data.push("Mango");
	data.push("Orange");
	data.push("Banana");
}
//filter method is a method of the Array class that is used to filter the elements within the Array Collection..
//forEach method is used to iterate thro the elements of the collection. It uses a Callback function which will be called on every element of the collection. foreach works for iterating the collection in a forward only and read only manner. 

function foreachExample(){
	initRecords();
/*	data.forEach(function(element, index){
		alert(index);
		alert(element);
	})*/
	data.forEach((e,i)=> alert(e));
}
//This function will filter the data based on the lambdaexpression where every element is passed into the function and which ever element returns true would be the filtered one..
function filterRecords(arg){
	return data.filter((e)=> e.includes(arg));
}

function getAllRecords(){
	initRecords();
	return data;
}