package java_study.com.acon;

class CKM extends Person{
	public CKM() {
		//System.out.println(this.wieght); //private 접근지정자 
		System.out.println(this.height); //defualt 접근지정자
		System.out.println(this.eyes);//protected 접근지정자 
		System.out.println(this.getWeight()); //public 접근지정자
	}
	//상속 관계에서 접근지정자 public, protected, default로 지정한 필드를 this로 참조할 수 있다.
	//=>private 한 필드는 상속되지 않는다.
	public String toString(){
		return "최경민씨는 키가 "+this.height+"이고 "+this.eyes+" 있고 몸무게는 비밀이에요(private)";
	}	
}
//접근 지정자와 get set으로 객체를 캡슐화 하자! 
public class L25Encapsulation {
	public static void main(String[]args) {
		Person p=new Person();
		System.out.println("당신의 키는 "+p.height);
		//System.out.println("당신의 몸무게는 "+p.weight);
		p.diet();
		System.out.println(p.eyes);
		System.out.println("당신의 몸무게는 "+p.getWeight());
	}
}
