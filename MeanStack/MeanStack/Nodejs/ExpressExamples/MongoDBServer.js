var mongo = require("mongodb").MongoClient;
var url = "mongodb://localhost/DacExample";
var database;
mongo.connect(url, (e, db)=>{
	if(e) console.log(e);//error handling...
	database = db.db("DacExample");
	database.collection("employee").find().toArray((err, result)=>{
		result.forEach((e, i)=>{
			console.log(e.empName);
		})
	});	
});
