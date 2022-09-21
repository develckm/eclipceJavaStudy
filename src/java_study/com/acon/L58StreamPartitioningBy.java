package java_study.com.acon;

import java.util.*;
import java.util.stream.*;


public class L58StreamPartitioningBy {

	public static void main(String[] args) {
		Object [] intArr= {13,"44",0,"111",33,"20"};
		
		String s="13";
		System.out.println(s instanceof String); //객체의 타입을 배교하는 연산
		int i=13;
		//System.out.println(i instanceof Integer); //기본형은 instanceof 를 사용할 수 없다.
		System.out.println( s.getClass() == new String().getClass() ); //객체가 특정 객체와 같은 타입인지 비교
		//Collectors.partitioningBy((T)->Boolean) : 조건이 맞는 그룹과 맞지 않는 그룹으로 나누어서(Map<Boolean,List<T>>) 반환 
		Map<Boolean,List<Object>> map=Arrays.stream(intArr)
			.collect(Collectors.partitioningBy((Object o)->{return o instanceof String;}));
		System.out.println(map);
		System.out.println(map.get(true));
		System.out.println(map.get(false));
		
		Object [] objArr= {13,true,1.33,"44",0,false,"111",33,"20",33.33}; //정의된 기본형은 참조형으로 형변환되어 있다.

		//타입명으로 groupingBy() 해보세요!
		String type=(objArr[0].getClass().toString());//13은 기본형이라 필드가 없어야하지만 존재한다. : 참조형으로 형변환 되어 있다.
		int lastDot=type.lastIndexOf(".");
		String className=type.substring(lastDot+1);
		
		System.out.println(className);
		Map<String,List<Object>> objMap=Arrays.stream(objArr)
			.collect(Collectors.groupingBy((Object o)->{
				String typeName=o.getClass().toString();
				int lastDotIndex=typeName.lastIndexOf(".");
				return typeName.substring(lastDotIndex+1);
			}));
		System.out.println(objMap);
		System.out.println(objMap.get("Integer"));
		
		String str="010-1111-111";
		String [] strSprit=str.split("-");
		System.out.println(Arrays.toString(strSprit));
		System.out.println(strSprit[strSprit.length-1]);
	}
}
