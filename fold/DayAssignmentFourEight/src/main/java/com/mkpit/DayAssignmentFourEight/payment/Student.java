package com.mkpit.DayAssignmentFourEight.payment;

public class Student {
  
	final static int fee=50000;
    String student_name;
   static String college_name;
   int paid;
public Student(String student_name,int paid) {
	super();
	this.student_name = student_name;
    this.college_name="Apj college of Engineering";
    this.paid=paid;
    paymentProcess();
}

public static void paymentProcess() {
	System.out.println("your payment has been done!!");
}
public  void displayPayment() {
	System.out.println("Student name:- "+student_name);
	System.out.println("College name:- "+college_name);
	System.out.println("College fee:- "+fee);
	System.out.println("Amount paid:- "+paid);
	if(fee-paid!=0) {
		System.out.println("pay "+(fee-paid)+" soon!!");
	}
	else {
		System.out.println("Payment done!!!");
	}
}
    
   
	
}
