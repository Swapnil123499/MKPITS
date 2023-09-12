package com.mkpit.collections;

import java.awt.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.mkpit.collections.mapexample.Task;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      /*  Vector vector=new Vector(2);
        vector.add(1562);
        vector.add(1023);
        vector.add(172);
        vector.add(1823);
        vector.add(162);
        vector.add(1253);
       // vector.addElement(122);
        System.out.println(vector.capacity()+" "+vector.size());
        vector.ensureCapacity(4);
        vector.insertElementAt(4526, 0);
       List<Integer> list=new ArrayList<Integer>();
      list= vector.subList(2, 5);
       System.out.println(list);
        System.out.println(vector.elementAt(0));
        System.out.println(vector.elementAt(0)+" "+vector.elementAt(1));
        */
       /* Integer sid=vector.size();
       Integer v[]=new Integer[sid];
       vector.copyInto(v);
        for(Integer p:v) {
        	System.out.println(p);
        }*/
       /* Stack stack=new Stack();
       stack.add(452);
        stack.add(4521);
        stack.add(854);
        stack.push(4580);
        stack.peek();
        
        System.out.println(stack);
        Set<Integer> set=new HashSet<Integer>();
        set.add(451);
        set.add(250);
        set.add(500);
        set.add(4551);
        set.add(2510);
        set.add(5002);
       
        
        
        System.out.println(set);
        */
       /* Set set1=new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set set2=new HashSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        */
        // remove element from the arrray//
       /* int array[]= {1,2,3,4,5,6};
        int newarray[]=new int[array.length-1];
        int element=2;
        for(int number=0;number<array.length;number++) {
        	if(array[number]!=element) {
        		
        		array[array.length-1]=0;
        	}
        }
        System.out.println(Arrays.toString(array));*/
        
      /*  System.out.println("Enter number for opration for the dictinary:- "
        		+ "\n "
        		+ "1=Add the word"
        		+ "\n "
        		+ "2=Display all words"
        		+ "\n "
        		+ "3=find word"
        		+ "\n "
        		+ "4=removed the word"
        		+ "\n "
        		+ "5=update the word"
        		+ "\n "
        		+ "6=Clear all words"
        		+ "\n "
        		+ "7=Exit"
        		);
        Map<Integer, String> map=new HashMap<Integer, String>();
        map.put(1, "swapnil");
        map.put(2, "vinod");
        map.put(3, "jounjalkar");
        
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        switch(number) {
        case 1:
        	Task.additionOfWords(map);
        	break;
        case 2:
        	Task.displayAll(map);
        	break;
        case 3:
        	Task.FindWord(map);
        	break;
        case 4:
        	Task.displayAll(map);
        	Integer element=scanner.nextInt();
        	
        	Task.removedWords(map, element);
        	break;
        case 5:
        	Task.displayAll(map);
        	Integer num=scanner.nextInt();
        	String element1=scanner.next();
        	Task.updateWord(map,element1, num);
        	break;
        case 6:
        	map.clear();
        	System.out.println("words has bean deleted");
        	Task.displayAll(map);
        	break;
        case 7:
        	return;
        	
        }  */
        List list=new ArrayList();
        list.add("4512");
        list.add("45");
        list.add(4525);
        list.add(412);
        list.add(451);
        list.add(455);
//        for(int number=0;number<list.size();number++) {
//        	System.out.println(list.get(number)
//        			);
//        }
//        System.out.println("*********");
//        for(int number=list.size()-1;number>=0;number--) {
//        	System.out.println(list.get(number)
//        			);
//        }
        System.out.println("*********now itarator at first************");
        ListIterator iterator=list.listIterator();
        
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
        System.out.println("**********now itarator at last********************");
        while(iterator.hasPrevious()) {
        	System.out.println(iterator.previous());
        }
        System.out.println("**********now itarator at first**************");
         CopyOnWriteArrayList cowal=new CopyOnWriteArrayList();//home work
           // NavigableMap: read
         
        
        
    }
}
