package com.mkpit.Programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
       /* System.out.println( "Hello World!" );
        
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        map.put(1, 12);
        map.put(2, 13);
        map.put(4, 14);
        map.put(3, 15);
        
        map.put(111, 12);
        map.put(22, 13);
        map.put(44, 14);
        map.put(33, 15);
        
        map.put(112, 12);
        map.put(200, 13);
        map.put(41, 14);
        map.put(32, 15);
              
        map.put(19, 12);
        map.put(29, 13);
        map.put(45, 14);
        map.put(3452, 15);
       TreeMap<Integer,Integer> im= new TreeMap<Integer,Integer>(map);
        String str="swapnil jounjalkar";
        StringBuffer sb= new StringBuffer(str);
        System.out.println("*********"+sb+"**********");
        Iterator iterator=map.entrySet().iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
        */
      // System.out.println(map.toString());
      // System.out.println(map);
       /* List<Integer> list=new LinkedList<Integer>();
        list.add(25);
        list.add(24);
        list.add(29);
        list.add(255);
        list.add(2585);
        list.add(25458);
        Collections.reverse(list);
        System.out.println(list);   */
    	
    	/*try {
			BufferedWriter bw= new BufferedWriter(new FileWriter("file.txt"));
			HashMap<Integer, String> hm=new HashMap<Integer, String>();
			hm.put(1, "This is first line ");
			hm.put(2, "This is second line ");
			hm.put(3, "This is third line ");
			Iterator iterator2=hm.entrySet().iterator();
			while (iterator2.hasNext()) {
				bw.write(iterator2.next().toString());
				
			}
		//bw.write();
			bw.close();
			BufferedReader reader=new BufferedReader(new FileReader("file.txt"));
			
			System.out.println(reader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	
    	
    	
    	BufferedWriter bw= new BufferedWriter(new FileWriter("file.txt"));
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "This is first line ");
		hm.put(2, "This is second line ");
		hm.put(3, "This is third line ");
		
		  bw.write(String.valueOf(hm));
		bw.close();
		BufferedReader reader=new BufferedReader(new FileReader("file.txt"));
		
		System.out.println(reader.readLine());
    	
		
		
		List<Integer> list=new LinkedList<Integer>();
		list.add(45);
		list.add(25);
		list.add(85);
		
		synchronized (list) {
			
		 Iterator it= list.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		}
    }
}
