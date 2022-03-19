package dataStructure;

import java.util.EmptyStackException;

/**
 * stack �ڷᱸ�� �����ϱ�
 * @author song
 *
 */
public class StackStructure {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peak());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
	}
}

class Stack<T> {
	int position;

	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	// ������ �ִ� �ּҸ� �˸� �ȴ�.
	private Node<T> top;
	
	public T pop() {
		if (top==null) {
			throw new EmptyStackException();
		}
		
		// ������
		T item = top.data;
		top = top.next;
		// ������ ��ȯ
		return item;
	}
	
	public void push(T data) {
		Node<T> t = new Node<>(data);
		t.next = top;
		top = t;
	}
	
	public T peak() {
		if (top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
}
