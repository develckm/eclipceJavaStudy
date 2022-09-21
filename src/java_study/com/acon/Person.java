package java_study.com.acon;

public class Person{
	//class 내부에서만 사용할 수 있는 접근 지정자 
	int height=160; //default 접근지정자 : 패키지 내부에서 사용가능 필드
	private int weight=99; //private 접근지정자 : 클래스 내부에서만 참조가능   (js #weight)
	//public 접근지정자 : 누구나 접근 가능한 접근가능
	
	protected String eyes="눈들"; //protected 접근지정자 : 클래스내부 + 같은 패키지내부 + 상속 관계
	
	public void diet() { 
		--this.weight;
	}
	
	//private 한 필드를 get set으로 캡슐화하는 것을 Data Transfer Object(DTO)라 부른다.(자바 빈즈)
	//get set 함수를 정의하고 객체의 필드를 캡슐화하는 방법을 디자인 패턴이 한다.
	//디자인 패턴 : 코드의 구조(디자인) 보기 좋고 사용하기 훌륭해 약속으로 자리잡은 것
	
	//데이터 통신을 할때 get set으로 캡슐화한 구조가 용이하고 오류 발생을 줄여서 대부분의 언어서 사용 중이다. => DTO 
	
	//getter 
	public int getWeight() {
		return this.weight-10;
	}
	//setter (받아온 매개변수를 필드에 정의하는 함수)
	public void setWeight(int weight) {
		this.weight=weight;
	}
	
}
