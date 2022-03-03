package dataStructure;
/**
 * �ܹ��� class Node �����ϱ�
 * header�� list�� ù��° ���̸� ��ǥ�̴�.
 * header�� �����Ǹ� �ٸ� node�� header�� pointer�� ������ �����Ƿ� ������ �����.
 * 
 * ������(pointer)
 * ���α׷��� ���� �ٸ� ����, Ȥ�� �� ������ �޸� �����ּҸ� ����Ű�� ������ ���Ѵ�.
 * �����Ͱ� ����Ű�� ���� �������� ���� ��������� �Ѵ�.
 * java���� ����Ʈ ������ ���� ����. ������ Call By Value �̳� Ŭ���������� Call By Reference�̱� �����̴�.
 * �ϳ��� �޼ҵ忡�� ���ǵ� ������ �� �޼ҵ� �ȿ����� ���� ������ �ȴ�.
 * ������ Ŭ������ ���������� ������ �� Ŭ���� �ȿ� �ִ� �������� �ٲٸ� ���� ����ȴ�.
 * java�� �޸� �ٸ� ���(C, C++)�� ���� Call By Value�̴�.
 * @author song
 *
 */
public class Linked_List {
	
	public static void main(String[] args) {
		
		Node head = new Node(1);
		head.append(2).append(3).append(4);
		head.retrieve();
		// append���� n�� head�� �ǰ� 2�� ���� end node�� �����.  
		// head�� next ����� ���� null �̱� ������ next�� end node�� �ǰ� �ȴ�.
		// Node Ŭ������ Node next�� ���� ��带 �����ϴ� ��� ���� ���̴�! �ڡڡ�
		// �� ������� ���� ��ü�� �ٷ� �����ϴ� ������ ��������
//		head.append(3); // �̹� next���� ���� �����Ƿ� �� ���� node�� next���� �ش� ��尡 ���� �ȴ�.
		head.delete(3);
		head.delete(2);
		head.retrieve();
		head.delete(1); // header���� ������ �� ����.
	}
}

class Node {
	int data;
	Node next = null;	// �ش� ����� �� ���� node ��ü(�ּ�)
	
	Node(int d) {	// ������
		this.data = d;
	}
	
	Node append(int d) {
		Node end = new Node(d);		// ���� ���
		Node n = this;				// pointer ù��° ���
		while (n.next != null) {	// null�̸� ������ ����� ��
			n = n.next;				// �ּҰ� ��ü (���� ���� ��ü)
		}
		
		n.next = end; // ������ ����� next�� ���� ������ ��带 �־��ش�.
		return n.next;	// ������ ��� ���� return�ϰ� �Ǹ� �ٷ� ������ ��忡�� ���� ��� ���� �ֱ� ���� ���̴�.
	}
	
	void delete(int d) {			// ������ ��
		Node n = this;				// ������ pointer ó�� node 
		while (n.next != null) {	// ��� ó������ ������ ���� �� // ������ n�� next�� null �̱⶧���� �ȿ��� ������ node�� �� �� ����.
			if (n.next.data == d) {	// ��忡 ����  ã�� ��	// n�� ���� node�� ���� �Ǵ���, ������ node�� �� �� ������ ù���� node�� Ȯ���� �� ����.
				n.next = n.next.next;	// ���� ��尡 ���� node�� data�� ������ ���� �Ǵ��Ѵ�. 
				// n�� ��忡�� ���� ��尡 ������ ����̸� n�� ���� ��带 n.next.next�� �ٲ۴�. �� n�� ���� node �ּ� ���� n.next.next�� �ٲ۴�.
				// n.next���� �����
			} else {
				n = n.next;		// ���� node�� �̵�
			}
		}
	}
	
	void retrieve() {
		Node n = this;
		while (n.next != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.println(n.data);
	}
}
