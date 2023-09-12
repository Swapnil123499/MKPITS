package com.problem.statement.calculator;

public class Modulus extends Calculator{
	
	private int number1;
	private int number2;
	public Modulus() {
		
	}
	public Modulus(int number1,int number2) {
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
		int mod;
		super.setNameOfMethod("Modulus of two number :- ");
		mod=getNumber1()/getNumber2();
		System.out.println(super.getNameOfMethod()+mod);
		return mod;
	}

}
