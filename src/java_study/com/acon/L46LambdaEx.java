package java_study.com.acon;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface PrintFunc{
	void print();
}

public class L46LambdaEx {
	public static void main(String[] args) {
		var str="dd"; //타입을 자동을 지정해주는 변수 (타입이 자유로운 척하는 변수)
		//str=11;
		//람다식은 인터페이스에 추상메서드를 1개 두고 함수인척 하는 것
		//var func=()->{}; //함수자체가 타입이면 참조할 수 있다.(함수는 타입이 아니기 때문에 참조할 수 없다.)
		
		PrintFunc printFuc=()->{System.out.println("안녕");};
		//printFuc() //PrintFunc 객체를 참조하고 있기 때문에 바로참조할 수 없다.
		printFuc.print(); 
		//람다식은 객체를 생성하고 추상메서드를 재정의하는 과정을 생략하는 식이다. => 함수형 언어인 척 하기 위해(코드가 간결하기 때문에->구현빠르다)
		PrintFunc printFuc2=new PrintFunc() {
			@Override
			public void print() {
				System.out.println("안녕2");
			}
		};
		printFuc2.print();
		//자바는 더 함수형 언어인 척 하기 위해 람다식으로 사용할 수 있는 타입을 미리 정의해 놓았다.
		
		Consumer<String> func = (s)->{}; //accept
		Supplier<String> func2 = ()->"dd"; //get
		BinaryOperator<Integer> func3= (i,i2)->i+i2; //apply
		Function<Integer, String> func4= (i)->i+""; //apply
		Predicate<String> func5= (s)->s.length()>0; //test
		
		//재정의한 함수가 매개변수로 필요한 것들(forEach) 위해 타입으로 구현함
		String[]str_arr= {"안녕","","나야","","코딩","공부"};
		
		//forEach : 배열의 각요소를 반복 실행할 때 어떻게 할 건지(동작==함수) 재정의 
		Arrays.stream(str_arr)
			.forEach((s)->{System.out.println(s);});
		
		Arrays.stream(str_arr)
			.filter((s)->s.length()>0)
			.forEach(System.out::println);
	}
}







