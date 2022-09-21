package java_study.com.acon;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class L44MethodReference {
	public static void main(String[] args) {
		//람다식을 메소드참조로 줄여작성하기! (람다식만 메서드 참조사용 가능)
		Function<String, Integer> parseInt= s->Integer.parseInt(s);
		
		System.out.println(parseInt.apply("999")*3);
		
		Function<String, Integer> parseInt2= Integer::parseInt;
		
		System.out.println(parseInt.apply("888")*3);
		
		BiPredicate<String, String> strEquals=( s,s1)-> s.equals(s1);
		
		System.out.println(strEquals.test("안녕",new String("안녕")));
		
		BiPredicate<String, String> strEquals2=String::equals;
		
		Supplier<Integer> randomInt=()->(int) (Math.random()*10); 
		//메서드 참조는 컴파일러가 해석할 수 있는 정도의 복잡도만 허락한다.
		
		System.out.println(randomInt.get());
		
		//Supplier<Integer> randomInt2=(int)Math::random*10;
		new String();
		//정수를 문자열 객체로 변환하는 함수 생성 
		Function<char[], String> parseStr=(c_arr)-> new String(c_arr);
		
		System.out.println(parseStr.apply(new char[]{'a','b','c'})+6);
		
		Function<char[], String> parseStr2=String::new;
		
		System.out.println( parseStr2.apply(new char[] {'a','p','p','l','e'})+" 원숭이");
	
		//매개변수가 3개인데 함수를 실행할때 순서대로 매개변수를 전달하고 실행 (가능) 
		BiFunction<Integer, Integer, List<Integer>> makeList=Arrays::asList;
		System.out.println(makeList.apply(30, 50));
		
	}
}



