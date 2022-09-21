package java_study.com.acon;

import java.util.*;

public class L33List {
	public static void main(String[] args) {
		Object [] str_arr= {"사과","바나나","딸기"};
		Object [] str_arr2= {"사과","바나나","딸기"};
		System.out.println(str_arr==str_arr2);
		System.out.println(str_arr.equals(str_arr2));
		//Array는 == , equals로 동등비교할 수 없다. 
		System.out.println(Arrays.equals(str_arr, str_arr2)); //Array 타입을 지원하는 객체로 동등비교
		System.out.println("Array Object[] :"+Arrays.toString(str_arr2)); 
		
		List str_list=Arrays.asList(str_arr); //Array=>ArrayList로 반환
		System.out.println("List : "+str_list);
				
		
		List list=new ArrayList<>();
		list.add("사과");
		list.add("바나나");
		list.add("딸기");
		System.out.println(list);
		
		List linkedList=new LinkedList<>();
		linkedList.add("사과");
		linkedList.add("바나나");
		linkedList.add("딸기");
		System.out.println(linkedList);
		
		List vector=new Vector<>();
		vector.add("사과");
		vector.add("바나나");
		vector.add("딸기");
		System.out.println(vector);
		
		List stack =new Stack<>();
		stack.add("사과");
		stack.add("바나나");
		stack.add("딸기");
		System.out.println(stack);

		System.out.println(list.equals(str_arr));
		System.out.println(list.equals(linkedList));
		System.out.println(list.equals(vector));
		System.out.println(list.equals(stack));
		
		list.add(3, "수박");	
		System.out.println(list);
		//list.add(5,"코코넛"); //index+1까지 add()할수 있다.
		list.add(0, "토마토");
		System.out.println(list); //add는 특정 위치에 요소를 추가하기 때문에 길이가 늘어난다.
		list.set(0, "복숭아");
		System.out.println(list); //set은 특정 위치에 요소를 바꾸는 것 
		//list.set(5, "오류");     //존재하지 않는 index의 값을 바꿀 수 없다.
		System.out.println(list.remove(1));
		System.out.println(list); //remove는 특정 위치의 요소를 삭제하고 길이가 줄어든다. 
		System.out.println(list.remove("복숭아"));
		System.out.println(list); // 요소를 찾아서 삭제할 수도 있다. 
		System.out.println(list.remove(new String("딸기"))); //객체를 비교해서 삭제해준다.
		System.out.println(list);
		list.add("바나나");
		list.remove("바나나");
		System.out.println(list); //같은 값이 있어도 1개만 삭제한다. 
		list.add("바나나");
		System.out.println(list.indexOf("수박"));
		System.out.println(list.lastIndexOf("수박"));

		
		ArrayList list3=new ArrayList(10); //가용길이를 지정하면서 생성 :default 10 (list의 길이변화가 성능저하로 연결될 수 있음)
		System.out.println(list3.size()); //가용길이는 size와 연관이 없다. (실제 저장된 요소의 길이)
		System.out.println(list3);
		
		Object [] obj_arr=new Object[10]; //실제 길이를 지정 (빈곳에 null or 0(0.0,false)이 참조됨) 
		System.out.println(obj_arr.length);
		System.out.println(Arrays.toString(obj_arr));
		
		Vector v=new Vector(12);	//capacity : 가용길이 (default : 10)
		v.add("양배추");
		v.add("양상추");
		v.add("상추");
		System.out.println("vector.size():"+v.size());
		System.out.println("vector.capctiy():"+v.capacity());
		v.add("양배추");
		v.add("양상추");
		v.add("상추");
		v.add("양배추");
		v.add("양상추");
		v.add("상추");
		v.add("양배추");
		v.add("양상추");
		v.add("상추");
		v.add("양배추");
		v.add("양상추");
		v.add("상추");
		System.out.println("vector.size():"+v.size());
		System.out.println("vector.capctiy():"+v.capacity()); //가용길이는 처음 지정한것에 2배로 늘어난다. 
		v.trimToSize();
		System.out.println("vector.size():"+v.size());
		System.out.println("vector.capctiy():"+v.capacity()); //trimToSize : 가용 공간을 비우는 함수
		v.ensureCapacity(20);
		System.out.println("vector.size():"+v.size());
		System.out.println("vector.capctiy():"+v.capacity()); //ensureCapacity : 가용 공간을 늘리는 함수
		
	}
}
