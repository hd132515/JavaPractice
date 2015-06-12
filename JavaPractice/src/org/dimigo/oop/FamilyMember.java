package org.dimigo.oop;

public class FamilyMember {
	private static int memberCnt = 0;
	private String memberName;
	
	public FamilyMember(String memberName){
		memberCnt++;
		this.memberName = memberName;
	}
	
	public String getMemberName(){
		return memberName;
	}
	
	public static int printMemberCnt(){
		return memberCnt;
	}
}
