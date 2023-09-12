package com.mkpit.Threads;

import com.mkpit.Threads.day2.FifthThread;
import com.mkpit.Threads.day2.Sending;
import com.mkpit.Threads.day2.SixthThread;
import com.mkpit.Threads.day2.ThreadedSend;

/**
 * Threads!
 * 
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	//System.out.println(Thread.currentThread().getPriority()+" main thread number "+Thread.currentThread().getName());
    /*    FirstThreads firstThreads=new FirstThreads("shubhum");
        firstThreads.start();
        System.out.println("first last!!");
        System.out.println(firstThreads.getPriority()+" "+firstThreads.getName());
        //firstThreads.setName("chinise");
        
        System.out.println(firstThreads.getName());
       // App.main(args);
        * */
    	
    	
    	
    	/*
    	Thread.currentThread().setPriority(8);
    	// System.out.println(Thread.currentThread().getPriority());
        Thread  thread=new Thread(new YoursThread(),"chinish");
        Thread  thread2=new Thread(new YoursThread()
        		,"Indian");
        thread2.start();
        thread.setPriority(10);
        thread2.setPriority(4);
        //thread.setPriority(9);
        thread.start();
        
        
        */
    	/*
    	Thread thread=new Thread(new FirstThreads("swapnil"));
    	thread.setPriority(10);
    	Thread thread2=new Thread(new YoursThread(),"Jounjalkar");
    	Thread thread3=new Thread(new ThirdThread(),"shubhum");
    	Thread thread4=new Thread(new FourthThread(),"ankit");
    	thread2.setPriority(2);
    	//thread3.start();
    	//thread4.start();
    	thread.start();
    	//thread2.start();
      //  System.out.println(thread.getPriority());
       // System.out.println("currently running thread:- "+Thread.activeCount());
      */
    	
    	//day 2 work//
    	/*Thread thread=new Thread(new FifthThread());
    	Thread thread2=new Thread(new FifthThread());
    	   thread.start();
    	   
    	   
    	 
			thread.join();
		
    	   thread2.start();*/
    	/*Sending sending=new Sending();
    	
    	
    	ThreadedSend send=new ThreadedSend("welcome", sending);
    	ThreadedSend send2=new ThreadedSend("Byy  by", sending);
    	send.start();
    	send2.start();
    	*/
    	
    	Thread thread=new  Thread(new SixthThread());
    	thread.start();
    	synchronized (thread) {
    		thread.wait();
    		
		}
    	
    
    }
}
