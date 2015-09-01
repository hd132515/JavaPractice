package org.dimigo.abstractclass;

public class SmartPhoneTest {
	public static void main(String[] args){
		SmartPhone[] phone = new SmartPhone[]{
				new IPhone("iPhone 6", "애플", 700000), new Galaxy("갤럭시 S6", "삼성", 650000)};
		
		
		for(SmartPhone elem : phone){
			System.out.println(elem);
			elem.turnOn();
			elem.pay();
			elem.useSepecialFunction();
			elem.turnOff();
			
			System.out.println();
		}
	}
}
