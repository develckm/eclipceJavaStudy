package java_study.com.acon;

import java.util.Date;

class AgeCalc{
	int birth;
	int age;
	AgeCalc(){} //생성자 : 클래스와 이름이 같고 리턴이 없다.(객체의 초기값 지정)
	AgeCalc(int birth){
		this.birth=birth;
		Date d=new Date();
		System.out.println(d.toLocaleString());
		System.out.println(d.getYear()+1900);
		System.out.println((d.getYear()+1900)-birth+1);
		this.age=(d.getYear()+1900)-birth+1;
	} //생성자 오버로드
	String lifeCycle() {
		String msg="영유아";
		//0~5 영유아,6~12 아동,13~18 청소년,19~29 청년, 30~49 중년, 50~64 장년 
		//65~ 노년 
		if(this.age<0) {
			msg="미래아이";
		}else if(this.age<=5) {
			msg="영유아";
		}else if(this.age<=12) {
			msg="아동";
		}else if(this.age<=18) {
			msg="청소년";
		}else if(this.age<=29) {
			msg="청년";
		}else if(this.age<=49) {
			msg="중년";
		}else if(this.age<=64) {
			msg="장년";
		}else{
			msg="노년";
		}
		return msg;
	}
	
	boolean youthTest(int year) {
		if(30<=(2022-year) && 40>(2022-year)) {
			return true; //함수는 return이 실행되면 종료된다.
		}
		return false;
	}
}
public class L12If {
	public static void main(String[]args) {
//		if(조건문 or 반환하는 것이 boolean 함수) {
//			조건문의 반환 결과가 true 면 실행 블럭
//		}else{
//			조건문의 반환 결과가 false 면 실행 블럭
//		}
		if(30<=(2022-1986)) {
			System.out.println("청년");
		}
		AgeCalc ac=new AgeCalc();
		if(ac.youthTest(1906)){
			System.out.println("청년");
		}else {
			System.out.println("노인");
		}
		//비교연산 
		//>,<,>=,<=,==,!=
		//! not 연산
		//논리연산 
		// && , ||
		AgeCalc ac2=new AgeCalc(2024);
		System.out.println("당신은 "+ac2.lifeCycle()+"입니다.");
	}
}






