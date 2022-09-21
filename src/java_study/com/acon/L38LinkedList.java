package java_study.com.acon;

import java.util.*;

public class L38LinkedList {
	public static void main(String[]args){
		int sum=0;
		long start=(System.nanoTime());
		for(int i=0; i<1000; i++) {
			sum+=i;
		}
		System.out.println(sum);
		long end=(System.nanoTime());
		System.out.println("반복문을 실행하는 데 걸리는 시간 : "+(end-start));
		
		start=System.nanoTime();
		List<Integer> arrayList=new ArrayList<Integer>();
		for(int i=0; i<100000; i++) {
			arrayList.add(i);
		}
		end=System.nanoTime();
		System.out.println("ArrayList.add(1000000) : "+(end-start));//712375
		
		//각 요소간의 link를 생성하기 때문에 ArrayList 보다 시간이 더 오래 걸린다.
		start=System.nanoTime();
		List<Integer> linkedList=new LinkedList<Integer>();
		for(int i=0; i<100000; i++) {
			linkedList.add(i);
		}
		end=System.nanoTime();
		System.out.println("LinkedList.add(1000000) : "+(end-start));//1642292
		
		
		start=System.nanoTime();
		System.out.println(arrayList.remove(0)); 
		end=System.nanoTime();
		System.out.println("arrayList.remove(0) : "+(end-start));//505667 
		//ArrayList의 값이 삭제되면 뒤에 있는 값들을 앞으로 움직이는 연산을 해야한다.  
		start=System.nanoTime();
		System.out.println(linkedList.remove(0));
		end=System.nanoTime();
		System.out.println("linkedList.remove(0) : "+(end-start));//86000
		//LinkedList의 값이 삭제되면 링크만 삭제하기 때문에 나머지 연산이 없다.
		
		
		start=System.nanoTime();
		arrayList.add(0,1000); 
		end=System.nanoTime();
		System.out.println("arrayList.add(0,1000) : "+(end-start));//532375 
		//ArrayList에 값을 추가하면 모든 요소를 한칸씩 뒤로 이동하는 연산을 해야한다. 
		start=System.nanoTime();
		linkedList.add(0,1000); 
		end=System.nanoTime();
		System.out.println("linkedList.add(0,1000) : "+(end-start));//25625
		//LinkedList에 값을 추가하면 특정 요소 사이의 링크에 연결하기만 하면 된다. 
		
		//LinkedList는 값의 추가 삭제가 많은 자료를 사용할때 유리하다.
		//LinkedList  : index와 length가 있는 자료구조고 각 요소간의 link가 존재한다.
		//ArryaList는 인덱스 앞쪽의 값을 변경할 수록 느려지고 LinkedList는 일정한 속도로 변경되었다.
		
		start=System.nanoTime();
		arrayList.get(0); 
		end=System.nanoTime();
		System.out.println("arrayList.get(0) : "+(end-start));//25625

		start=System.nanoTime();
		linkedList.get(0); 
		end=System.nanoTime();
		System.out.println("linkedList.get(0) : "+(end-start));//625
		//LinkedList에서 링크는 자료를 참조하는데도 사용되어서 access 시간도 빠르다.
		
		
		start=System.nanoTime();
		Iterator<Integer> i=arrayList.iterator();
		long sum2=0;
		//while(i.hasNext()) {sum2+=i.next().longValue();}
		for(int j=0; j<arrayList.size(); j++) {
			sum2+=arrayList.get(j).longValue();
		}
		System.out.println(sum2);
		end=System.nanoTime();
		System.out.println("ArrayList Iterator (반복문) : "+(end-start));//6708167


		start=System.nanoTime();
		Iterator<Integer> i2=linkedList.iterator();
		long sum3=0;
		//while(i2.hasNext()) {sum3+=i2.next().longValue();}
		for(int j=0; j<linkedList.size(); j++) {
			sum3+=linkedList.get(j).longValue();
		}
		System.out.println(sum3);
		end=System.nanoTime();
		System.out.println("LinkedList Iterator (반복문) : "+(end-start));//9618458

		
		//ArrayList index : 객체주소 + type 크기 * index (예) @1000(주소) List<int> 1000+4*4(index) ==> @1016~@1020
		//LinkedList index : 객체주소 + 링크를 타고가는 수  (index가 큰것을 참조할 수록 느려진다)  
		
		
	
		
		
	}
}
