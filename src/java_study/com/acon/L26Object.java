package java_study.com.acon;

import java.lang.Object;
import java.util.ArrayList;

//java.lang.Object 모든 type(객체)이 부모로 지정(자동)하는 조상 클래스 => 객체를 생성가능하게 하는 타입

public class L26Object {
	
	//print() 콘솔에 대상의 타입과 필드를 출력해주는 함수 
	public static void print(int i) {
		System.out.println("int : "+i);
	}
	public static void print(String s) {
		System.out.println("String : "+s);
	}
	public static void print(double d) {
		System.out.println("double : "+d);
	}
	
	public static void objectPrint(Object o) {
		//o.toString() : 객체의 대한 설명을 재정의(오버라이드) 하기위해 존재한다.
		System.out.println(o.getClass()+" : "+o.toString());
	}
	//인터페이스나 추상클래스와 같은 상위 타입으로 매개변수의 타입을 제한할 수 있다.
	public static void carablePrint(Carable2 c) {}
	
	
	public static void main(String[]args) {
		Object i=10;
		Object s="안녕";
		Object list=new ArrayList<>(); 
		Object p=new Person();
		//변수의 타입은 모든 부모의 타입이 될 수 있다.(다형성)
		//모든 객체의 타입이 될수 있다 -> 모든 객체의 부모 즉 조상 
		
		//오브젝트로 참조한 변수를 캐스팅으로 형변환 할 수 있다. 
		System.out.println(((String)s).length()); 
		print(100);
		print("안녕");
		print(100.001);
		//오버로드(다형성): 여러 함수가 정의되어 있지만 마치 1개의 함수만 호출되는 것 처럼 보이는 것
		objectPrint(101); //Object가 기본형을 참조하면 랩퍼클래스의 객체로 형변후 참조
		objectPrint("안녕!");
		objectPrint(101.111);
		objectPrint(new CKM());
		//부모타입참조(다형성)
	}
}










