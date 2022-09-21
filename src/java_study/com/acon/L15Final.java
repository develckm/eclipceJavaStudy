package java_study.com.acon;
class A0{
	int a=10;
}
class B0{
	String b="";
}
//과일 가게 타이쿤 
class Fruit{
	//public : 다른 패키지(어디서든)의 클래스에서 참조할 수 있음 
	//static : 정적메모리에 저장된 => 어떤 곳에서든 참조가능
	//상수는 대문자로만 작성 (개발자간의 약속)
	public static final int APPLE=1;
	public static final int LEMON=2;
	public static final int BANANA=3;
	public static final int PEACH=4;
}
class State{
	//0:실패,1:성공,2:오류
	public static final int FAILED=0;
	public static final int SUCCESS=1;
	public static final int ERROR=2;	
}


public class L15Final {
	public static void main(String[]args) {
		//상수: 변하지 않는 수 (처음에 참조한 값을 바꿀 수 없다.)
		final int a=10; //const a=10;
		//a=20;
		final String b; //const b; b="안녕" (x)
		b="안녕";
		//b="오류";
		final String c=null;
		//c="안녕2";
		//자바는 타입이 명확하기 때문에 상수를 잘 사용하지 않는다.
		A0 a0=new A0();
		//a0=new B0();
		
		//let obj={a:"안녕"}
		//obj={b:"바뀜"};
		//log(obj.a) (undefined) 
		//log(obj.a.length) (오류)
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Math.PI);
		System.out.println(Fruit.APPLE);
		//상수는 변하지 않는 정보를 저장하고 참조하는 것이 주된 목적이다.
	
		int key=Fruit.BANANA;
		switch(key) {
			case Fruit.APPLE: System.out.println("사과를 먹어요!"); break;
			case Fruit.LEMON: System.out.println("레몬을 먹어요!"); break;
			case Fruit.BANANA: System.out.println("바나나를 먹어요!"); break;
			case Fruit.PEACH: System.out.println("복숭아를 먹어요!"); break;
		}
		
		int state_key=Fruit.APPLE; 
		//상태를 나타내는 상수가 정수형이기 때문에 다른 정수형의 상수를 사용할 수 있다. => 심각 한 오류를 발생
		
		if(state_key==State.SUCCESS) {
			System.out.println("등록성공");
		}else if(state_key==0) {
			System.out.println("등록실패");
		}else if(state_key==2) {
			System.out.println("오류입니다 다시 시도하세요!");
		}
	}
}








