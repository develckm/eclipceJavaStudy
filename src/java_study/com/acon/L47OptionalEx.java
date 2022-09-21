package java_study.com.acon;

import java.util.Optional;
import java.util.Scanner;

public class L47OptionalEx {
	public static void main(String[] args) {
		//Optional 성능은 별로지만 null 체크에 최선을 다하는 객체 
		//또한 null 체크를 내부적으로 하기 때문에 구현이 빠르고 유지보수에 유리하다.
		//String str=new Scanner(System.in).nextLine();
		String str="";
		//외부에서 null체크를 하면 수정이 힘들고 가독성이 떨어진다.
		if(str!=null) {
			if(str.length()>0) {
				try {
					System.out.println(Integer.parseInt(str)*3);					
				}catch(NumberFormatException e) {
					System.out.println("숫자만 입력하세요!");
				}
			}
		}
		//System.out.println(str.length());
		
		Optional<String> strOpt=Optional.ofNullable(str);
		strOpt
			.filter((s)->s.length()>0) // "aa"=>"aa" , "" => null 
			.map((s)->{ 
				//"aaa" =>오류
				try {
					return Integer.parseInt(s);										
				}catch(NumberFormatException e) {
					return null;
				}
			})
			.ifPresentOrElse((s)->{
				System.out.println((s)*3);					
			}, ()->{
				System.out.println("길이가 있는 문자열을 입력");
			});
		//Optional의 실행연기 : 값이 null이면 중간 연산(map,filter)을 무시하고 최종연산을 실행
		//lazy evaluation (게으른 연산) : 기대값을 예상하고 연산을 변경하거나 중단하는 행위 
	}
}
