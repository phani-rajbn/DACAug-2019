#pragma once
#include<iostream>
#include<string>
using namespace std;


void print(string msg) {
	cout << msg << endl;
}
//Book is a class, Library another class that contain books. 
string getString(string message) {
	string answer;
	cout << message << endl;
	cin >> answer;
	return answer;
}

int getNumber(string message) {
	int answer = 0;
	cout << message << endl;
	cin >> answer;
	return answer;
}

double getDouble(string message) {
	double answer = 0.0;
	cout << message << endl;
	cin >> answer;
	return answer;
}