#include"HeaderExample.h"


Fruit createFruit(char* name){
	Fruit f;
	f.setName(name);
	return f;
}
int main() {
	//cout<<"ANother Example"<<endl;
	//TestFunc();
//	Fruit f;
//	f.setName("Apple");
//	cout<<f.getName()<<endl;

	Basket flipKart;
	/*
	Fruit f;
	f.setName("Apple");
	flipKart.AddFruit(f);
	
	Fruit f2;
	f2.setName("Mango");
	flipKart.AddFruit(f2);
	*/
	flipKart.AddFruit(createFruit("Apple"));
	flipKart.AddFruit(createFruit("Mango"));
	flipKart.AddFruit(createFruit("Orange"));
	flipKart.AddFruit(createFruit("PineApple"));
	flipKart.AddFruit(createFruit("Banana"));
	
	Fruit* allFruits = flipKart.GetAllItems();
	for(int i=0; i < 10;i++){
		cout<<(allFruits[i]).getName()<<endl;
	}
}
