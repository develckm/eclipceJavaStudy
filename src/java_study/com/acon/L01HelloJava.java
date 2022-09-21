package java_study.com.acon;

public class L01HelloJava {
	public static void a() {
		System.out.println("실행되지 않는다!");
	}
	//실행은 main 메소드만 할 수 있다. (JRE(자바가상머신)를 호출하는 메소드)
	public static void main(String [] args) {
		var a=10; //java10의 업데이트 내역
		//java의 변수는 꼭 타입을 명시한다.
		String msg="안녕 자바야!"; //문자열 타입은 꼭 ""로 작성한다.
		int i=30; //정수형(기본형) 숫자만 작성 
		double d=10.332; //실수형(기본형) 
		//let l=30.444; let,const,var로 변수를 선언할 수 없다. 
		boolean b=false;
		System.out.println(msg+(10.55+30));
		L01HelloJava.a();
		a(); //내부에서 호출될 때는 타입을 생략할 수 있다.
	}
}
