package java_study.com.acon;

//미완성 설계도 (뼈대와 살이 혼재해 있지만 살이 덜 붙은 타입)
//인터페이스와는 다르게 접근지정자를 설정한 추상메소드를 작성할 수 있다.
abstract class Carable{
	String name="자동차";
	public Carable(String name) {
		this.name=name;
	}
	void move(int d) {
		System.out.println(d+"km 로 "+name+"이 이동한다.");
	}
	abstract void turn(int d); //추상메서드
}
//구현이 덜된 설계도를 완성하기 위해서 꼭 상속받고 추상 메서드를 구현해야한다.
class BMW extends Carable{

	//부모가 생성자가 정의되 있으면 자식도 생성자를 구현해야 한다. 
	public BMW(String name) {
		super(name);
	}
	@Override
	void turn(int d) {
		System.out.println(d+"각도로  돌아간다.");
	}
}
public class L23AbstractClass {
	public static void main(String[]args) {
		Carable bmw=new Carable("bmw 3시리즈"){
			@Override
			void turn(int d) {}
		}; //추상클래스도 인터페이스처럼 바디를 생성해야한다.
		bmw.move(10);
		BMW s5=new BMW("5 시리즈");
		s5.move(20);
		s5.turn(-30);
		//class,interface,abstract class 모두 타입이 될 수 있다. 
		Carable s7=new BMW("7 시리즈");
		s7.move(40);
		s7.turn(90);
	}
}
