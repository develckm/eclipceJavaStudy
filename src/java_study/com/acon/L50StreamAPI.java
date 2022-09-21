package java_study.com.acon;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class L50StreamAPI {

	public static void main(String[] args) {
		//StreamAPI
		//1.모든 자료구조를 동일한 방식으로 반복문을 실행하기 위해 등장 =>유지보수 
		//2.Optional 처럼 외부에서 반복문(for,while)을 처리하는 방식을 내부적으로 수행 =>유지보수,구현시간단축
		//3.스트림은 iterator 처럼 참조하지 않고 반복문의 흐름을 이용하기 때문에 속도가 일정하고 일회성이다. => (흐름==Stream)
		//4.기존 자료를 수정하지 않는다.(자료를 stream 객체로 반환해서 사용하기 때문)Arrays(new int[]{1,2,3}).stream() => IntStream
		//5.다양한 반복문을 제공한다.(중간연산 포함)
		//6.기본형(int,double,long) Stream을 제공한다. => 성능을 향상시킬수 있다.(참조형이 더 용량이 크다,연산시 형변환하는 일을 줄인다.)
		//7.병렬처리(스레드생성)가 가능하다 => 일의 능률을 올린다.(시간 단축)
		//8.lazy 연산 처리를 한다. 
		//9.함수형 반복문 (람다식이 구현됨, js 문법을 그대로 사용)
		
		//Stream  면접
		//Stream이 무엇인가요?? 반복문 Stream or 통신에서 사용하는 Stream 개념
		
		Integer[] obj_arr={1,10,10,300,300,10};
		Stream<Integer> stream=Arrays.stream(obj_arr);
		
		stream
			.map((obj)->obj+1)
			.forEach((obj)->{
				System.out.println(obj);
			});
		System.out.println(Arrays.toString(obj_arr));
		
		Stream<Integer> strema2=Arrays.stream(obj_arr);
		
		Optional<Integer> intOpt =strema2
				.distinct()
				.filter((i)->i<100)
				.reduce((i,i1)->i+i1); //각요소를 실행하면서 하나의 요소로 줄이는 함수
		System.out.println(intOpt.get());
		
		System.out.println(Arrays.toString(obj_arr));
	}
}




