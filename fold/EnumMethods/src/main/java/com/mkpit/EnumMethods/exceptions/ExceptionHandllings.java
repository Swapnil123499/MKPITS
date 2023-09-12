package com.mkpit.EnumMethods.exceptions;

import com.mkpit.EnumMethods.enums.Example;

public class ExceptionHandllings {

	
	
	public static void exceptionExample() {
		int arrays[]= {2,3,4,5,6,8,9,10,11,12,14};
		for(int number=0;number<=arrays.length;number++) {
			try {
				
			//System.out.println(arrays[number]);
			//int a= 24/0;
			Example example=null;
			example.enumexample();
				int input;
			System.out.println();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}catch(ArithmeticException ae) {
				System.out.println(ae);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			finally {
				System.out.println("finally block work");
			}
		
		}
		System.out.println("done");
	}
}
