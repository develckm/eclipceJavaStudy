package java_study.com.acon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L39SortAndComparator {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(100);
		list.add(1000);
		list.add(-10);
		list.add(50);
		list.add(0);
		list.add(1002);
		System.out.println(list);
		list.sort(null);
		System.out.println(list);
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		//String 에 Comparable 이 구현되어 있어서 정렬이 가능
		ArrayList list2=new ArrayList();
		list2.add("z");
		list2.add("ba");
		list2.add("e");
		list2.add("a");
		list2.add("bb");
		list2.add("c");
		System.out.println(list2);
		list2.sort(Comparator.reverseOrder());
		System.out.println(list2);
		
		L39SortAndComparator out=new L39SortAndComparator();
		L39SortAndComparator.Product p=out.new Product("텀블러",20000);
		Product p2=out.new Product("커피",4500);
		Product p3=out.new Product("우유",3000);
		Product p4=out.new Product("물",1000);
		Product p5=out.new Product("주스",4000);
		List<Product> product_list=new ArrayList<Product>();
		product_list.add(p);
		product_list.add(p2);
		product_list.add(p3);
		product_list.add(p4);
		product_list.add(p5);
		System.out.println(product_list);
		product_list.sort(Comparator.naturalOrder()); //Product 에 Comparable이 구현되어 있지 않으면 오류!
		System.out.println(product_list);
		product_list.sort(Comparator.reverseOrder());
		System.out.println(product_list);
	}
	class Product implements Comparable<Product>{
		String name;
		int price;
		public Product(String name,int price) {
			this.name=name;
			this.price=price;
		}
		@Override
		public String toString() {
			return "{name:" + name + ", price:" + price + "}";
		}
		@Override
		public int compareTo(Product o) {
			if(this.price>o.price) {
				return 1;
			}else if(this.price<o.price) {
				return -1;
			}else {
				return 0;				
			}
		}
	}
}
