package java_study.com.acon;

import java.util.*;

public class L35Iterator {
	public static void main(String[]args) {
		Vector v = new Vector();
		v.add("Mon");
		v.add("Tue");
		v.add("Wen");
		v.add("Thu");
		v.add("Fri");
		v.add("Set");
		v.add("Sun");
		System.out.println("Enemeration 반복문 출력"); 
		Enumeration e=v.elements(); //과거에 Iterator (Collections에는 제외된 객체)
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		ArrayList list = new ArrayList<>();
		list.add("Mon");
		list.add("Tue");
		list.add("Wed");
		list.add("Thu");
		list.add("Fri");
		list.add("Set");
		list.add("Sun");
		System.out.println("List Iterator 반복문 출력");
		Iterator i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		ArrayList list2 = new ArrayList<>();
		list2.add("Mon");
		list2.add("Tue");
		list2.add("Wed");
		list2.add("Thu");
		list2.add("Fri");
		list2.add("Set");
		list2.add("Sun");
		
		System.out.println("List ListIterator next+privious 반복문 출력");
		ListIterator listI=list2.listIterator();
		while(listI.hasNext()) {
			System.out.println(listI.next());
		}
		//next로 끝으로 이동한 포인터를 뒤로 되돌아 올수 있는 함수
		while(listI.hasPrevious()) {
			System.out.println(listI.previous());
		}	
		
		System.out.println("Array Iteraotr 반복문 출력");	
		String [] weeks= {"Mon","Tue","Wed","Thu","Fri","Set","Sun"};
		Iterator i2=Arrays.asList(weeks).iterator(); //Iterator는 Collection에 정의되어 있다.
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
				
	}
}
