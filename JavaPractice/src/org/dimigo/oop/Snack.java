package org.dimigo.oop;

public class Snack {
	
	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack(){
	}
	
	public Snack(String name, String company, int price, int number){
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	
	public void printSnack(){
		System.out.println(new StringBuilder().append("�̸� : ").append(name));
		System.out.println(new StringBuilder().append("������ : ").append(company));
		System.out.println(new StringBuilder().append("���� : ").append(String.format("%,d", price)).append("��"));
		System.out.println(new StringBuilder().append("���� : ").append(number).append("��"));
		
		System.out.println();
	}
	
	public int calcPrice(){
		return price * number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
