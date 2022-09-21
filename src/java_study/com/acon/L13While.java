package java_study.com.acon;
import java.util.Scanner;

public class L13While {
	public static void main(String[]args) {
		int i=0;
		while(i<5) {
			System.out.println(i+"번째 실행");
			i++;
		}
		
		boolean game=true;
		while(game) {
			System.out.print("문자를 입력하세요 (exit:종료):");
			Scanner scan=new Scanner(System.in); //콘솔창에서 입력한 문자열을 받을 준비
			String inputMsg=scan.nextLine(); //콘솔창에서 enter를 입력할 때까지 작성한 문자열 받는다.
			//입력받은 문자열 "exit"는 new String("exit")와 같다.
			//new String("exit")=="exit" => false
			//참조형 객체를 비교할때는 equals()를 구현해서 사용해야한다.(String 구현되어 있다.)
			if(inputMsg.equals("exit")) {
				game=false;
				System.out.println("프로그램 종료!");
			}else {
				System.out.println("당신이 입력한 문자열: "+inputMsg);							
			}
		}
	}
}
