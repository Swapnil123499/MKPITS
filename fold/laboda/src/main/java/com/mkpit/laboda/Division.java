package com.mkpit.laboda;

public class Division {

	
	public void dividingTwoNumber(int number1,int number2) {
		FuctionalInterface1 fuctionalInterface1=(num1,num2)->{
			System.out.println(num1/num2);
		};
		fuctionalInterface1.calculation(number1, number2);
		
	}
}
