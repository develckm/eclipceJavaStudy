package java_study.com.acon;

@FunctionalInterface //컴파일시 람다식을 사용할 수 있도록 추상메서드가 1개인지 검사한다.
interface SumFunc{
	int sum(int a,int b);
	//double sum(double a,double b);  //추상 메서드가 2개이상인 것은 람다식을 작성할 수 없다. 
}
@FunctionalInterface
interface SquareFunc{
	int square(int a);
}
class Sum implements SumFunc{
	@Override
	public int sum(int a, int b) {
		return a+b;
	}	
}
public class L42Lambda {
	public static void main(String[] args) {
		System.out.println(new Sum().sum(10, 30));
		//Sum과 유사한 구조의 내부클래스로 익명 클래스가 생성됨 (L42Lambda$1)
		SumFunc sum=new SumFunc() {
			@Override
			public int sum(int a, int b) {
				return a+b;
			}
		};
		System.out.println(sum.sum(100,1000));
		
		//객체지향 언어는 함수를 타입으로 정의할 수 없기 때문에 객체를 꼭 정의해야한다. 
		//추상메서드가 1개인 타입은 객체를 생성하는 식을 생략할 수 있게 하는 것이 람다식 (익명클래스를 생성하지 않는다.)
		
		SumFunc sum2=(int a,int b)->{return a+b;};
		SumFunc sum3=(a,b)->{return a+b;};
		SumFunc sum4=(a,b)->a+b; //{}를 생략하고 1개의 실행만 작성할 경우 실행이 return된다.
		
		//람다식 == 익명함수??? (x) 인터페이스에 존재하는 추상메서드를 재정의
		SquareFunc squareFunc= a->a*a;
		System.out.println(squareFunc.square(77));
		
	}
}





