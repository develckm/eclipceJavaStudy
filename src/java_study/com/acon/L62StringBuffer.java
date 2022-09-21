package java_study.com.acon;

public class L62StringBuffer {
	public static void main(String[] args) {
		String str="abc";//"abc"
		System.out.println(str+"123"); // "123" -> "abc123" //총 3개의 문자열 객체 생성 
		StringBuffer sb=new StringBuffer("abc"); 
		System.out.println(sb.capacity()); //default :163
		
		System.out.println(sb.toString());
		System.out.println(sb+"123"); //sb.toString() + "123" //이렇게 사용하면 안됨
		sb.append("123"); //"abc"을 "abc123" 편집  //StringBuffer객체 1개만 사용 됨
		//버퍼링과 buffer ??
		//램(어플을 실행할 때 사용되는 저장 공간 [읽고 쓰는 속도가 엄청 빠름]) 용량이 가득 차면 
		//램 이외의 다른 저장공간(읽고 쓰는 속도가 램보다 느림)에 어플을 사용하기 위한 공간을 마련하는 현상 
		//StringBuffer : 문자열을 읽고 쓰기위한 공간을 추가로 마련하는 객체 
		System.out.println(sb);
		
		long start=System.nanoTime();
		String strTest="";
		for(int i=0; i<10000; i++) {
			strTest+=i;
		}
		long end=System.nanoTime();
		System.out.println(strTest);
		System.out.println("연산시 걸리는 시간 : "+(end-start));
		
		start=System.nanoTime();
		StringBuffer sbTest=new StringBuffer("");
		for(int i=0; i<10000; i++) {
			sbTest.append(i);
		}
		end=System.nanoTime();
		System.out.println(sbTest);
		System.out.println("연산시 걸리는 시간 : "+(end-start));

		System.out.println("문자열을 계속 변경할 시 무조건 StringBuffer를 사용해야한다.");
	} 
}




