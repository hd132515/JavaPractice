package org.dimigo.oop;

public class IdolGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] idolGroup = {"���", "2NE1", "�ɽ�����"};
		String[][] members = {
			{"GD", "�¾�", "�뼺", "ž", "�¸�"},
			{"CL", "Sandara Park", "Park Bom", "Minji"},
			{"Yura", "Hyeri", "Soju", "MinA"}
		};
		
		int i = 0;
		for(String strIdolGroup : idolGroup){
			System.out.println("<< " + strIdolGroup + "�ɹ� >>");
			for(int j=0;j<members[i].length;j++){
				System.out.println(members[i][j]);
			}
			i++;
			System.out.println();
		}
	}

}
