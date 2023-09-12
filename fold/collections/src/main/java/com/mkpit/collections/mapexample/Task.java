package com.mkpit.collections.mapexample;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task {

	
	public static Map<Integer, String> additionOfWords(Map<Integer, String> map){
		Task.displayAll(map);
		Scanner scanner=new Scanner(System.in);
	    
	    boolean b=true;
		while (b) {
			System.out.println("Enter the number of word or 50000 for exit: ");
			int number=scanner.nextInt();
			if(number==50000) {
				break;
			}
			System.out.println("Enter the word here: ");
			String value=scanner.next();
			map.put(number, value);
			
		}
		
		return map;
	}
	
	public static Set displayAll(Map<Integer, String> map){
		Set setMap= map.entrySet();
		System.out.println(map);
		
		return  setMap;
	}
	
	public static String FindWord(Map<Integer, String> map) {
		Task.displayAll(map);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Kay of the word: ");
		Integer kay=scanner.nextInt();
	     String word=	map.get(kay);
	   if(word!=null)
		   System.out.println(word);
	   if(word==null)
		   System.out.println("there is no word");
	   
		return word;
	}
	
	public static void removedWords(Map<Integer, String> map,Integer element) {
		if(map.containsKey(element))
		map.remove(element);
		if(map.containsKey(element)) 
			System.out.println("Value not in dictinary: ");
		Task.displayAll(map);
	}
	
	public static void updateWord(Map<Integer, String>map, String word, Integer kay) {
		
		map.replace(kay, word);
		Task.displayAll(map);
	}
}
