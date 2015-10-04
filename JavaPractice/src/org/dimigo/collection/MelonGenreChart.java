package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {
	public static void main(String[] args){
		Map<String, List<Music>> mapMusic = new HashMap<>();
		mapMusic.put("발라드", new ArrayList<Music>());
		mapMusic.put("댄스", new ArrayList<Music>());
		
		List<Music> ml1 = mapMusic.get("발라드");
		ml1.add(new Music("내 첫사랑", "베리굿"));
		ml1.add(new Music("또 다시 사랑", "임창정"));
		ml1.add(new Music("부산에 가면", "박진영"));
		
		List<Music> ml2 = mapMusic.get("댄스");
		ml2.add(new Music("커피", "유재환, 김예림"));
		ml2.add(new Music("다 잘될거야", "쿨"));
		
		System.out.println("------<멜론 장르별 차트>------");
		printMap(mapMusic);
		
		System.out.println("------<발라드 3위곡 변경>------");
		mapMusic.get("발라드").set(2, new Music("지우고 지워도", "차수경"));
		printMap(mapMusic);

		System.out.println("------<발라드 1위곡 삭제>------");
		mapMusic.get("발라드").remove(0);
		printMap(mapMusic);

		mapMusic.clear();
		System.out.println("------<전체 리스트 삭제>------");
		printMap(mapMusic);
	}
	
	private static void printMap(Map<String, List<Music>> map){
		int index;
		for(Map.Entry<String, List<Music>> entry : map.entrySet()){
		System.out.println("[" + entry.getKey() + "]");
		index = 1;
		for(Music value : entry.getValue()){
			System.out.println(index + ". " + value);
			index++;
		}
	}
	}

}
