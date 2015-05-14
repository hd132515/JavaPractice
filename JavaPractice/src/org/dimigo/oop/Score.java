package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int kor, math, eng;
		
		System.out.print("국어 점수 입력 => ");
		kor = scanner.nextInt();
		System.out.print("수학 점수 입력 => ");
		math = scanner.nextInt();
		System.out.print("영어 점수 입력 => ");
		eng = scanner.nextInt();
		
		String builtStr = new StringBuilder().append("<<점수 출력>>\n")
				.append("국어 점수 ").append(kor).append(" 점\n")
				.append("수학 점수 ").append(math).append(" 점\n")
				.append("영어 점수 ").append(eng).append(" 점\n")
				.append("총점 : ").append(kor+math+eng).append(" 점\n")
				.append("평균 : ").append(String.format("%.1f", (math+kor+eng) / 3.f)).append(" 점\n").toString();
		
		System.out.println(builtStr);
	}

}
