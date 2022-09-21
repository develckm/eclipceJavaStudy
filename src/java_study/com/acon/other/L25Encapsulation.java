package java_study.com.acon.other;

import java_study.com.acon.Person;
//public class import 할 수 있다.



/* 접근 지정자 표
 * 				같은class		같은패키지		다른패키지			다른패키지+상속
 * public			O			O			O				O
 * _protected		O			O			X				O
 * default			O			O			X				X
 * #private			O			X			X				X
 */



//다른패키지의 클래스간에 상속관계
class CKM extends Person{
	public CKM() {
		//System.out.println(this.wieght); //private 접근지정자 
		//System.out.println(this.height); //defualt 접근지정자
		System.out.println(this.eyes);//protected 접근지정자 
		System.out.println(this.getWeight()); //public 접근지정자
	}
}
public class L25Encapsulation {
	public static void main(String []args) {
		Person p=new Person(); //Person class 가 다른 클래스에 있기 때문에 import 해야한다. 
		//System.out.println(p.height); //default 접근지정자
		//System.out.println(p.eyes);   //protected 접근지정자 
		//System.out.println(p.weight); //private 접근지정자
		System.out.println(p.getWeight()); //public 접근지정자
		
	}
}
