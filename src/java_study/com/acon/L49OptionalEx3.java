package java_study.com.acon;

import java.util.Optional;

public class L49OptionalEx3 {

	public static void main(String[] args) {
		
		String str="값이 있다";
		Optional<String> strOpt=Optional.ofNullable(str);
		//get()x,orElse(),orElseGet(),isPresent()x,ifPresent(),ifPresentOrElse(),orElseThrows()
		
		//orElse(처리한 값) :  Optional에서 참조한 값이 null이 아니면 그대로 반환하고 null이며 처리한 값으로 반환
		String str2=strOpt.orElse("빈데이터"); 
		System.out.println(str2);
		//데이터가 null이 아니지만 함수에 정의한 코드가 실행된다 =>오류! 
		String str3=strOpt.orElse(setNull()); 
		System.out.println(str3);
		
		String str4=strOpt.orElseGet(()->{
			System.out.println("orElseGet 문자열 좀 입력하세요!");
			return "orElseGet 빈데이터";
		});
		System.out.println(str4);
		
		String str5=strOpt.orElseGet(()->setNull());
		System.out.println(str5);
		//orElse가 함수로 정의될 경우 예기치 못한 오류가 발생할 수 있어서 사용을 꺼리는 편이다.
	}
	public static String setNull() {
		System.out.println("문자열 좀 입력하세요!!");
		return "빈데이터";
	}
}
