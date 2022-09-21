package java_study.com.acon;

import java.util.*;
import java.util.stream.*;

public class L53StreamEx {
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
		@Override
		public String toString() {
			return "{"+name+","+price+"}";
		}
	}
	public static void main(String[] args) {
		L53StreamEx out =new L53StreamEx();
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
		
		long count1=productList.stream()
			.filter((p)->p.getCategory()==Category.식품)
			.count();
		System.out.println("식품의 수: "+count1);
		
		long count2=productList.stream()
			.filter((p)->p.getCategory()==Category.의류)
			.count();
		System.out.println("의류의 수: "+count2);

		Map<Category,List<Product>> productMap=productList.stream()
			.collect(Collectors.groupingBy((p)->p.getCategory())); //카테로고리가 같은 것 키리 리스트로 묶는다.
		System.out.println(productMap);
		
		System.out.println("의류의 수: "+productMap.get(Category.의류).size());
		System.out.println("식품의 수: "+productMap.get(Category.식품).size());
		System.out.println("식품의 수: "+productMap.get(Category.가구).size());
		
		long sum=productMap.get(Category.의류).stream()
				.collect(Collectors.summingInt((p)->{return p.getPrice();}));
		System.out.println("의류가격 총합 :"+sum);

		//groupingBy((T)->key) : 집계시 기준이될 (key) 될 것을 반환하는 함수 재정의
		//groupingBy((T)->key,Collector) : 집계를 한 내역을 다시집계하는 함수 재정의 
		
		Map<Category, Integer> productSumMap=productList.stream()
			.collect(Collectors.groupingBy((p)->p.getCategory(),Collectors.summingInt((p)->p.getPrice())));
		// [20,10,1,100] => sort(Comparator) => [100,20,10,1]
		// [20,10,1,100] => MaxBy(Comparator) => [100,20,10,1] => 100
		// [20,10,1,100] => MinBy(Comparator) => [100,20,10,1] => 1
		// [] => MinBy(Comparator) => [] => null =>null+1 (오류)

		
		System.out.println(productSumMap);
		
		//상품 분류별 수를 구하세요
		
		//상품 분류별 평균 가격
		
		//상품별 가장 높은 가격 
		Map<Category, Integer> productSumMap2=productList.stream()
				.filter((p)->p.getQuantity()>0)
				.collect(Collectors.groupingBy((p)->p.getCategory(),
						Collectors.summingInt((p)->p.getPrice()*p.getQuantity())));

	}
}






