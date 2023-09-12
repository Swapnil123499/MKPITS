package com.mkpit.Threads.day2;

public class ThreadedSend extends Thread{
	private String massage;
	Sending sending;
	public ThreadedSend(String massage,Sending sending) {
		this.massage=massage;
		this.sending=sending;
	}

	public void run() {
		//synchronized (sending) {
			sending.send(massage);
			
		//}//
		
			
			
		}
		
	
}
