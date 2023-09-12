package com.mkpit.EnumMethods.enums;

import java.util.Scanner;

public class Example {
	enum Months{JANUARY(31),FEBRUARY(28),MARCH(31),APRIL(30),MAY(31),JUN(30),JULY(31),AUGUST(31),SUBTEMBER(30),AUCTOMBER(31),NOVEMBER(30),DECEMBER(31);
		int Value;
		Months(int Value){
			this.Value=Value;
		}	
	
	}
	
public void enumexample() {
	/*Months j=Months.JUN;
		System.out.println(j);*/
		Scanner scanner=new Scanner(System.in);
	      String name=  scanner.next();
	      switch(name) {
	      case "JANUARY":
	      case "MARCH":
	      case"MAY":
	      case "JULY":
	      case "AUGUST":
	      case "AUCTOMBER":
	      case "DECEMBER":
	    	  System.out.println("The Month "+name+" "+Months.DECEMBER.Value+" days");
	    	  break;
	      case "FEBRUARY":
	    	  System.out.println("The Month "+name+" "+Months.FEBRUARY.Value+" days");
	    	  break;
	      default :
	    	  System.out.println("The Month "+name+" "+Months.JUN.Value+" days");
	      }
	      System.out.println("Loop in the enum:-");
	      for(Months m:Months.values()) {
	    	  System.out.println(m);
	      }
	}
}
