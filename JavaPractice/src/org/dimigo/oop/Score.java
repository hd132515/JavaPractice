package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int kor, math, eng;
		
		System.out.print("���� ���� �Է� => ");
		kor = scanner.nextInt();
		System.out.print("���� ���� �Է� => ");
		math = scanner.nextInt();
		System.out.print("���� ���� �Է� => ");
		eng = scanner.nextInt();
		
		String builtStr = new StringBuilder().append("<<���� ���>>\n")
				.append("���� ���� ").append(kor).append(" ��\n")
				.append("���� ���� ").append(math).append(" ��\n")
				.append("���� ���� ").append(eng).append(" ��\n")
				.append("���� : ").append(kor+math+eng).append(" ��\n")
				.append("��� : ").append(String.format("%.1f", (math+kor+eng) / 3.f)).append(" ��\n").toString();
		
		System.out.println(builtStr);
	}

}
