package com.mkpit.laboda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrincipleEvenNumber {

	public static void main(String[] args) {
		Runnable runnable= new Runnable() {
			 
			@Override
			public void run() {
				System.out.println("******************************************");
				System.out.println("Even number is");
				System.out.println("******************************************");
				int number=0;
				while(number<=20)
				{
					if(number%2==0)
						System.out.println(number);
					
					number++;
				}
				
			}
		};
		runnable.run();
		System.out.println("*****************************");
		System.out.println("odd number is:-");
		System.out.println("*****************************");
		 Runnable runnable3=()->{

		 for(int numb=0;numb<21;numb++) {
			 if(!(numb%2==0))
			 System.out.println(numb);
		 }
			 System.out.println("**********************************");
		 };
		 runnable3.run();
		 System.out.println("**************************************");
		 Set<Integer> list=new HashSet<Integer>();
		   list.addAll(Arrays.asList(45,52,63,89,79));
		   
		  list.forEach((value)->
		  {  System.out.println(value);
		  });
	}
}
