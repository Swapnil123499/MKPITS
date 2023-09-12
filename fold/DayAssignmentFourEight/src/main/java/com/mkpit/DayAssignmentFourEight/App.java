package com.mkpit.DayAssignmentFourEight;



import java.util.Scanner;

import com.mkpit.DayAssignmentFourEight.intcal.InterestCalculation;
import com.mkpit.DayAssignmentFourEight.intcal.acountholder.Loan;
import com.mkpit.DayAssignmentFourEight.payment.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      /*  System.out.println( "Hello World!" );
      
       InterestCalculation calculation=new InterestCalculation();
     
       
       Loan loan=new Loan();
      
       calculation.claculateOfIntrest(loan);*/
    	
    	System.out.println("Enter the name of student and amount to paid:- ");
    	Scanner scanner=new Scanner(System.in);
    	Student student=new Student(scanner.next(), scanner.nextInt());
    	System.out.println("Enter 1 for diplay the payment :- ");
    	int number=scanner.nextInt();
    	if(number==1) {
    		student.displayPayment();
    	}
    	
    	
    	
    }
}
