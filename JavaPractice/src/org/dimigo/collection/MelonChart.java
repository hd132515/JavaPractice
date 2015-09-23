package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {
	
	public static void main(String[] args){
		List<Music> music = new ArrayList<Music>();
		music.add(new Music("바람이나 좀 쐐", "게리"));
		music.add(new Music("보통연애", "박경"));
		music.add(new Music("취향저격", "iKON"));
		
		System.out.println("<멜론 차트>");
		printList(music);
		
		System.out.println("<2위곡 추가>");
		music.add(1, new Music("레옹", "이유갓지"));
		printList(music);
		
		System.out.println("<3위곡 변경>");
		music.set(2, new Music("맙소사", "황태지"));
		printList(music);
		
		System.out.println("<4위곡 삭제>");
		music.remove(3);
		printList(music);
	}
	
	public static void printList(List<Music> list){
		int i=0;
		for(Music music : list){
			System.out.println(++i + ". " + music.toString());
		}
	}
	
}
