package java_study.com.acon;

import java.util.*;
import java.util.function.Consumer;
public class L19ArrayList {
	public static void main(String []args) {
		//배열인데 배열을 지원하는 필드가 다수 포함된 배열
		//<>제네릭 : 객체의 필드를 특정한 타입으로 명시하는 방법 
		//<Object>=> Object 모든 타입 부모기 때문에 모든 객체를 참조할 수 있다.
		List<Object> list=new ArrayList<Object>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(true);
		list.add(10.001);
		list.add(new L19ArrayList());
		System.out.println(list.get(2));
		//System.out.println(list.get(4));//IndexOutOfBoundsException
		System.out.println(list);
		Object o=list.get(5);
		//제네릭으로 기본형은 작성할 수 없다. 대신 랩퍼 클래스를 작성해야한다.
		//ArrayList<int> list3=new ArrayList<int>();
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(10);
		//list2.add("10"); //제네릭으로 지정한 타입만 가능
		//list2.add(10.001);
		list2.add(0, 60);
		//list2.add(5, 60);//오류   //js: [10,null,null,null,null,60]
		list2.add(null); //제네릭의 타입이 무조건 참조형이기 때문에 null을 사요할 수 있다. 
		System.out.println(list2);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+": "+list.get(i));
		}
		System.out.println("향상된 for");
		for(Object e:list) {
			System.out.println(e);
		}
		
		System.out.println("Iterator 를 이용한 반복문");
		Iterator it =list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//System.out.println(it.next());//NoSuchElementException
		
		System.out.println("collections foreach");
		
		list.forEach(new Consumer<Object>() {
			@Override
			public void accept(Object t) {
				System.out.println(t);
			}
		});
		System.out.println("colections foreach 람다식");
		//자바에서 사용하는 static sugar 함수를 매개변수로 사용하는 척 하는 문법
		list.forEach((Object t)->{
			System.out.println(t);
		});
		
		
		int list_0=list2.get(0);
		
		
		int i=10;
		//System.out.println(i.);
		Integer instance_i=i; //랩퍼 클래스틑 기본데이터 타입을 참조할 수 있다.
		System.out.println(instance_i.doubleValue());
		i=instance_i;

	}
	void forEach(String s ) {
		
	}
}
