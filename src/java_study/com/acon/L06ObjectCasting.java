package java_study.com.acon;

public class L06ObjectCasting {
	public static void main(String []args) {
		C c=new C();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		A a=(A)c;
		System.out.println(a.a);
		//System.out.println(a.b);
		//System.out.println(a.c);
		Object a0=new C();
		A a1=(A)new B();
		A a2=(A)new C();
		//C c2=new A();
	}
}
class A{
	String a="a";
}
class B extends A{
	String b="b";
}
class C extends B{
	String c="c";
}