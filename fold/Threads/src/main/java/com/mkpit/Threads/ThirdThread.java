package com.mkpit.Threads;

public class ThirdThread implements Runnable{

	@Override
	public void run() {
		 for(int number=0;number<200;number++) {
			 System.out.print("third"+number);
		 }
		
	}

}
