package java_study.com.acon;
class Calc0{
	/* js 함수 
	function sum(a,b) {
		return a+b;
	}
	*/
	int sum(int a,int b){
		return a+b; //함수 선언시 지정한 타입의 data만 반환할 수 있다.
	}
	//js에서는 같은 이름의 함수를 2개 선언할 수 없다.
	//java 에서는 이름이 같은데 매개변수가 다른 함수를 선언할 수 있다.(오버로드=>객체의 다형성)
	//매개변수에 기본값을 주면 어떤 함수가 호출되는지 알수 없기 때문에 불가능하다.
	int sum(int a,int b,int c) {
		return a+b+c;
	}
	//void : return이 없는 함수
	void sumPrint(int a,int b) {
		System.out.println("a+b="+(a+b));
	}
	
	//타입이 다른 매개변수로 오버로드가 가능
	void sumPrint(String strA,String strB) {
		//js에서 문자열을 수로 형변환시 오류가 발생하면 시스템이 멈추는 것을 방지하기 위해 NaN를 반환
		//java는 형변환시 오류가 발생하면 시스템을 멈춘다. 
		try {
			int a=Integer.parseInt(strA);
			int b=Integer.parseInt(strB);
			System.out.println("a+b="+(a+b)); 			
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("수만 입력하세요!");
		}
	}
}
public class L07Method {
	public static void main(String[]args) {
		Calc0 c=new Calc0();
		//System.out.println(c.sum()); //js에서 매개변수를 생략하면 undefined가 된다.
		System.out.println(c.sum(10, 20));
		System.out.println(c.sum(10, 20, 30));
		c.sumPrint(10, 20);
		c.sumPrint("십", "20");
		System.out.println("오류발생하면 실행되지 않을 겁니다.(실행이 멈춘다.)");
	}	
}
