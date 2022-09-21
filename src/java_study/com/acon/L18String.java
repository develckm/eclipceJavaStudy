package java_study.com.acon;

import java.util.Objects;
import java.util.Scanner;

public class L18String {
	public static void main(String[] args) {
		//참조형 String과 리터럴 표기법
		char [] c_arr= {'안','녕'}; //선언할때 인스턴스 객체를 생성 
		char [] c_arr2= {'안','녕'};

		String s="안녕";
		String s2="안녕"; //문자열은 리터럴하게 선언하면 기존에 생성한 인스턴스 객체를 찾아서 참조
		String s3=new String("안녕");
		
		System.out.println("c_arr.length :"+c_arr.length);
		System.out.println("s.length() :"+s.length());
		
		System.out.println(c_arr==c_arr2); //두 객체는 다르기 때문에 false 
		System.out.println("\"안녕\"==\"안녕\": "+s==s2);//리털하게 선언한 두 문자열을 같은 것을 참조하기 때문에 true (js도 동일하다)
		System.out.println(s==s3);
		System.out.println(s.equals(s3));
		
		EqualsTest e1=new EqualsTest();
		EqualsTest e2=new EqualsTest();
		//e2.b=10;
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2)); //Object 필드
		
		//문자열에 유용한 함수들
		String f="banana";
		System.out.println(f.startsWith("ba"));
		System.out.println(f.endsWith("na"));
		System.out.println(f.indexOf("n"));
		System.out.println(f.lastIndexOf("n"));
		String p="010-1111-2222";
		System.out.println(p.replace("-", "_"));
		String[]p_arr=p.split("-");
		for(String p2: p_arr) {
			System.out.println(p2);
		}
		System.out.println(p.substring(4,8));
		
		
		String s4="Apple";
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());
		System.out.println(s4.toLowerCase().equals("apple"));
		
		s4= "   Apple   "; //입력값을 받아올때 or 통신 
		System.out.println(s4.trim());
		System.out.println(s4.trim().toLowerCase().equals("apple"));
		
		s4="안녕하세요! 에이콘 아카데미입니다.";
		System.out.println(s4.contains("에이컨"));
		System.out.println(s4.charAt(5));
		System.out.println( s4.charAt(5) =='!' );
		String s5=s4.concat(" 반갑습니다.");
		System.out.println(s4);
		System.out.println(s5);
		
		Scanner scanner =new Scanner(System.in);
		String line=scanner.nextLine();
		if(line=="안녕") {
			System.out.println("입력한 값을 == 비교가 true");
		}
		if(line.equals("안녕")) {
			System.out.println("입력한 값을 equals 비교가 true");
		}

		
		
		
		
	}
}

class EqualsTest extends Object{
	int a=1;
	int b=2;
	int c=3;
	@Override
	public int hashCode() {
		return Objects.hash(a, b, c);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //완전히 동일한지 비교
			return true;
		if (obj == null) 
			return false;
		if (getClass() != obj.getClass()) //두 객체가 타입이 같은지 비교
			return false;
		EqualsTest other = (EqualsTest) obj; //같으니까 형변환
		return a == other.a && b == other.b && c == other.c; 
		//모든 필드를 매개변수로 받은 객체의 필드와 비교
	}
}










