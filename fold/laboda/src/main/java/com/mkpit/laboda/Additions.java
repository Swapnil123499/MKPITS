package com.mkpit.laboda;

public class Additions {
	
	public void addTwoNumber(int num1,int num2) {
		FuctionalInterface1 fuctionalInterface1=(number1,number2)->{
			System.out.println(number1+number2);
		};
		fuctionalInterface1.calculation(num1, num2);
	}

}
