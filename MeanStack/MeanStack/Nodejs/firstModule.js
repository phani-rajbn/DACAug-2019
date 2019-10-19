module.exports = (function(){
	var cart = [];
	//functions are private to the module....
	function addToCart(item){
		cart.push(item);
	}

	function getAllItems(){
		return cart;
	}

	//the return object is the actual module object....
	return{
		addToCart : addToCart,
		getAllItems : getAllItems
	}
})();//This is called Anonymous Module. 