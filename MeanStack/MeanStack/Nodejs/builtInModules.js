//builtInModules.js
//For builtin modules, U dont use ./ while importing the module...
var fs = require("fs");//file system
var util = require("util");//for formating.
var os = require("os");//for OS related info....
var http = require("http");

var filename = "builtInModules.js";
///////////Reading file synchronously//////////////////
/*var data = fs.readFileSync("app.js", 'utf8');
console.log(data);*/
//////////////Reading File Async/////////////////////////////
/*fs.readFile(filename, 'utf8', function(err, data){
	console.log(data);
})

console.log("Is this the last line to be executed?");*/
////////////////////Appending existing file/////////////
/*fs.appendFile(filename, "//This line is added", function(err){
	if(err) console.log(err);
});*/
////////////////////Using Util module/////////////
/*var name = "Phaniraj";
var age = 42;
var address = "RR Nagar, Bangalore";
var msg = util.format("My Name is %s from %s and my age is %d years", name, address, age);
console.log(msg);*/
///////////////////OS related Operations/////////////
/*console.log(os.type());
console.log(os.uptime()/3600 + " hrs");
console.log(os.hostname());*/
///////////////////http Server///////////////////////////
//http is a module for creating web servers within UR machine. Unlike other real time servers: Apache, IIS, WebSphere, it is light weight and easily deployable.
var server = http.createServer(function(request,response){
	response.write("Hello HTTP");
	response.end();
});
server.listen(1234); 