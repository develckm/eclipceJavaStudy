package java_study.com.acon;

import java.io.IOException;

class ArrayPrint<T>{
	
	T array[];
	public ArrayPrint(T array[]) {
		this.array=array;
	}
	
	//print()를 사용하려면 배열의 길이를 잘못입력하는 오류를 처리
	public void print() throws Exception{
		String s="{";
		for(T a : array) {
			s+=a+",";
		}
		s+="}";
		System.out.println(s);
	}	
}
public class L30Throws {
	public static void main(String[]args) {
		Double [] d_arr= {10.111,10.23,10.512,20.10};
		System.out.println(d_arr);
		
		ArrayPrint<Double> p=new ArrayPrint<Double>(d_arr);
		try {
			p.print();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("처리");
	}
}
