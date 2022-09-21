package java_study.com.acon;

public class L02Variable {
	public static void main(String []args) {
		var a=10; //var로 선언할때 대입된 값의 타입을 갖는다.
		//a="안녕"; //js처럼 type을 변경할 수 있지 않다.
		//var a1=null; //var은 최초값을 대입해야한다.
		
		String s=null; //문자열은 참조형이고 참조형은 null을 사용할 수 있다.
		//s가 변수 :undefined 상태의 변수는 사용할 수 없다.
		//s=10;
		s="a"; 
		s="ab"; //참조하는 data를 변경할 수 있어서 변수
		//s=10; //변수는 처음 지정한 타입의 data만 참조할 수 있다.
		s=10+"";//정수+문자열=문자열
		System.out.println(s);
		//int i=null; //기본형은 null을 참조할 수 없다.
		int i;
		//System.out.println(i);
		i=Integer.parseInt( "10" ); //data type이 다른 경우 형변환 후 참조가능
		//Integer : 기본형 int의 랩퍼 클래스(기본형을 돕는 클래스)
		System.out.println(i+100);
		//변수를 사용하는 이유 : 변수가 참조하는 data를 재사용
		
	}
}
