package org.dimigo.basic;

public class Condition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cType = 1;//1:고속버스 2:경차 3:그외
		int d = 10;
		int fee = 0;
		
		switch(cType)
		{
		case 1:
			fee = 850;
			fee += ((d/10)-1)*300;
			break;
		case 2:
			fee = 300;
			fee += ((d/10)-1)*200;
			break;
		default:
			fee = 600;
			fee += ((d/10)-1)*200;
			break;
		}
		
		System.out.println("<<고속도로 통행료 계산>>");
		System.out.println("거리 : " + d + "km");
		System.out.println("차종 : " + ((cType == 1) ? "고속버스" : ((cType == 2) ? "경차" : "그 외")));
		System.out.println("통행료 : " + fee);
	}

}
