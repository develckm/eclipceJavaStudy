package java_study.com.acon;

import java.util.*;

public class L41TressMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		
		hashMap.put(2022, "신생아");
		hashMap.put(1900, "홍길동");
		hashMap.put(1940, "고길동");
		hashMap.put(1986, "최경민");
		hashMap.put(1960, "고길동");
		hashMap.put(2023, "미래의아이");
		hashMap.put(1986, "에이콘아카데미");

		System.out.println(hashMap); //순서가 없고 중복되지 않는 Set을 Key로하고 value를 참조하는 자료구조 
		System.out.println(hashMap.get(1960));
		
		TreeMap<Integer, String> treeMap=new TreeMap<Integer, String>(hashMap);
		
		System.out.println(treeMap);//key를 TreeSet의 이진 트리 검색 구조를 가지고 있는 자료구조
		
		Map.Entry<Integer, String> first=treeMap.firstEntry(); 
		//Map.Entry는 (Iterator)반복문을 사용하거나 key value를 한꺼번 참조하기 위해 존재하는 타입
		
		System.out.println("TreeMap.firstEntry() : "+first.getKey()+"="+first.getValue());
		System.out.println("TreeMap.lastEntry() : "+treeMap.lastEntry());
		System.out.println("TreeMap.lowerEntry(2000) : "+treeMap.lowerEntry(2000));
		System.out.println("TreeMap.tailMap(1986) : "+treeMap.tailMap(1986));

		//key가 역순으로 정렬된 Map
		NavigableMap<Integer, String> navigableMap =treeMap.descendingMap();
		System.out.println(navigableMap);
		
	}
}
