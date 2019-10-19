var http = require("http");
var fs = require('fs');
var join = require('path').join;
var parse = require("url").parse;


function errorPage(res){
	res.writeHead(200, {'Content-type' : 'text/html'});
	res.write("<h1>OOPS!!!!<br/>Something wrong happened<hr/>");
	res.write("Our Developers are working on it, will come back soon");
	res.end();
}

var root = __dirname;

http.createServer((req, res)=>{
	var url = req.url;
if(req.method == "GET"){
	var query = parse(url).query;//QueryString info.....
	console.log(query);
	if(query != null){//The URL Contains a Query String
		var query = parse(url, true).query;//true will convert the QString to an object..
		var answer = "Thanks " + query.txtname + "\nUR items will be posted to UR Address at " + query.txtaddress;
		res.end(answer);
		return;
	}
	var filename = parse(url).pathname;
	console.log(filename);
	switch(filename){
		case "/UserRegistration":
			var file = join(root, filename + ".html");
			fs.createReadStream(file).pipe(res);
			return;
		default:
		 errorPage(res);
	}
}else if(req.method == "POST"){
	var body = "";
	req.on("data", function(inputs){
		body += inputs;
		res.end(body);
	})
}
}).listen(1234);