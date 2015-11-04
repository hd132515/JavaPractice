package org.dimigo.thread;

public class Runner extends Thread{
	private String name;
	
	
	public Runner(){
	}
	
	public Runner(String name){
		this.name = name;
	}
	
	public void run(){
		int remainedDistance = 100;
		
		System.out.println(name + "출발");
		
		for(;remainedDistance >= 0; remainedDistance-=10){
			try {
				System.out.println(name + " : " + remainedDistance);
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(name + "꼬린");
	}
}
