package java_study.com.acon;

class ObjectPrint{
	public void print(Object o) {
		System.out.println(o.getClass()+":"+o);
	}
	public void personPrint(Personable p) {
		System.out.println(p.getClass()+":"+p);
	}
}
abstract class Personable{
	String name;
	public Personable(String name) {this.name=name;}
	@Override
	public String toString() {
		return name;
	}
}
class HKD extends Personable{
	public HKD(String name) {super(name);}
}
class GKD extends Personable{
	public GKD(String name) {super(name);}
}

//<T> : 제네릭은 객체를 생성할때 필드의 타입을 지정할 수 있다. default : Object
class GenericPrint<T>{
	public void print(T o) {
		System.out.println(o.getClass()+":"+o);
	}
}
class ExtendsTest extends GenericPrint<Object>{
	
}

public class L28Generic {
	public static void main(String[]args) {
		ObjectPrint op=new ObjectPrint();
		op.print(10);
		op.print("안녕");
		
		//op.personPrint(10);
		//op.personPrint("안녕");
		Personable hkd=new HKD("홍길동");
		Personable gkd=new GKD("고길동");
	
		//객체를 부모의 타입으로 참조한다고 객체가 형변환되지 않는다.
		op.personPrint(hkd);
		op.personPrint(gkd);
	
		GenericPrint<String> strp=new GenericPrint<String>();
//		strp.print(10.001);
//		strp.print(100);
//		strp.print(hkd);
		strp.print("문자열만 출력가능한 객체 생성");
		
		//제네릭은 기본데이터 타입 사용 불가능
		//GenericPrint<int> intp=new GenericPrint<int>();
		GenericPrint<Integer> intp=new GenericPrint<Integer>();
		//intp.print("문자열");
		//intp.print(10.0001);
		intp.print(20);
		
		GenericPrint<Personable> personp=new GenericPrint<Personable>();
		//personp.print(10);
		//personp.print("dd");
		//personp.print(100.0001);

		personp.print(hkd);
		personp.print(gkd);
		//아무것도 작성하지 않으면 제네릭은 Object를 참조한다.
		GenericPrint p=new GenericPrint();
		p.print("안녕");
		p.print(10);
		p.print(10.001);
		p.print(true);
		p.print(123112312313123131l);
		p.print(123.123f);
		p.print(hkd);
		p.print(gkd);
	}
}



