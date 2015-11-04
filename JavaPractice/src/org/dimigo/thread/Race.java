package org.dimigo.thread;

public class Race {
	
	public static void main(String[] args){
		System.out.println("main thread start");
		
		Thread r1 = new Runner("뚜벅이");
		Thread r2 = new Runner("cha");
		
		r1.setPriority(Thread.MAX_PRIORITY);
		r2.setPriority(Thread.MIN_PRIORITY);
		
		r1.start();
		r2.start();
		
		System.out.println("main thread end");
	}
	
}
