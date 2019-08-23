#pragma once
#include<iostream>
#include<string>
using namespace std;

void print(char* message) {
	cout<<message<<endl;
}

double getValue(char* message) {
	print(message);
	double value {};
	cin >> value;
	return value;
}

int getInteger(string question){
	cout<<question<<endl;
	int res{0};
	cin >> res;
	return res;
}

string getString(string question){
	cout<<question<<endl;
	string answer;
	cin>>answer;
	return answer;
}
char getChar(char* message) {
	print(message);
	char op;
	cin >> op;
	return op;
}
