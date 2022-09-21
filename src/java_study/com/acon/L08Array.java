package java_study.com.acon;
class KeyTest{
	String a="안녕";
//	String 0="안됨";
//	String 0b="안됨";
//	String a-b="안됨"; //- 빼기연산 예약어
//	String class="안됨";
//	String SumVal="0"; //되지만 사용하지 않기를 권장
	int sumVal=0;
	int sum_val=0;
}
public class L08Array {

	public static void main(String[] args) {
		KeyTest t=new KeyTest();
		//System.out.println(t["a"]); //js 문법
		System.out.println(t.a);
		//const arr=[1,"2",true,4]; //js Array
		//t.b="오류"; //없는 필드를 호출하면 컴파일이 안된다.(컴파일오류)
		
		
		int [] nums= {1,2,3}; //Java Array
		
		System.out.println(nums.length);
		System.out.println(nums.toString()); //Object.toString() : 객체에 대한 설명
		System.out.println(nums);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		//System.out.println(nums["length"]); //배열의 key만 대괄호로 호출 가능

	}
}
