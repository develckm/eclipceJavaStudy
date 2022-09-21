package java_study.com.acon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class L52StreamIntermediate {

	public static void main(String[] args) {
		Integer[]intArr= {1,2,3,4,5,6,7,8,9,10};
		//skip(long),limit(long) : 스트림을 잘라내는 연산 
		//skip : 건너뛰는 연산 
		//limit : 길이만큼 잘라내는 연산 
		Stream<Integer> stream=Arrays.stream(intArr);
		System.out.println("skip(3)");
		stream
			.skip(3)
			.forEach(System.out::println);
		
		System.out.println("limit(5)");
		Arrays.stream(intArr)
			.limit(5)
			.forEach(System.out::println);
		
		System.out.println("skip(3).limit(5)");
		Arrays.stream(intArr)
			.skip(3)
			.limit(5)
			.forEach(System.out::println);

		//distinct(), filter(Predicate (e)->Boolean)
		Integer[]intArr2= {1,2,2,null,3,3,4,null,5,6,null,7,7,8,9,10};
		System.out.println("filter((n)->n!=null&&n>5)");
		
		Arrays.stream(intArr2)
			.filter((n)->n!=null&&n>5)
			.forEach(System.out::println);
		
		System.out.println("distinct()"); //null도 중복제거 가능!!
		Arrays.stream(intArr2)
			.distinct()
			.filter((n)->n!=null&&n<=3)
			.forEach(System.out::println);
		//sorted() : 정렬한 Stream을 반환 (Comparator가 정의되어야 사용가능 )
		
		String strArr[]= {"Car","ZZ","Cap","zz","ab","Apple","aa"};
		System.out.println("sorted()");
		Arrays.stream(strArr)
			.sorted()
			.forEach(System.out::println);
		System.out.println("sorted(String.CASE_INSENSITIVE_ORDER)");
		Arrays.stream(strArr)
			.sorted(String.CASE_INSENSITIVE_ORDER)
			.forEach(System.out::println);
		System.out.println("sorted().sorted(s.length)");
		Arrays.stream(strArr)
			.sorted()
			.sorted(Comparator.comparing((s)->((String)s).length()))
			.forEach(System.out::println);
		System.out.println("map((n)->2*n)");
		//map() :stream의 값을 변환하는 함수 
		Arrays.stream(intArr2)
			.filter((n)->n!=null)
			//.peek(System.out::println)
			.distinct()
			.map((n)->(double)(2*n) ) //기존의 값을 다른 타입으로 변경 -> 변경된 스트림으로 반환됨
			.forEach(System.out::println);
		
		
		
	}
}
