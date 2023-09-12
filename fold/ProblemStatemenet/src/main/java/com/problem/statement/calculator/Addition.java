package com.problem.statement.calculator;

public class Addition extends Calculator{
  private int number1;
  private int number2;
  
	public Addition() {
		
	}
	public Addition(int numebr1,int number2) {
		this.number1=numebr1;
		this.number2=number2;
		
	}

	@Override
	public int calculationOfTwoNumber() {
		int add;
		add=getNumber1()+getNumber2();
		super.setNameOfMethod(" Addition of two number:- ");
		System.out.println(super.getNameOfMethod()+add);
		return add;
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

	
}
