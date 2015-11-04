package org.dimigo.thread;

public class Race2 {
	
	public static void main(String[] args){
		System.out.println("main thread start");
		
		Thread r1 = new Thread(new Runner2("뚜벅이"));
		Thread r2 = new Thread(new Runner2("cha"));
		
		r1.setPriority(Thread.MAX_PRIORITY);
		r2.setPriority(Thread.MIN_PRIORITY);
		
		r1.start();
		r2.start();
		
		System.out.println("main thread end");
	}
	
}
