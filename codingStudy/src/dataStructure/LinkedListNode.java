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
		
		ll = new LinkedList();
		ll.append(2);
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(4);
		ll.append(2);
		ll.retrieve();
		ll.removeDups();
		ll.retrieve();
	}
}

/**
 * nodeŬ������ ���δ� Ŭ����
 * ù��° node�� data���� ��ǥ ���� �Ǹ�
 * ��ǥ ������ pointer�� ������ ����ϴ� �ٸ� object�� ������ �����.
 * ���� Node Ŭ������ Linked Ŭ������ ���μ� header�� �����Ͱ� �ƴ� LinkedList�� ������ �˸��� �뵵�� ����Ѵ�.
 * �� �ȿ� node Ŭ������ �����.
 * ù��° node�� header�� ���� �ִ°� �ƴ� �������� ���ҷθ� �����
 * �� �����Ϳ� �����͸� ��� node�� ���� �����
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
	
	// �ߺ��� �����ϴ� �Լ� �ð����⵵ O(n^2) ������ O(1) �Ʒ��� ����� �������� �ð��� �� ���� ������ ������ ȿ������ �ִ� �˰����̴�.
	// hashset�� ����(����) �ϸ� �ð����⵵�� ����� �پ������ O(n) ������ �־��� ���(�ߺ��� ���� ���) O(n)[�������hashsetũ��] ��ŭ ��� 
	void removeDups() {
		Node n = header;
		// ������ ��尡 �ߺ����̿��� ������ ��� r.next : ������ ��� 
		// n�� n.next�� null ���� �Ǿ� ������. ���� �ݺ����� ����Ǿ�� �ϹǷ� n != null�� �߰��Ѵ�.
		while(n != null && n.next != null) {	
			// runner�߰� �׻� n�� ��ġ
			Node r = n; 
			while (r.next != null) {			// ������ ��忡�� ���� �ʴ´�.
				if (n.data == r.next.data) {	// ������ ������ ���ϱ� ���� r�� �ƴ� r.next�� ���Ѵ�.
					r.next = r.next.next;
				} else {
					r = r.next;
				}
			}
			
			n= n.next;
		}
	}
}

