package java_study.com.acon;

public class L14StaticField {
	int a=10;
	final static int b=100; //L14StaticFeild.b
	static String s=new String("안녕");
	
	static int sum(int a,int b) {
		return a+b;
	}
	//java app (jvm호출) == main
	public static void main(String[] args) {
		//java의 동작 원리와 메모리 구조 
		//java 문서작성 -> javac 컴파일 (class)-> JVM 바이트 코드를 번역해서 실행(플랫폼에 독립)
		//JVM이 실행되면서 static(메소드영역,정적영역),stack(실행에 필요한 data),heap(동적영역,참조형 객체 저장,gc)메모리를 형성
		//System.out.println(a);
		//System.out.println(this.a);
		System.out.println(new L14StaticField().a);
		System.out.println(new L14StaticField().b);//객체를 생성해서 정적메모리를 참조할 수 있지만 권장하지 않는다.
		System.out.println(b);//static을 선언함 변수는 코드가 해석되면서 정적영역에 저장된다.
		System.out.println(sum(10,30)); //정적영역에 저장된 변수와 함수는 삭제되지 않는다.
		//new L14StaticFeild() 힙영역에 저장된 인스턴스 객체는 사용하지 않을 때 가비지컬렉션에 의해서 삭제된다. 
	}
}
