package com.mkpit.Threads;

public class FourthThread implements  Runnable {

	@Override
	public void run() {
		 for(int number=0;number<200;number++) {
			 System.out.println("fourth:-"+number);
		 }
		
	}
	
}
