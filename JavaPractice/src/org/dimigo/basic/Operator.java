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
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.printf("사다리꼴 넓이 : %.1f\n", res1);
		System.out.printf("평행사벼형 넓이 : %.1f\n", res2);
		
		if(res1 > res2)
		{
			System.out.printf("사다리꼴이 편행사변형 보다 %.1f 더 큽니다.", res1 - res2);
		}
		else if(res1 < res2)
		{
			System.out.printf("평행사변형이 사다리꼴 보다 %.1f 더 큽니다.", res2 - res1);
		}
		else
		{
			System.out.printf("넓이가 같습니다.");
		}
	}
}
