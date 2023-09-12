package com.mkpit.Threads;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FirstThreads   extends Thread {

	

	public FirstThreads(String string) {
		super(string);
	}

	

	public void run()  {
		
		 for(int number=0;number<10;number++) {
		
		int number1=  (int) (Math.random()*number*10+1);
		
		   System.out.println(number+1+"   =   "+number1);
		
		 }
	}
}
