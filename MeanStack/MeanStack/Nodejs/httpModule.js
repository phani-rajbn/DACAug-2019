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

var dir = __dirname;//builtin variable for UR Current directory....

http.createServer((req, res)=>{
	var url = req.url;
	if(url != "/favicon.ico"){
		switch(url){
			case "/":
				var file = join(dir, "UserRegistration.html");
				fs.createReadStream(file).pipe(res);//reads the file and pushes the data into the response. 
				return;
		 	case "/DAC":
		 		res.end("<h1>Dac Home Page</h1>");
		 		return;
	 		default:
	 			errorPage(res);
		}
	}

}).listen(1234);
