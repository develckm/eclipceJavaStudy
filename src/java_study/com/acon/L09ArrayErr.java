package java_study.com.acon;

public class L09ArrayErr {
	public static void main(String [] args) {
		char c[]= {};
		char []c2= {};
		char []c3=new char[3];
		System.out.println("c3[0]:"+(int)c3[0]);
		int [] is=new int[10];//{0,0,0,0,0,0,0,0,0,0}
		System.out.println("is[0]:"+is[0]);
		double [] ds=new double[5];
		System.out.println(ds[0]);
		boolean [] bs=new boolean[3];
		System.out.println(bs[0]);
		//기본형의 배열을 길이가 있게 정의하면 기본값으로 0(0.0,false)을 참조한다. 
		
		//모든 참조형의 배열을 길이가 있게 정의하면 기본값으로 null을 참조한다.
		String [] s_arr=new String[3];
		System.out.println(s_arr[0]);
		s_arr[1]="안녕1";
		s_arr[2]="안녕2";
		//s_arr[3]="안녕3"; //js에서 객체에 없는 필드를 정의하면 새로운 필드를 정의
		//java에서 배열에 없는 필드를 정의,호출하면 오류! ArrayIndexOutOfBoundsException
		System.out.println(s_arr[2]);
		//System.out.println(s_arr[3]);
		
		//Array는 변수를 선언할때 리터럴하게 객체를 생성할 수 있다.
		String []s_arr2=null;
		//s_arr2={"A","B","C"};
		s_arr2=new String[3];
		
		//2차원 배열 선언법
		String [][] s_arr3= {{"안","녕"},{"잘","자"},{"잘","가","세","요"}};
		String [][] s_arr4= new String[3][2];
		int [][] s_arr5=new int[][] {{1,2},{1,2}};
		String s="안녕하세요";
		char[] cs= {'안','녕','하','세','요'};
	}
}







