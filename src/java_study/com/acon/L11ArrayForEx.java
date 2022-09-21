package java_study.com.acon;

import java.util.Scanner;

public class L11ArrayForEx {
	static String getGrade() {
		return "F";
	}
	
	public static void main(String[]args) {
		char []rowerCase= {'a','z','A','Z','d','e','가','f'};
		//아스키코드 표의 소문자 번호를 참조해서 
		//1문제 : rowerCase 에 존재하는 알파뱃 소문자가 아닌 것의 index를 출력하세요!
		//2문제 : rowerCase 에 존재하는 알파뱃이 아닌 문자의 index 출력하세요! 
		for (int i=0; i<rowerCase.length; i++) {
			char c=rowerCase[i];
//			if(c>=97 && c<=122) {
//				System.out.println(c+" 는 소문자 입니다.");				
//			}else if(c>=65 && c<=90) {
//				System.out.println(c+" 는 대문자 입니다.");				
//			}else {
//				System.out.println(i+"번째 "+c+" 는 알파벳이 아닙니다.");				
//			}
			
			if( !((c>=97 && c<=122)||(c>=65 && c<=90)) ) {
				System.out.println(i+"번째 "+c+" 는 알파벳이 아닙니다.");				
			}	
		}
		
		char c= "a".charAt(0);
		char []input_string=new char[6];
		//Scanner로 6개의 문자를 입력받고 마지막에 입력받은 문자들을 문자열로 출력하는 프로그램 작성 
		//입력받을 수 있는 문자는 알파뱃만 가능(알파뱃이 아닌 것을 입력하면 다시 입력받으세요) 
		
		System.out.println("6개의 알파벳 문자를 받아서 문자열로 만드는 프로그램");
		Scanner scan=new Scanner(System.in);
		int i=0;
		while(i<6) {
			System.out.print(i+"번째 문자 입력 :");
			char a=scan.nextLine().charAt(0);
			if( ((a>=97 && a<=122)||(a>=65 && a<=90)) ) {
				input_string[i]=a; i++;
			}else {
				System.out.println("알파벳만 입력하세요!!!!!");
			}
		}
		String msg="";
//		for(char s: input_string) {
//			msg+=s;
//		}
		for(int i2=0; i2<input_string.length; i2++) {
			char s=input_string[i2];
			msg+=s;
		}
		System.out.println("입력하신 문자열은 :"+msg);
		


	}
}
