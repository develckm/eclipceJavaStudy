package java_study.com.acon;

import java.util.Scanner;

public class L11ArrayForEx2 {
	static String getGrade(int score) {
		String grade="";
		if(score>=95) {
			grade= "A+";
		}else if(score>=90) {
			grade= "A";
		}else if(score>=85) {
			grade= "B+";
		}else if(score>=80) {
			grade= "B";
		}else if(score>=75) {
			grade= "C+";
		}else if(score>=70) {
			grade= "C";
		}else if(score>=65) {
			grade= "D+";
		}else if(score>=60) {
			grade= "F";
		}else{
			grade= "F";
		}
		return grade;
	}
	
	
	public static void main(String[] args) {
		//"abcd" =>'d'
		String test="abcd";
		char testc=test.charAt(test.length()-1);
		System.out.println(Integer.MAX_VALUE);
		
		int []score_arr=new int[4]; //{77,64,50,100} =>입력
		String[] grade_arr=new String[4]; //{"C+","D","F","A+"} =>출력 
		int i=0;
		Scanner scan=new Scanner(System.in);
		while(i<4){
			try {
				System.out.print(i+"번째 점수 입력:");
				String score_str=scan.nextLine();
				int score=Integer.parseInt(score_str);
				score_arr[i]=score;
				grade_arr[i]=getGrade(score);
				i++;
			}catch(NumberFormatException e){
				System.out.println("수만 입력하세요!");
			}
		}	
		for(int n=0; n<grade_arr.length; n++) {
			System.out.println(n+"번째 입력한 점수 "+score_arr[n]+"의 등급 :"+grade_arr[n]);
		}
	}
}
