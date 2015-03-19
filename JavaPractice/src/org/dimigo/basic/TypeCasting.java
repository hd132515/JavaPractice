package org.dimigo.basic;

public class TypeCasting {
	public static void main(String[] args)
	{
		int a = 1700000;
		int iJikwon = 3;
		int iJumpo = 1500;
		long lSum = (long)a * 12 * iJikwon * iJumpo;
		
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 편균 급여 : %s원\n", String.format("%,d", a));
		System.out.printf("점포 내 직원 수 : %d명\n", iJikwon);
		System.out.printf("점포 수 : %s개\n", String.format("%,d", iJumpo));
		
		System.out.printf("연간 인건비 : %s원", String.format("%,d", lSum));
	}
}
