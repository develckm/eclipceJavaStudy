package java_study.com.acon;

import java.util.*;
import java.util.stream.*;


public class L56StreamCollect {

	public static void main(String[] args) {
		//Stream의 최종연산인 collect를 사용하자
		//collect() Collector를 구현해서 스트림의 자료를 특정 자료로 변형할 수 있다. 
		//Collectors 는 미리 구현된 Collector의 집합으로 배열과 Collections와 Map으로 변형가능하다.
		//toList,toSet,toMap,toArray,toCollection
		
		Stream<String> stream=Stream.of("홍길동","최경민","김길동","김경민","최경민","홍길동");
		
		List<String> list=stream.collect(Collectors.toList());
		System.out.println(list);
		
		Stream<String> stream2=Stream.of("홍길동","최경민","김길동","김경민","최경민","홍길동");
		Set<String> set=stream2.collect(Collectors.toSet());
		System.out.println(set);

		//key가 중복되서 지정되면 오류!
//		Stream<String> stream3=Stream.of("홍길동","최경민","김길동","김경민","최경민","홍길동");
//		Map<String,String> map=stream3.collect(Collectors.toMap((s)->"name", (s)->s));
//		System.out.println(map);
		
		Stream<String> stream4=Stream.of("홍길동","최경민","김길동","김경민","최경민","홍길동");

		
		LinkedList<String> linkedList=stream4
			//.collect(Collectors.toCollection(()->{return new LinkedList<String>();}));
			.collect(Collectors.toCollection(LinkedList<String>::new));
		System.out.println(linkedList);
		
		
		Stream<String> stream5=Stream.of("홍길동","최경민","김길동","김경민","최경민","홍길동");

		//String[] strArr=stream5.toArray(String[]::new);
		String[] strArr=stream5.toArray((int length)->{return new String[length];});
		System.out.println(Arrays.toString(strArr));
		
		
		//집계와 결합한 collect 
		//countion(),summingIn(),averageingInt(),maxBy(),minBy()
		//reducing()
		//joining()
		
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(90);
		intList.add(88);
		intList.add(77);
		intList.add(79);
		intList.add(100);
		intList.add(99);
		intList.add(95);
		int sum=intList.stream()
			//.mapToInt((Integer i)->i.intValue())
			.mapToInt((i)->i)
			.sum();
		System.out.println("성적의 총합 :"+sum);
		
		
		//summingInt((T)->return (int)T)
		int sum2=intList.stream()
			.collect(Collectors.summingInt((s)->s));
		System.out.println("성적의 총합2 :"+sum2);
		
		
		List<String> strList=new ArrayList<String>();
		strList.add("90");
		strList.add("88");
		strList.add("77");
		strList.add("79");
		strList.add("100");
		strList.add("99");
		strList.add("95");
		
		//문자열로 입력된 성적의 총합을 구하세요
		int sum3=strList.stream()
			.mapToInt((str)->Integer.parseInt(str))
			.sum();
		System.out.println("성적의 총합3 :"+sum3);
		
		int sum4=strList.stream()
			.collect(Collectors.summingInt(Integer::parseInt));
		System.out.println("성적의 총합4 :"+sum4);

		Optional<String> max=strList.stream()
			.collect(Collectors.maxBy(Comparator.comparingInt((str)->Integer.parseInt(str))));
		System.out.println(max);
		
		
		
	}
}









