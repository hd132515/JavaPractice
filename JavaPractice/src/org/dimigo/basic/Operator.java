package org.dimigo.basic;

public class Operator {
	public static void main(String[] args)
	{
		int a1 = 9, b1 = 10;
		double h1 = 5.8;
		double res1;
		
		int a2 = 9;
		double h2 = 5.4;
		double res2;
		
		res1 = (double)((a1 + b1) * h1)/2;
		res2 = (double)a2 * h2;
		
		System.out.println("<< ���� ���� �� >>");
		System.out.printf("��ٸ��� ���� : %.1f\n", res1);
		System.out.printf("����纭�� ���� : %.1f\n", res2);
		
		if(res1 > res2)
		{
			System.out.printf("��ٸ����� ����纯�� ���� %.1f �� Ů�ϴ�.", res1 - res2);
		}
		else if(res1 < res2)
		{
			System.out.printf("����纯���� ��ٸ��� ���� %.1f �� Ů�ϴ�.", res2 - res1);
		}
		else
		{
			System.out.printf("���̰� �����ϴ�.");
		}
	}
}
