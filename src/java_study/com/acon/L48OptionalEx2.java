package java_study.com.acon;

import java.util.Optional;

public class L48OptionalEx2 {

	class Person{
		Integer birth;
		String name;
		public Person(String name, Integer birth) {
			this.name=name;
			this.birth=birth;
		}
		
		public Integer getBirth() {
			return birth;
		}
		public void setBirth(Integer birth) {
			this.birth = birth;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	
	public static void main(String[] args) {
		int nowYear=2022;
		System.out.println(nowYear-1986+1);
		Integer birth=1986;
		System.out.println(nowYear-birth+1);
		birth=null;
		//1.null 연산할 수 없어서
		//2.null 은 정수가 될 수 없어서
		//3.null에서 필드 intVal()가 없어서 (o)
		//System.out.println(nowYear-birth.intValue()+1);
		
		L48OptionalEx2 ex=new L48OptionalEx2();
		Person p=ex.new Person("최경민", 1990);
		Person p2=ex.new Person("홍길동", null);

		System.out.println(nowYear-p.birth.intValue()+1);
		if(p2!=null) {
			if(p2.birth!=null) {
				System.out.println(nowYear-p2.birth.intValue()+1);	
			}
		}
		Optional<Person> personOpt=Optional.ofNullable(p2);
		personOpt
			.map((obj)->obj.getBirth()) //return Optional<Integer> birthOpt = Optional.of(obj.birth)
			//.map(Person::getBirth)
			.map((b)->b+1)//null.intVal()+1 (오류가 발생해야 하지만 바로 최종 연산으로 넘어감 )
			.ifPresent((b)->{System.out.println("optinoal : "+(nowYear-b));});
	}
}







