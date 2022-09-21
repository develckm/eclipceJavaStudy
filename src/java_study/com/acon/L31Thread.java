package java_study.com.acon;

import java.util.Scanner;
//java.lang.Thread
class TreadTest extends Thread{
	//thread 생성시 실행되는 함수(재정의 대상) 
	
	//js : window.setInterval(()=>{},1000); 
	//java : interval이 없는 thread
	@Override
	public void run() {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			//nextLine() 은 콘솔에 입력이 들어오는 것을 무한히 대기한다(반복문) => 1thread를 독점
			String msg=scanner.nextLine();
			System.out.println("당신이 입력한 값 : "+msg);			
		}
	}
}



public class L31Thread {
	public static void main(String[]args) {
		//코드가 순차적으로 실행되는 이유는 java가 기본 1thread 를 가지고 있기 때문
		String [] arr= {"a","b","C"};
		for(String a : arr) {System.out.println(a);}
		
		new TreadTest().start(); //재정의한 Thread.run()을 thread를 생성해서 실행하는 함수 
//		boolean b=true;
//		while(b) {
//			Scanner scanner = new Scanner(System.in);
//			//nextLine() 은 콘솔에 입력이 들어오는 것을 무한히 대기한다(반복문) => 1thread를 독점
//			String msg=scanner.nextLine();		
//			System.out.println("당신이 입력한 msg:"+msg);
//		}
		
		System.out.println("위에 반복문이 종료되어야 실행됨(예외 : thread가 2개이면 실행될 수 있음 )");
	}
}
