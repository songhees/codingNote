package dataStructure;

public class LinkedListNode {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.retrieve();
		ll.delete(1);		// ù��° ���� �� ��������.
		ll.retrieve();
		LinkedList.Node ne = ll.header; // node�� �ּҰ� ��� �ִ� ne ��
	}
}

/**
 * ù��° node�� data���� ��ǥ ���� �Ǹ�
 * ��ǥ ������ pointer�� ������ ����ϴ� �ٸ� object�� ������ �����.
 * ���� Node Ŭ������ Linked Ŭ������ ���μ� header�� �����Ͱ� �ƴ� LinkedList�� ������ �˸��� �뵵�� ����Ѵ�.
 * �� �ȿ� node Ŭ������ �����.
 * 
 * @author song
 *
 */
class LinkedList {
	Node header;			// ù��° ���� ���� ��� �ִ� node�� �ƴ� �����뵵�θ� ���δ�.
	
	static class Node {
		int data;
		Node next = null;
	}
	
	LinkedList() {
		header = new Node();
	}

	void append(int d) {
		Node end = new Node();
		end.data = d;
		Node n = header;
		
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	void delete(int d) {
		Node n = header;
		
		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
			} else {
				n = n.next;
			}
		}
	}
	
	void retrieve() {
		Node n = header.next;
		
		while (n.next != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.println(n.data);
	}
}

