package java_study.com.acon;

import java.util.*;

public class L40TreeSet {

	public static void main(String[] args) {
		int [] int_arr= {100,3,-200,100,300,3,1000,1};
		
		Set<Integer> hashSet=new HashSet<Integer>();
		//stream 반복문 사용
		Arrays.stream(int_arr).forEach((num)->{hashSet.add(num);});//IntConsumer 매개변수가 있고 리턴이 정의되지 않은 화살표함수
		
		System.out.println(hashSet); //순서가 없고 중복이 제거된 자료구조
		
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		Arrays.stream(int_arr).forEach((num)->{treeSet.add(num);});
		
		System.out.println("TreeSet :"+treeSet); //중복이 제거되고 이진트리 구조로 정렬되어 있는 자료구조 
		System.out.println("TreeSet.first() 최소값:"+treeSet.first()); //이진트리의 왼쪽 시작 
		System.out.println("TreeSet.last() 최대값:"+treeSet.last()); //이진트리의 오른쪽 끝
		System.out.println("TreeSet.lower(101) 미만:"+treeSet.lower(101)); //미만 중에 가까운 수
		System.out.println("TreeSet.floor(100) 이하:"+treeSet.floor(100)); //이하 중에 가까운 수
		System.out.println("TreeSet.ceiling(100) 이상:"+treeSet.ceiling(100));//이상 중에 가까운 수
		System.out.println("TreeSet.higher(100) 이상:"+treeSet.higher(100));//초과 중에 가까운 수
		//크고 작은 것으로 검색이 가능
		System.out.println("TreeSet.tailSet(100) 이상의 모든 값:"+treeSet.tailSet(100));//100을 꼬리로 가진 것들(이상)
		System.out.println("TreeSet.headSet(100) 미만의 모든 값:"+treeSet.headSet(100));//100을 머리로 가진 것들(미만)

		NavigableSet<Integer> navigableSet=treeSet.descendingSet(); //역순으로 정령하는 이진트리 구조
		System.out.println(navigableSet);
	}

}
