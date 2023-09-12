package com.mkpit.Threads;

public class YoursThread implements Runnable{

	public void run() {
		 for(int number=0;number==0;) {
			 try {
				 System.out.println("second"+number);
		       Thread.sleep(100);
			 }
			 catch(InterruptedException e) {
				 System.out.println(e);
			 }
		 }
		
	}

}
