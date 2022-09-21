package java_study.com.acon;

//한패키지에 동일한 이름의 타입을 명시할 수 없다.
//열거 타입 enum : 상수를 정의하기 위해 존재하는 타입
//보통 상수를 정의할 때 상태를 나타내고 비교연산하기 위해 정수형을 많이 사용한다.
//이때 모든 상태가 정수형이라 다른 타입의 상태를 참조하거나 비교할 수 있어서 문제를 일으킨다.
//이런 문제를 해결하고 편하게 상수를 정의하도록 돕는 enum이 등장한다.
enum MysqlState{
	SUCCESS,FAILED,ERROR;
}
enum Fruit2{
	//public static Fruit2 APPLE=new Fruit2("사과"); => APPLE("사과")
	APPLE("사과"),BANANA("바나나"),PEACH("복수아"),LEMON("레몬");
	String msg;
	//private : class 내부에서만 호출할 수 있는 접근 지정자
	private Fruit2(){}
	private Fruit2(String msg) {
		this.msg=msg;
	}
}
public class L16Enum {
	public static void main(String[]args) {
		//MysqlState key2=Fruit2.APPLE;
		MysqlState key=MysqlState.SUCCESS;
		//switch의 key로 사용할 수 있는 type : int, String, char, enum 
		switch(key) {
			case SUCCESS : 
				System.out.println("저장 성공!"); 
				break;
			case FAILED : System.out.println("저장 실패!"); break;
			case ERROR : System.out.println("오류 다시 시도"); break;
		}
		
		switch(Fruit2.APPLE) {
			case APPLE : System.out.println(Fruit2.APPLE.msg+"를 먹어요"); break;
			case BANANA : System.out.println(Fruit2.BANANA.msg+"를 먹어요"); break;
			case PEACH : System.out.println(Fruit2.PEACH.msg+"를 먹어요"); break;
			case LEMON : System.out.println(Fruit2.LEMON.msg+"를 먹어요"); break;
		}
		
		
		boolean b=true;
		double d=10.001;
		String s= "안녕";
		//switch(b) {}
		//switch(d) {}	
		switch(s) {}	

	}
}
