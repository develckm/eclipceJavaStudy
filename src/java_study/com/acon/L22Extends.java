package java_study.com.acon;

class Engine{
	String name="엔진";
	void operation() {
		System.out.println("부릉부릉");
	}
}
class Car2 extends Engine{
	//Car2(자식)는 Engine(부모)을 상속 받았기 때문에 모든 필드를 사용할 수 있다.
	//자식은 부모와 다른 개성이 필요하기 때문에 부모의 필드를 재정의 할 수 있다. 오버라이드(딩)
	//부모와 자식이 같은 이름의 함수를 사용! => 객체의 다형성
	
	@Override //어노테이션 : 컴파일시 오버라이드 유형이 맞는 지 검사후 안내함
	void operation() {
		System.out.print("자동차 엔진이 ");
		super.operation(); //super : 부모필드 접근자.
	}
	void frontMove() {
		System.out.println("자동차가 앞으로 움직인다.");
	}
	//오버로드  : 같은이름의 다른 함수가 존재하는 것 (다형성)
	void frontMove(int x) {}
}
public class L22Extends {
	public static void main(String[]args) {
		Car2 c=new Car2();
		c.operation();  //재정의된 자식의 필드가 호출됨
		c.frontMove();
		
		//모든 객체는 부모의 타입으로 변수를 지정할 수 있다.(다형성)
		//Engine qm3=(Engine)new Car2();
		Engine qm3=new Car2();
		qm3.operation();
		//qm3.frontMove();
		Car2 carQm3=(Car2)qm3;//???? equals() 
		carQm3.frontMove();
		
		//부모 타입으로 생성한 객체는 자식 타입이 참조할 수 없다. 
		//부모 타입으로 생성한 객체는 자식 타입으로 casting 형변환 할 수 없다. 
		Engine e=new Engine();
		//Car2 bmw=e;
		Car2 bmw1=(Car2)e;
	}
}
