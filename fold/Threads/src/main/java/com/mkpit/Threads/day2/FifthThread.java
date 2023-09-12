package com.mkpit.Threads.day2;

public class FifthThread extends Thread{

	public void run() {
		for(int number=0;number<20;number++){
			System.out.println(getName());
		}
	}
}
