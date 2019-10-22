//Using express and nodejs we will create a REST service that will be consumed by either jQUery client or an Angular Client....

var express = require("express")();
var mongo = require("mongodb").MongoClient;//client object for mongodb...
var parser = require("body-parser");

express.use(parser.urlencoded({"extended": true}));
express.use(parser.json());

express.use((req, res, next)=>{
	res.header("Access-Control-Allow-Origin", "*");
	res.header("Access-Control-Allow-Methods", "GET, PUT, POST, DELETE");
	next();
})

var db; //global connection object...
function getConnection(){
	var dbLoc ="mongodb://localhost/DacExample";
	mongo.connect(dbLoc,(err, database)=>{
		db = database.db("DacExample");
	})	
};

getConnection();//Call the function....

express.get("/AllEmployees", (req, res)=>{
	db.collection("employee").find().toArray((err, result)=>{
		res.send(result);
	})
})

express.get("/AllEmployees/:id", (req, res)=>{
	var id = req.params.id;
	console.log(id);
	var finder = {"empId": parseInt(id)};
	db.collection("employee").find(finder).toArray((err, result)=>{
		res.send(result);
	})
})

express.post("/AllEmployees", (req, res)=>{
	var data = req.body;
	db.collection("employee").insert(data);
	res.send("Inserted successfully");
});


express.put("/AllEmployees", (req, res)=>{
	res.send("U should do it");
})
express.listen(1234, ()=> console.log("Server at 1234"));
