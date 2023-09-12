package com.mkpit.laboda;

import java.lang.annotation.Annotation;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
       
       
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number from 1 to 4");
           
        switch(scanner.nextInt()) {
        case 1:
        	System.out.println("Enter two number");
        	new Additions().addTwoNumber(scanner.nextInt(), scanner.nextInt());
        	break;
        case 2:
        	System.out.println("Enter two number");
        	new Substraction().subTwoNumber(scanner.nextInt(), scanner.nextInt());
       
        	break;
        case 3:
        	Multiplication multi= new Multiplication();
        	System.out.println("Enter two number");
        	multi.multi(scanner.nextInt(), scanner.nextInt());
        	break;
        case 4:
        	System.out.println("Enter two number");
        	Division division=new Division();
        	division.dividingTwoNumber(scanner.nextInt(), scanner.nextInt());
        	break;
        	
        	
        }
        
        FuctionalInterface1 interface3=new FuctionalInterface1() {
			
			@Override
			public void calculation(int number1, int number2) {
				System.out.println("done");
				
			}
		};
		interface3.calculation(45, 10);
        		
        
		
		
    }
}
