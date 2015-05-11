package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아라코의 아침 메뉴는?");
		String answer1 = scanner.nextLine();
		if("큐브고기".equals(answer1)){
			System.out.println("정답!!!!!!!!!!!!");
		}
		
		System.out.println();
		
		System.out.println("아라코의 점심 메뉴는?");
		String answer2 = scanner.nextLine();
		if("꼬치우동".equals(answer2)){
			System.out.println("정답!!!!!!!!!!!!");
		}

		System.out.println();
		
		System.out.println("아라코의 저녁 메뉴는?");
		String answer3 = scanner.nextLine();
		if("큐브고기".equals(answer3)){
			System.out.println("정답!!!!!!!!!!!!");
		}
		
		scanner.close();
	}

}
