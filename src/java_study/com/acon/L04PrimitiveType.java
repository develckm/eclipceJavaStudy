package java_study.com.acon;

public class L04PrimitiveType {

	public static void main(String[] args) {
		//자바의 기본형 (정수)
		byte b=127;//1byte로 표현할 수 있는 정수 (-128~0~127)
		short s=32767;//2byte로 표현할 수 있는 정수
		int i=2147483647; //4byte로 표현할 수 있는 정수
		long l=9223372036854775807L; //long type을 명시할 때는 꼭 L을 사용한다. 
		System.out.println(10); //java에서 정수를 선언하면 기본이 int로 작성된다.
		//자바의 기본형 (실수)
		float f= 10.1231231231323123123312f; //4byte로 표현할 수 있는 실수 (f)
		System.out.println(f);
		double d=10.123123123123123123123123; //8byte로 표혈할 수 있는 실수 
		System.out.println(d);
		System.out.println(30.123123123123123);
		//자바에서 실수를 선언하면 double이 작성된다.(js의 실수도 double과 동일한 크기를 사용)
		//실수가 저장되는 원리 : 실수부와 가수부를 나눠서 저장 =>오차범위를 줄이기 위해 8byte를 사용
		System.out.println(922337203685477580792233720368547758079223372036854775807.0);
		
		//문자표의 번호를 참조하는 기본형 (char) 
		char c=65; //127까지의 정수를 작성하면 1byte의 문자표인 아스키코드를 참조
		System.out.println(c);
		c=0x41;
		System.out.println(c);
		c=0xAC00;
		c='\uAC00';
		System.out.println(c);
		System.out.println(c+1);
		System.out.println((char)44033);
		System.out.println((char)66);
		char c2=44033; //127이상의 정수를 작성하면 유니코드 문자표를 참조
		System.out.println(c2);
		
		char c3='A'; //''로 참조하면 기본형 char가 된다.
		System.out.println(c3+'B'); //문자+문자 =정수 

		System.out.println(c3+""+'B'); //문자+문자열=>문자열+문자=>문자열
		
		//0과1의 1bit로 표현할 수 있는 data boolean (1byte 최소단위)
		boolean check=true;
		System.out.println(check);
		if(check) {
			System.out.println("안녕");
		}
		System.out.println(10>3); //비교연산의 결과로 반환되는 값
		
		
		//(byte < short < int < long << float << double) boolean char
	}
}
