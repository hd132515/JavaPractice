package org.dimigo.basic;

public class PrimitiveDataType {
	public static void main(String[] args)
	{
		String strName = "������";
		boolean bGender = true;
		int nAge = 23;
		double rHeight = 161.8;
		float fMass = 44.3f;
		char fBloodType = 'A';
		
		System.out.println("<<������ ������>>");
		System.out.printf("�̸� : %s\n", strName);
		System.out.printf("���� : %s\n", bGender ? "����" : "����");
		System.out.printf("���� : %d��\n", nAge);
		System.out.printf("Ű : %.1f cm\n", rHeight);
		System.out.printf("������ : %.1f kg\n", fMass);
		System.out.printf("������ : %c ��\n", fBloodType);
	}
}
