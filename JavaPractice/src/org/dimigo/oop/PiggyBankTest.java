package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FamilyMember family[] = {new FamilyMember("�ƺ�"), new FamilyMember("����"), new FamilyMember("��"), new FamilyMember("������")
		};
		
		System.out.println("���� �� �ο� �� : " + FamilyMember.printMemberCnt() + "��");
		
		PiggyBank.putMoney(family[0], 10000);
		PiggyBank.putMoney(family[1], 5000);
		PiggyBank.putMoney(family[2], 2000);
		PiggyBank.putMoney(family[3], 1000);

		PiggyBank.printBalance();
		
		PiggyBank.putMoney(family[2], 1000);
		
		PiggyBank.printBalance();
	}

}
