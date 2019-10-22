//mySqlDBDemo.js
//npm install mysql: Will Install the mysql Nodejs package into the node_modules. 
var app = require("express")();
var util = require("util");
var parser = require("body-parser");

app.use(parser.urlencoded({extended:true}));
app.use(parser.json());//POSTED body will be provided as JSON object....

app.use((req, res, next)=>{
	res.header("Access-Control-Allow-Origin", "*");
	res.header("Access-Control-Allow-Methods", "GET,PUT, POST, DELETE");
	res.header("Access-Control-Allow-Headers", "*");
	//Enable CORS to UR REST SERVICE....	
	next();
})


//creating a Connection to the database....
function getConnection(){
	var sql = require("mysql");//npm install --save mysql...
	var config = {
		server : 'localhost',
		database :'cdactraining',
		user:'root',
		password:''
	};
	var con = sql.createConnection(config);
	return con;
}

////REST Services:GET, POST, PUT and DELETE////////////////
app.get('/', (req, res)=>{
	var query = "SELECT * FROM BOOKSTORE ORDER BY id"
	var con = getConnection();
	con.query(query, (err, results, fields)=>{
		res.send(JSON.stringify(results));
	})
})

app.get('/:id', (req, res)=>{
	var id = req.params.id;
	//console.log(id);
	var query = "select * from bookstore where id=" + id;
	var con = getConnection();
	con.query(query, (err, results, fields)=>{
		res.send(JSON.stringify(results));
	})
})

app.post("/", (req, res)=>{
	var data = req.body;
	console.log(data);
	var query = util.format("Insert into bookstore values(%d, '%s', %d)", data.id, data.title, data.price);
	var con = getConnection();
	con.query(query, (err, results, fields)=>{
		if(err) res.send(JSON.stringify(err));
		res.send("Inserted successfully");
	})
})

app.delete("/:id",(req, res)=>{
	var id = req.params.id;
	var query = "DELETE FROM bookstore where id =" + id;
	var con = getConnection();
	con.query(query, (err, results,fields)=>{
		if(err) res.send(JSON.stringify(err));
		res.send("Deleted successfully");
	})
})

app.listen(1234, ()=>{
	console.log("server is at 1234");
})