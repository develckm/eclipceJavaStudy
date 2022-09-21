package java_study.com.acon;

public class L05Casting {
	public static void main(String[]args) {
		System.out.println(Integer.MAX_VALUE);//랩퍼 클래스의 상수 최대값
		int i=2147483647;
		long l=i; //double은 int를 참조할 수 있다.
		//int i2=d; //int는 double을 참조할 수 없다.
		System.out.println(Long.MAX_VALUE);
		int i2=(int)2147483649l; 
		//casting 형변환 
		//기본형 : 참조하는 타입보다 더 큰수를 참조할때 강제(불가능)로 형변환하는 방법 
		//참조형 : 부모의 타입으로 형변환하는 방법
		
		//int,short,byte의 casting 형변환 : 더 큰수를 참조하면 가장 작은 수 부터 다시 세서 참조.
		System.out.println(i2);
		l=(long)1.23E38f;
		System.out.println(l); //long보다 큰수를 참조하면 가장 큰수를 참조한다.
		
		//실수(float,double)의 casting 형변환 : 더 크거나 작은수를 참조하면 (-)Infinity
		float f=(float)1.23E100;
		System.out.println(f);
		System.out.println(Double.MAX_VALUE);
		double d=-1.7976931348623157E308*2; //double보다 큰수가 없기 때문에 생략할 수 있다.
		System.out.println(d);
	}	
}
