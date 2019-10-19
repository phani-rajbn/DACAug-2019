//expressProgram.js
var express = require("express")
var parser = require("body-parser");//This is required if U R processing the POST method for an HTTP Request. The content of the posted data will be be added to the body object of the Request which can be viewed only if U include the parser...

var app = express();
//express is a non-self invoking module, so u should call its method using () which returns the object...
//Use the parser for UR Application
app.use(parser.urlencoded({extended:false}));

var root = __dirname;

app.get("/", (req, res)=>{
	res.send("Testing Express");
})

app.get("/Arrays", (req, res)=>{
	res.sendFile(root + "/SimpleDemo.html");
})

app.get("/Home", (req, res)=>{
	res.sendFile(root + "/UserRegistration.html");
})

//process the request
/*app.get("/register", (req, res)=>{
  var name = req.query.txtname;
  var address = req.query.txtaddress;
  res.send(name + " has been successfully registered with us<br/>We will send the acknowledgement to UR registered Address at " + address);
});*/

app.post("/register", (req, res)=>{
	var name = req.body.txtname;
	var address = req.body.txtaddress;
  	res.send(name + " has been successfully registered with us in a secured manner<br/>We will send the acknowledgement to UR registered Address at " + address);
})

app.listen(1234, function(){
	console.log("server is running at 1234");
})