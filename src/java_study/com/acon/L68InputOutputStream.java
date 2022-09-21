package java_study.com.acon;

import java.io.IOException;

public class L68InputOutputStream {

	public static void main(String[] args) {
		System.out.println("안녕!");
		//콘솔이 정의한 output stream 인 PrintStream을 사용해서 문자열을 콘솔에 출력
		System.out.println("(int)'안' :"+(int)'안');
		try {
			int c=-1;//byte 단위의 InputSream; 
			
			while((c=System.in.read())!=10) { //엔터를 누르기 전까지 문자열을 받는다.
				System.out.println(c);				
			}
			//read() :  int in the range 0 to 255=> byte로 표현가능한 숫자
			//가 234 176 128 : 자바의 문자는 2byte로 되어 있기 때문에 1byte 기반인 PrintStream.read()로 받아올 수 없다.(아스키코드 제외)

		} catch (IOException e) {e.printStackTrace();} 
	}
}
