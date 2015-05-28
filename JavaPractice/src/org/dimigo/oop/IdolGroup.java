package org.dimigo.oop;

public class IdolGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] idolGroup = {"ºò¹ð", "2NE1", "°É½ºµ¥ÀÌ"};
		String[][] members = {
			{"GD", "ÅÂ¾ç", "´ë¼º", "Å¾", "½Â¸®"},
			{"CL", "Sandara Park", "Park Bom", "Minji"},
			{"Yura", "Hyeri", "Soju", "MinA"}
		};
		
		int i = 0;
		for(String strIdolGroup : idolGroup){
			System.out.println("<< " + strIdolGroup + "¸É¹ö >>");
			for(int j=0;j<members[i].length;j++){
				System.out.println(members[i][j]);
			}
			i++;
			System.out.println();
		}
	}

}
