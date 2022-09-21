package java_study.com.acon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.*; //람다식을 사용할 수 있도록 미리 타입을 명시하고 있느 패키지

public class L43LambdaType {
	public static void main(String[] args) {
		
		Function<Integer, Double> square=(n)->{return ((double)(n*n));}; //매개변수가 1개 있고 return이 있는 apply 를 정의
		System.out.println(square.apply(20));
		
		Consumer<Double> squarePrint=(d)->{System.out.println(d*d);}; // 매개변수가 1개 있는 accept를 정의
		squarePrint.accept(55.5);
		
		String a=null;
		//System.out.println(a==null);
		//System.out.println(a.charAt(0)); //null은 필드가 없어서 오류
		
		//매개변수가 null인지 검사하는 함수 
		Predicate<String> nullCheck=(s)->{return (s==null);}; //매개변수가 1개 있고 return이 boolean인 test 를 정의
		System.out.println(nullCheck.test(a));
		
		//리턴만 존재하는 함수 get;
		Supplier<Integer> randomVal=()->{return (int)(Math.random()*10)+1;}; 
		
		System.out.println(randomVal.get());
		
		//매개변수와 return 타입이 같은데 매개변수가 2개인것 (Function의 변형)
		BinaryOperator<Integer> sum=(n,n1)->n+n1;
		System.out.println(sum.apply(40, 50));
		
		ArrayList<String> str_list=new ArrayList();
		str_list.add("컴퓨터");
		str_list.add("마우스");
		str_list.add("키보드");
		str_list.add("모니터");
		
		System.out.println("list foreach  람다식");
		Consumer< String> listPrint=(s)->{System.out.println(s);};
		str_list.forEach(listPrint);
		
		System.out.println("list foreach 익명클래스");
		str_list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		System.out.println("map foreach");

		HashMap<Integer, String> map=new HashMap<>();
		map.put(37,"최경민");
		map.put(100,"홍길동");
		map.forEach((key,value)->{
			System.out.println(key+":"+value);
		});
		System.out.println("메서드 참조 출력");
		//map.forEach(System.out::println);
		str_list.forEach(System.out::println); //매개변수가 1개고 그것을 출력하는 것을 생략
		
		
	}
}
