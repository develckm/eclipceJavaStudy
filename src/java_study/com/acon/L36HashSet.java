package java_study.com.acon;

import java.util.*;
class Person5{
	String name;
	int age;
	public Person5(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person5 other = (Person5) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Person5 [name=" + name + ", age=" + age + "]";
	}
	
}
public class L36HashSet {
	public static void main(String[] args) {
		Set set=new HashSet<>();
		set.add("사과");
		set.add("사과");
		set.add("사과");
		set.add("사과");
		set.add("사과");
		//추가할때마다 equals로 확인 후 추가
		set.add("바나나");
		System.out.println(set);
		//System.out.println(set.get(0)); //set 순서가(index) 없다.
		System.out.println(set.contains("사과"));
		
		//참조형 데이터를 set으로 중복 제거하고 싶다면 equals를 구현해야한다.
		Set<Person5> personSet=new HashSet<Person5>();
		personSet.add(new Person5("홍길동",100));
		personSet.add(new Person5("홍길동",100));
		personSet.add(new Person5("홍길동",100));
		personSet.add(new Person5("홍길동",1000));
		personSet.add(new Person5("고길동",50));
		System.out.println(personSet);
		System.out.println(personSet.contains(new Person5("고길동",50)));
		System.out.println(personSet.contains(new Person5("고길동",51)));
		
		System.out.println(personSet.remove(new Person5("홍길동",100)));
		System.out.println(personSet);
		//Set : 데이터를 중복 없이 추가하는 것에 집중하고 있어서 검색(get), 수정이 안된다.
		
		Iterator i=personSet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
