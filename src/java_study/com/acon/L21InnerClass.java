package java_study.com.acon;
//java문서를 컴파일 할때 class 문서로 생성되는 class
class Car{
	String name="qm3";
	String engineSound="부릉부릉";
	//Car$Engine.class 로 생성되는 innerClass(중첩 클래스)
	Engine e=new Engine();
	class Engine{
		String engineSound="부르릉";
		void operation() {
			System.out.println(name+"가 "+Car.this.engineSound); 
			System.out.println(name+"가 "+this.engineSound); 
			//innerClass는 외부 클래스의 필드를 사용할 수 있다.
			//하지만 동일한 이름의 필드가 존재한다면 override 된 것 처럼 innerClass의 필드가 사용된다.
		}
	}
}
//java문서의 이름으로 사용되는 public 클래스
public class L21InnerClass {
	//jvm 을 실행하는 자바 어플리케이션
	public static void main(String[]args) {
		Car.Engine engine=new Car().new Engine();
		engine.operation();
	}
	
}
