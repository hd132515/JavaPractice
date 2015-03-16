package org.dimigo.basic;

public class PrimitiveDataType {
	public static void main(String[] args)
	{
		String strName = "아이유";
		boolean bGender = true;
		int nAge = 23;
		double rHeight = 161.8;
		float fMass = 44.3f;
		char fBloodType = 'A';
		
		System.out.println("<<아이유 프로필>>");
		System.out.printf("이름 : %s\n", strName);
		System.out.printf("성별 : %s\n", bGender ? "여자" : "남자");
		System.out.printf("나이 : %d세\n", nAge);
		System.out.printf("키 : %.1f cm\n", rHeight);
		System.out.printf("몸무게 : %.1f kg\n", fMass);
		System.out.printf("혈액형 : %c 형\n", fBloodType);
	}
}
