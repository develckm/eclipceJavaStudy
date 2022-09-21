package java_study.com.acon;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class L34StackAndQueue {

	public static void main(String[] args) {
		Stack stack=new Stack<>();
		stack.push("가");
		stack.push("나");
		stack.push("다");
		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop());//EmptyStackException
		System.out.println(stack);
		//Stack : 마지막 넣은 데이터를 가장 먼저 삭제하기 좋은 자료구조로 ArrayList와 유사하다. (Last In First Out)
		Queue q=new PriorityQueue<String>();
		q.add("가");
		q.add("나");
		q.add("다");
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q);
		//Queue : 처음 넣은 데이터를 가장 먼저 삭제하기 좋은 자료구조로 LinkedList로 구현해야한다. (First in First Out)
	}

}
