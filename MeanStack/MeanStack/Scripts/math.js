//All js code and functions could be written and refered inside multiple html documents.

function addFunc(first, second){
	if(isNaN(first))
		throw "Not a number";
	if(isNaN(second))
		throw "Not a number";	
	return first + second;
}

function subFunc(first, second){
	if(isNaN(first))
		throw "Not a number";
	if(isNaN(second))
		throw "Not a number";	
	return first - second;
}

function mulFunc(first, second){
	if(isNaN(first))
		throw "Not a number";
	if(isNaN(second))
		throw "Not a number";	
	return first * second;
}

function divFunc(first, second){
	if(IsNaN(first))
		throw "Not a number";
	if(IsNaN(second))
		throw "Not a number";	
	return first / second;
}

function process(first, second, operand){
	switch (operand) {
		case "Add":
			return addFunc(first, second);
		case "Subtract":
			return subFunc(first, second);
		case "Divide":
			return divFunc(first, second);	
		default:
			return mulFunc(first, second);
	}
}

