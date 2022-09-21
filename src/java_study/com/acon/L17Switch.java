package java_study.com.acon;

public class L17Switch {
	public static void main(String [] args) {
		//0 : 실패,1 : 성공 ,2 :오류
		int state=1;
		if(state==0) {
			System.out.println("등록 실패");
		}else if(state==1) {
			System.out.println("등록 성공");
		}else if(state==2) {
			System.out.println("등록 오류");
		}else {
			System.out.println("다시 시도");
		}
		switch(state) {
			case 0 : 
				System.out.println("등록 실패");
				break;
			case 1 : 
				System.out.println("등록 성공");
				break;
			case 2 : 
				System.out.println("등록 오류");
				break;
			default: 
				System.out.println("다시 시도");
				break;		
		}

/*switch 특징
 * 1. case 로 ==의 조건을 사용
 * 2. break; 를 사용해서 switch 조건을 벗어남 
 * 3. if을 작성하는 것 보다 검사 속도가 빠르다.
 * 4. 조건을 파악하기 좋다(가독성)
 * 5. >,<,>=,<=,!= 와 같은 복잡한 조건을 사용할 수 없다. 
 * 6. key로 byte,short,int,char,String,enum 만 사용할 수 있다.(key가 제한적이다)
 * */		
	long c=3l;
	//switch(c) {}
	
		
	}
}







