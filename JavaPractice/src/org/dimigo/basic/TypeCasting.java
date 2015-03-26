package org.dimigo.basic;

public class TypeCasting {
	public static void main(String[] args)
	{
		int a = 1700000;
		int iJikwon = 3;
		int iJumpo = 1500;
		long lSum = (long)a * 12 * iJikwon * iJumpo;
		
		System.out.println("<<��̺��� ���� �ΰǺ�>>");
		System.out.printf("�� ��� �޿� : %s��\n", String.format("%,d", a));
		System.out.printf("���� �� ���� �� : %d��\n", iJikwon);
		System.out.printf("���� �� : %s��\n", String.format("%,d", iJumpo));
		
		System.out.printf("���� �ΰǺ� : %s��", String.format("%,d", lSum));
	}
}
