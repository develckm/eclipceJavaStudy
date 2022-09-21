package java_study.com.acon;

import java.util.*;
import java.util.stream.*;

public class L57StreamCollectGroupingBy {
	enum Category{
		식품,의류,가구,문구류,침구류;
	}
	class Product{
		private String name; //중복되는 이름이 없음
		private int price; //가격
		private Category category; //Category :식품,의류,가구,문구류,침구류
		private int quantity=10; //수량
		public Product(String name,int price, Category category) {
			this.setName(name);
			this.price=price;
			this.category=category;
		}
		public Product(String name,int price, Category category, int quantity) {
			this.setName(name);
			this.price=price;
			this.category=category;
			this.quantity=quantity;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			Optional<String> nameOpt=Optional.ofNullable(name);
			this.name=nameOpt.orElse("상품");
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
			this.category = category;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}	
	}
	public static void main(String[] args) {
		L57StreamCollectGroupingBy out =new L57StreamCollectGroupingBy();
		ArrayList<Product> productList=new ArrayList<Product>();
		productList.add(out.new Product("허쉬 초콜릿", 1000, Category.식품));
		productList.add(out.new Product("허쉬 초콜릿 우유", 1200, Category.식품,5));
		productList.add(out.new Product("바나나 우유", 1400, Category.식품,5));
		productList.add(out.new Product("돼지바", 900, Category.식품,15));
		productList.add(out.new Product("하겐다즈 바닐라", 5000, Category.식품,11));
		productList.add(out.new Product("소세지 도시락", 3500, Category.식품,3));
		productList.add(out.new Product("도시락 컵라면", 800, Category.식품,50));
		productList.add(out.new Product("hp 연필", 500, Category.문구류,200));
		productList.add(out.new Product("지우개", 500, Category.문구류,50));
		productList.add(out.new Product("볼펜", 1000, Category.문구류,100));
		productList.add(out.new Product("화이트 지우개", 2500, Category.문구류,3));
		productList.add(out.new Product("흰색 셔츠", 10000, Category.의류,0));
		productList.add(out.new Product("나이키 반팔 티", 25000, Category.의류,5));
		productList.add(out.new Product("나이키 신발", 110000, Category.의류,2));
		productList.add(out.new Product("아디다스 신발", 95000, Category.의류,2));
		productList.add(out.new Product("여름용 이불", 25000, Category.침구류,1));
		productList.add(out.new Product("솜 베게", 2000, Category.침구류,10));
		productList.add(out.new Product("대나무 베게", 2000, Category.침구류,0));
		productList.add(out.new Product("침대 커버 퀸", 15000, Category.침구류,3));
		productList.add(out.new Product("행거", 60000, Category.가구,1));
		productList.add(out.new Product("책상", 45000, Category.가구,1));
		productList.add(out.new Product("듀오백의자", 145000, Category.가구,3));
		
		//IntStream, LongStream, DoubleStream 기본형 스트림
		//1. 기본형스트림.of(기본형...) 
		//2. 기본형 배열(Array)를 선언하고 Arrays.stream()을 이용
		//3. 스트림의 중간연산인 map을 이용 : mapToInt,mapToLong,mapToDouble
		//기본형 스트림에는 스트림 internal 연산 reduce() 변형인 max(),min(),sum(),average()를 사용가능(기본형은 수) 
		//랩퍼 클래스로 구성된 Stream 보다 가볍고 연산이 빠르다.(new Integer(33).intVal()+3)
		IntStream intStream=IntStream.of(10,2,1,-1,20);
		
		int[] intArr= {1,19,4,2,1,-30};
		IntStream intStream2=Arrays.stream(intArr);
		
		ArrayList<Integer> integerlist=new ArrayList<Integer>();
		integerlist.add(13);
		integerlist.add(101);
		integerlist.add(-11);
		Stream<Integer> stream=integerlist.stream();
		
		//Collection은 바로 기본형 스트림을 반환할 수 없다. 요소를 자료형만 참조할수 밖에 없기 때문에 
		
		
		IntStream intStream3=stream.mapToInt((Integer i)->(int)i);
		
		//System.out.println(intStream3.sum());
		System.out.println(intStream3.max().orElse(0));
		//System.out.println(intStream3.min().orElse(0));
		//System.out.println(intStream3.average().orElse(0));
		
		//의류 상품 전체 가격의 합
		Optional<Integer> sum=productList.stream()
			.filter((p)->p.getCategory()==Category.의류)
			.map(Product::getPrice)
			.reduce((price1,price2)->(price1+price2)); 
		System.out.println(sum); //평균을 구하려면 stream을 한번더 사용해야한다.
		
		//OptionalDouble, OptionalInt,OptionalLong  일반적인 Optional 사용법과 크게 다르지 않다.
		OptionalDouble avg2=productList.stream()
				.filter((p)->p.getCategory()==Category.의류)
				.mapToInt(Product::getPrice)
				.average();
			//  .min();
			//  .max();
			//	.sum();
		System.out.println(avg2.orElse(0));
		
		//collect(groupingBy(key))
		Map<Category,List<Product>> productMap=productList.stream()
				.collect(Collectors.groupingBy((Product p)->{return p.getCategory();} ));

		productMap.get(Category.식품).stream()
			.forEach((p)->{System.out.println(p.getName());});
		
		
	}
}






