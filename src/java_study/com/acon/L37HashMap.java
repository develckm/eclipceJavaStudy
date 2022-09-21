package java_study.com.acon;

import java.util.*;

public class L37HashMap {
	public static void main(String[]args) {
		//Map : key와 value가 대응되는 자료 구조 , Iterator를 바로 사용할 수 없다.(Collection를 구현X, 최상위 interface 가 Map) 
		//key는 중복될 수 없도록 set으로 구현되어 있다.
		//HashMap은 순서가 없는 자료구조
		HashMap map=new HashMap<Integer, String>();
		map.put(1986, "최경민");
		map.put(1900, "홍길동");
		map.put(1900, "고길동"); //map 자료를 등록하기 전에 key가 같은 것이 있는 지 검사(Set)하고 등록한다. 
		map.put(2000, "최경민");
		
		//Map의 key는 모든 자료형을 사요할 수 있지만 기본형+문자열을 많이 사용한다. 
		
		System.out.println(map);
		
		Set keys=map.keySet(); //key를 Set으로 반환
		System.out.println(keys);
		Iterator<Integer> keysI=keys.iterator();
		while(keysI.hasNext()) {
			Integer key=keysI.next();
			System.out.println(key+":"+map.get(key));
		}
		Set e=map.entrySet(); //key+value를 set으로 반환 =Iterator 반복문을 사용하기 위해
		System.out.println(e);
		Iterator i=e.iterator();
		while(i.hasNext()) {
			Map.Entry element=(Map.Entry)i.next();
			System.out.println(element.getKey()+":"+element.getValue());
		}
		System.out.println(map.remove(1900)); //특정 키로 삭제할 때 value가 반환
		System.out.println(map);
		System.out.println(map.remove(2022)); //없으면 null
		System.out.println(map.remove(2000, "최경민")); //키+value로 삭제할 때는 boolean 반환
		System.out.println(map);
		//Map 은 Collection 인터페이스를 구현하지 않았기 때문에 contains가 구현되지 않았다. 
		System.out.println(map.containsKey(1986));
		System.out.println(map.containsValue("최경민"));
		System.out.println(map.get(1986));
		Map<Integer,String> map2=new HashMap<Integer,String>();
		map2.put(1986,"최경민");
		System.out.println(map.equals(map2)); //equals 비교 연산을 구현하고 있다. 
		map2.put(1, "aa");
		map2.put(2, "bb");
		map2.put(3, "cc");
		System.out.println("map2.size():"+map2.size());
		
		Collection<String> values=map2.values(); //value는 중복을 허용하는 자료구조 Collection을 사용한다.
		System.out.println(values);

	}
}
