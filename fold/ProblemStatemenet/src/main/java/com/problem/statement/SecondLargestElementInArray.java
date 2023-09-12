package com.problem.statement;

import java.util.*;
import java.lang.*;


public class SecondLargestElementInArray {
/*1 java programe to find the duplicate value of integer value.*/
	/*public void duplicateNumber() {
		int array[]= {1,2,3,4,5,6,7,8,9,5,6,7,1};
		
		 Set<Integer> set= new HashSet<Integer>();
		int length=array.length;
		for(int number=0;number<array.length;number++)
		{
			for(int number1=number+1;number1<length;number1++) {
				if(array[number]==array[number1]) {
					array[number]=array[length-1];
					set.add(array[number1]);
					number--;
					length--; 
				}
			}
		}
	System.out.println(set);
	}*/
	/*2.java programe to fine the duplicate value of String array*/
	/*public void duplicateStrings() {
		int []number= {0, 1, 0, 1, 1, 0};
		Arrays.parallelSort(number);
		System.out.println(Arrays.toString(number));
	}*/
	public void sortingTheArray(int array[]) {
		/* sort*/
		/*Algorithem of arrays are
		 * int array[]={2,1,4,5,7,8,9};
		 *    
		 * */
		int array2[]=array;
		int numberAtIndexOne,nextNumberIndex,swappingNumber;
		for(int num=0;num<array2.length;num++) {
			for(int num2=0;num2<array2.length;num2++) {
				if(array2[num]>array2[num2]) {
					swappingNumber=array2[num];
					array2[num]=array2[num2];
					array2[num2]=swappingNumber;
				}
			}
		}
		System.out.println(Arrays.toString(array2));
		
		
		/*end  sort*/
		/*bubble sort started*/
		int array3[]=array;
		for(int number1=0;number1<array3.length;number1++) {
			for(int number2=0;number2<array3.length-1-number1;number2++) {
				if(array3[number2]>array3[number2+1]) {
					swappingNumber=array3[number2];
					array3[number2]=array3[number2+1];
					array3[number2+1]=swappingNumber;
				}
				
			}
		}
		System.out.println("The Bubble sort is:-");
		System.out.println(Arrays.toString(array3));
		/*bubble sort ended*/
		/*Selection sort started*/
		int array4[]=array;
		for(int number1=0;number1<array4.length;number1++) {
			for(int num2=number1+1;num2<array4.length-number1;num2++) {
				if(array4[number1]>array4[num2]) {
					swappingNumber=array4[number1];
					array4[number1]=array4[num2];
					array4[num2]=swappingNumber;
				}
			}
		}
		System.out.println("linear sort is:-");
		System.out.println(Arrays.toString(array4));
		/*Selection sort ended*/
	}
	public void linearSearch(int array[]) {
		System.out.print("Enter the number:-");
		Scanner scanner=new Scanner(System.in);
		int number= scanner.nextInt();
		boolean value=false;
		System.out.println("--------------------------");
		System.out.println("index_number  value");
		System.out.println("--------------------------");
		for(int itrate=0;itrate<array.length;itrate++) {
			if(number==array[itrate]) {
				
				System.out.println(itrate+"              "+array[itrate]);
				value=true;
			}
		}
		if(value==false) {
			System.out.println("The value not found in given string");
		}
		System.out.println("--------------------------");
		
	}
	public static boolean isFound() {
		return true;
	}
	/*binary search started*/
	public static int binarySearch(int array5[], int number) {
		int min,max,mid;int count=0;
		min=0;
		max=array5.length-1;
		mid=(min+max)/2;
		while(min<max) {
			if(number==array5[mid]) {
				System.out.println("value found in a array");
				count++;
				return count;
				
			}
			else if(number<array5[mid]) {
				max=mid;
				mid=(max+min)/2;
			}
			else {
				min=mid;
				mid=(min+max)/2;
			}
		}
		
		
		if(count==0) {
			System.out.println("Value not found in array.");
		}
		
		return count;
	}
	/*binary search ended*/
	
}
