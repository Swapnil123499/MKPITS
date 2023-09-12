package com.problem.statement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problems {
  public void removeDuplicateNumberFromTheArray() {
	  int array[]= {1,2,3,4,5,3,4,5,6,7,8,9};
	  Set<Integer> set=new HashSet<Integer>();
	  System.out.println("The original array is=>"+Arrays.toString(array));
	  int  arrayLength=array.length;
	  for(int number=0;number<arrayLength;number++) {
		  for(int number1=number+1;number1<arrayLength;number1++) {
			  if(array[number]==array[number1]) {
				  array[number]=array[arrayLength-1];
				  arrayLength--;
				  number1--;
				  number--;
				  
			  }
			  set.add(array[number1]);
		  }
	  }
	  
	  System.out.println("The sorted array=>"+set);
  }
}
