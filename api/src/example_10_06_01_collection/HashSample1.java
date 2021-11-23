package example_10_06_01_collection;

import java.util.HashSet;

public class HashSample1 {
	public static void main(String[] args) {
		// ���ڿ��� ���� �� ��� �迭�� �����ϱ�
		String[] array = new String[5];
		// �迭�� ������(��ü)�� ������ ���� �ε����� ��� �ٲ㰡�鼭 �����͸� �����Ѵ�.
		array[0] = "�̼���";
		array[1] = "������";
		array[2] = "������";
		array[3] = "������";
		array[4] = "���߱�";
//		array[5] = "�豸";		// ����, �迭�� �ε��������� �ʰ��ߴ�. �迭�� �ڵ����� ũ�Ⱑ �������� �ʴ´�.
		
		// �迭�� ����� ������(��ü) ����ϱ�
		System.out.println("### �ֱ����� �̸� ����ϱ�");
		for(String name : array) {
			System.out.println("�ֱ����� �̸�: " + name);
		}
		
		// ���ڿ��� ���� �� ��� Hashset��ü�� �����ϱ�
		HashSet<String> set = new HashSet<>();
		// HashSet��ü�� ������(��ü)�� ������ ���� add(E e)�޼ҵ带 �����ؼ� �����͸� �����Ѵ�.
		// �迭���� ���� �����͸� ������ �� �ִ�.
		// ��������� �����ϸ� �ڵ����� ��������� �ø���.
		set.add("�����");		
		set.add("������");		
		set.add("��μ�");		
		set.add("����");		
		set.add("����");		
		set.add("���ڿ�");		
		set.add("ġ��");
		set.add("��");
		set.add("����");
		
		// HashSet<E>�� ����� ������(��ü) ����ϱ�
		System.out.println("### �̸� ����ϱ�");
		for(String name : set) {
			System.out.println("�̸�: " + name);
		}
		
	}
}
