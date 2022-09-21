package java_study.com.acon;

//interface : 뼈대 뿐이 설계도 (뼈대 : type ,살 : 구현{} )  
interface I{
	int i=10; //필드를 정의할 수 없다. (static 필드만 정의가능)
	public void sum(int a,int b); //추상메소드 : 구현이 덜 된 메소드 
}
public class L20Interface {
	//class : 구현이 다된 완전한 설계도
	class Calc1 implements I{
		public void sum(int a, int b) {
			System.out.println("a+b="+(a+b));
		}
	}
	int i=10;
	public static void main(String[]args) {
		System.out.println(I.i); 
		
		//인터페이를 객체로 생성하려면 바디를 정의해야하는 데 이때 익명 클래스(inner Class)가 생성된다. 
		I i0=new I(){
			@Override
			public void sum(int a, int b) {
				System.out.println("a+b="+(a+b));
			}
		};
		i0.sum(20, 30);
		
		I i1=new I() {
			public void sum(int a, int b) {}
		};
		
		I i2=((a,b)->{System.out.println(a+b);}); //익명클래스를 생성하지 않는다.
		
		i2.sum(60, 70);
		
		Calc1 c=new L20Interface().new Calc1();
		c.sum(50, 60);
		
	}
}
