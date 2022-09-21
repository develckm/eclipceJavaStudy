package java_study.com.acon;

import java.util.Scanner;

public class L29Exception {
	public static void main(String[]args) {
		//컴파일 때 발견할 수 없는 오류를 처러하는 exception 
		//int a= "10";
		String a[]= {"사과","바나나","수박"};
		
		System.out.print("배열 a의 인덱스를 입력 (0~2): ");
		Scanner scanner=new Scanner(System.in);
		
		//예외처리할때 예외의 타입을 명시하는 이유!
		//1.성능 ???
		//2.어떤 오류가 발생하는지 명시할 수 있다.(유지보수)
		//3.특정 오류가 뜨면 처리할 수 있다.
		try {
			int a_key= Integer.parseInt(scanner.nextLine());			
			System.out.println("a["+a_key+"] :"+ a[a_key]);
		}catch(NumberFormatException e ) { //처리할 오류를 정의  
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(Exception e) {//모든 오류의 부모로 정의될 수 있다. 마치 else 문 처럼 동작
			e.printStackTrace();
		}finally { //try catch 가 종료되면 무조건 실행된다. 
			System.out.println("finally는 무조건 한번 실행됨");
			//보통 try catch는 예상치 못하는 오류가 많이 발생하는 통신에서 사용된다.
			//통신은 연결이되면 꼭 종료하는 메서드를 호출해야 해서 finally를 사용한다. 
		}
//		//개발단의 예외처리
//		if(a_key>=0 && a_key<=a.length-1) {
//			System.out.println(a[a_key]); //실행시 발생하는 오류=> main thread(application) 를 종료한다.			
//		}
		
		System.out.println("종료가 안되면 출력될 내용!");
	}
}
