package java_study.com.acon;
import java.lang.*;
//java가 컴파일될때 무조건 import되는(자동) 패키지 =>import된 패키지의 class를 사용가능 
//기본데이터타입의 랩퍼클래스, 시스템(콘솔),class,Object ..등이 있다. 

//java_study.com.acon.User type을 명시 
class User{
	//type의 전역에 변수를 선언하면 객체 생성시 필드로 정의된다.
	String name="최경민";
	String id="develckm";
	int age=37;
}

//String name="경민"; //class 밖에서는 아무것도 작성할 수 없다. 
public class L03Type {
	public static void main(String[]args) {
		//java_study.com.acon.User u=new java_study.com.acon.User(); 
		//같은 패키지 안에서 선언하거나, import된 class의 이름이 중복되지 않으면 생략할 수 있다. 
		User u=new User();
		System.out.println(u);//js 처럼 객체명세서(json)가 출력되지 않는다. toString()재정의 할 수 있다.
		System.out.println(u.name);
		System.out.println(u.age);
		System.out.println(u.id);
		//new 연산자로 타입의 생성자를 호출하면 참조형 객체가 생성된다.
		//참조형 : data를 참조하기 때문에 참조형 ( . 필드접근자로 참조할 수 있는 data가 있는 것) 
		//참조형은 변수의 type으로 class,Interface,abstract class(==type) 를 명시한다.(대문자로 시작)
		
		int i=10;
		//System.out.println(i.); // . 필드접근자로 참조할 수없는 data: 기본형 
		//기본형은 꼭 리터럴하게 선언해야한다. => 리터럴하게 선언한다고 모두 기본형은 아니다. ("",[] : 참조형)
		//기본형은 data가 memory를 바로 참조한다.  
		//기본형는 소문자로 type을 명시한다. 
		String s=new String("안녕");
		String s2="안녕";
		String s3="안녕"; //s3는 s2와 같다.(같은 문자열을 참조한다.)
		//문자열은 참조형이지만 리터럴한 표기법을 지원한다.
		//리터럴하게 선언하면 동일한 문자열을 선언할 시 새로 만들지 않고 기존의 문자열을 참조한다. 
		System.out.println(s==s2);
		System.out.println(s2==s3);
		System.out.println(i==10);
		System.out.println(new Integer(10));
		System.out.println(i==new Integer(10)); //기본형 수와 참조형 수를 비교할때는 값을 비교
		System.out.println(new Integer(10)==new Integer(10));
		
	}
}



