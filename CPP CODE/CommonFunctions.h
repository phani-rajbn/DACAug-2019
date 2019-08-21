#pragma once
#include<iostream>
using namespace std;

void print(char* message){
	cout<<message<<endl;
}

double getValue(char* message){
	print(message);
	double value{};
	cin >> value;
	return value;
}


char getChar(char* message){
	print(message);
	char op;
	cin >> op;
	return op;
}
