//Common.js
function $(id) {
	return document.getElementById(id);
}

function click(id, func){
	$(id).addEventListener('click', func);
}

function editClick(collection, func){
	for (var i = 0; i < collection.length; i++) {
		var element = collection[i];
		element.addEventListener('click', func);
	}
}