package com.problem.statement.calculator;

public class Multiplication extends Calculator {
	private int number1;
	private int number2;
	

	public Multiplication() {
	
	}

public Multiplication(int number1,int number2) {
	this.number1=number1;
	this.number2=number2;
}
	


	public int getNumber1() {
		return number1;
	}


	public void setNumber1(int number1) {
		this.number1 = number1;
	}


	public int getNumber2() {
		return number2;
	}


	public void setNumber2(int number2) {
		this.number2 = number2;
	}


	@Override
	public int calculationOfTwoNumber() {
		int mul;
		super.setNameOfMethod(" Multiplication of two number is :- ");
		mul=getNumber1()*getNumber2();
		System.out.println(super.getNameOfMethod()+mul);
		return mul;
	}

}
