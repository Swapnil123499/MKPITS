package com.problem.statement.calculator;
  

abstract public class Calculator {
private String nameOfMethod;
public Calculator(){
	
}
public Calculator(String nameOfMethod) {
	this.nameOfMethod=nameOfMethod;
}
abstract public int calculationOfTwoNumber();


public String getNameOfMethod() {
	return nameOfMethod;
}
public void setNameOfMethod(String nameOfMethod) {
	this.nameOfMethod = nameOfMethod;
}

}


