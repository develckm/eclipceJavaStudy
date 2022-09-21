package java_study.com.acon;

import java.util.*;
import java.util.stream.*;

public class L55StreamTerminal2 {
	public static void main(String[] args) {
		//forEach()  : 출력 
		//reduce()	: 소모 (요소들을 1개의 결과로 줄인다.)
		//sum(),average() : 연산 소모 (기본형)
		//count(), max, min(기본형), max, min(참조형 sort) : 집계, 통계 연산
		//anyMatch(),allMatch(),noneMatch() : 검사 (중간 연산 filter 유사함)
		//collect() : 수집 ( 주간연산 map 과 유사 ) 
		
		int [] scoreArrCKM= {88,50,70,100,30,90};
		int [] scoreArrHKD= {90,100,99,100,85,92};

		//두사람의 기말고사 점수
		//F==(score<60)
		
		//낙제가 1개라도 있는 지 검사
		
		long fCount=Arrays.stream(scoreArrCKM)
			.filter((int score)->score<60)
			.count();
		
		System.out.println("CKM의 f의 수 :"+fCount);
		
		boolean booleanF=Arrays.stream(scoreArrCKM)
			.anyMatch((int score)->score<60);
		System.out.println("CKM은 F가 있나요? :"+booleanF);
		
		//길동씨가 장학금 대상자인데 모든 정수가 80을 넘어야한다.
		boolean pass=Arrays.stream(scoreArrHKD)
			.allMatch((s)->s>=80);
		System.out.println("홍길동씨는 장학금 대상자인가요? :"+pass);
		
		//성적이 잘못 입력되는 것을 검사 (100 크거나 0보다 작은 수가 입력 되고 있음)
		
		boolean pass2=Arrays.stream(scoreArrHKD)
			.noneMatch((s)->s>100||s<0);
		
		System.out.println("홍길동씨의 점수는 잘 입력되었습니까? :"+pass2);
	}
}








