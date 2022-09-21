package java_study.com.acon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class L45Optional {

	public static void main(String[] args) {
		//Optional은
		
		Integer instance_i=null;
		//개발단에서 하는 예외 처리
		if(instance_i!=null) {
			int i=(int)instance_i; //NullPointerException : null 정수로 형변환 불가
			System.out.println(i);			
		}else {
			System.out.println("null은 기본형이 될수 없다.");
		}
		
		String str="아아아아"; 
		if( str!=null && str.length()>0) {
				try {
					int i=Integer.parseInt(str); //NumberFormatException null,"","a" 정수로 형변환 불가										System.out.println(i*2);
				}catch (Exception e) {
					System.out.println("0~9까지 문자의 조합인 문자열만 입력하세요.");
				}
		}else {
			System.out.println("null 과 \"\" 길이가 없는 문자열은 정수가 될 수 없습니다.");
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(13));
		list.add(123);
		list.add(-1);
		list.add(null);
		list.add(36);
		list.add(136);
		list.add(122);
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			Integer v=list.get(i);
			if(v==null) {
				list.set(i, 0);
			}
		}
		list.sort(Comparator.reverseOrder()); //Integer Comparable이 정의되어 있어서 사용가능
		System.out.println(list);
		
		//이런 null 처리를 도와주는 랩퍼클래스 Optional (모든 타입을 참조가능)
		
		String num_str="13";
		Optional<String> optVal=Optional.empty(); //기본 Optional 선언
		//optVal=Optional.of(num_str); //Optional.of() : null이 아닌 값을 Optional로 참조하는 함수
		optVal=Optional.ofNullable(num_str); //Optional.ofNullable() : null일수도 있는 값을 Optional로 참초하는 함수
		
		//orElse(T) :값이 null이면 반환하는 값을 정의 
		System.out.println("optVal.orElse(\"Empty\") : "+optVal.orElse("Empty"));
		//orElseGet(Supplier) :값이 null이면 반환하는 값을 지정하는 함수를 정의 
		System.out.println("optVal.orElseGet(()->\"empty\") :"+optVal.orElseGet(()->"empty"));
		System.out.println(optVal);
		
		//ifPresent(Consumer) :값이 null이면 실행하는 함수를 정의
		optVal
			.ifPresent((s)->{System.out.println(Integer.parseInt(s)*3);}); //최종연산만 있는 상태
		
		optVal
			.filter((s)->s.length()>0)
			.ifPresent((s)->{System.out.println(Integer.parseInt(s)*3);}); //중간연산 1개가 있는것
		
		optVal
			.filter((s)->s.length()>0)
			.map(Integer::parseInt)
			.ifPresent(System.out::println); //중간연산 2개있고 함수표현식
		
		//Optional 은 중간연산 map : 기존의 값을 바꾸는 함수, filter : 값을 조건으로 거르는 함수 (Optional을 반환하기 때문에 중간연산이 가능)
		optVal
			.filter((s)->s.length()>0)
			.map(Integer::parseInt)
			.ifPresentOrElse((i)->{System.out.println(i*3);}, ()->{System.out.println(0);});
	}
}



