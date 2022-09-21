package java_study.com.acon;
//객체 지향 문법에서 객체를 설계하는 방법 


//interface로 큰 뼈대를 구성한다. (추상메서드만 정의할 수있다. 최근에 default 함수를 정의할 수 있게 추가됨 )
interface CarMove{	
	public abstract void move(); //차를 앞 뒤로 움직이는 함수
	void turn();  //차를 돌리는 함수
	void print(); //상태를 출력하는 함수 
}
interface CarExterior{
	//인터페이스는 객체의 필드를 정의할 수 없다.(static 필드의 상수만 정의가능)
	public static final int height=180;
	int weight=180;
	void moveWiper();
	void print();//차 상태를 출력
}
//추상 클래스는 인터페이스로 상속받은 (추상메서드)필드를 구현할 필요가 없다. 
abstract class Carable2 implements CarMove,CarExterior{
	//추상 메서드는 구현이 되어 있지 않기때문에 필드명이 중복되어도 상관없다. => 인터페이스를 다중 구현 가능하다.
	@Override
	public void print() {
		System.out.println("차 상태는 양호합니다.");
	}
	@Override
	public void move() {
		System.out.println("차가 움직인다.");
	}
}
//타입을 인터페이스와 추상클래스와 클래스로 나누고 타입마다 역할을 구체화하면 타입을 재사용 하기에 용이하다.
//모든 차에 자율주행 기능을 추가
//모든 클래스에서 자율주행 기능을 구현해야함 
//Carable2에서만 자율주행 기능 구현가능 (개발시간 단축, 유지보수 비용을 줄인다.)

//class BMW3 extends Carable2{
//
//	@Override
//	public void turn() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void moveWiper() {
//		// TODO Auto-generated method stub
//		
//	}}
//class BMW5 extends Carable2{
//
//	@Override
//	public void turn() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void moveWiper() {
//		// TODO Auto-generated method stub
//		
//	}}
//class BMW7 extends Carable2{
//
//	@Override
//	public void turn() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void moveWiper() {
//		// TODO Auto-generated method stub
//		
//	}}
//class QM3 extends Carable2{
//
//	@Override
//	public void turn() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void moveWiper() {
//		// TODO Auto-generated method stub
//		
//	}}
//class XM3 extends Carable2{
//
//	@Override
//	public void turn() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void moveWiper() {
//		// TODO Auto-generated method stub
//		
//	}}
//class k5 extends Carable2{
//
//	@Override
//	public void turn() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void moveWiper() {
//		// TODO Auto-generated method stub
//		
//	}}
public class L24AbstractEx {
	public static void main(String[]args) {
		//new BMW3().info();
	}
}
class P{
	void print(){
		System.out.println("안녕");
	}
}
class P2 extends P{
	void print() {
		super.print();
		System.out.println("잘가");
	}
}
class Child extends P2{
	void print() {
		super.print();
		System.out.println("마지막 상속");
	}
}
//java 클래스의 상속은 다중 상속을 지원하지 않는다.! (대부분의 객체지향 언어가 지원하지 않는다[예외 c++])
//동일한 이름의 필드가 존재할 경우 우선 순위를 정할 수 없기 때문!
//상속은 꼭 부모 자식 관계를 정의해야 하며 같은 필드가 존재하면 자식이 부모의 필드를 오버라드한다.

//class Child extends P,P2{}
//class Child extends P extends P2{}







