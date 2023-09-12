package com.mkpit.Threads.day2;

public class SixthThread extends Thread {
  int total;
	public void run() {
		synchronized (this) {
			
		
		for(int number=0;number<5;number++) {
			
			total +=number;
			
		}
		System.out.println(total);
		notify();
		
		}
	}
}
