package com.problem.statement.calculator;

public class Substraction extends  Calculator{
	private int number1;
	  private int number2;
	  public Substraction() {
		  
	  }
	  public Substraction(int number1,int number2) {
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
		int sub;
		super.setNameOfMethod(" Substraction of two number :- ");
		sub=getNumber2()-getNumber1();
		System.out.println(super.getNameOfMethod()+sub);
		return sub;
	}

}
