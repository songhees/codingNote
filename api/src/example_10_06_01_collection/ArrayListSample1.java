package example_10_06_01_collection;

import java.util.ArrayList;

public class ArrayListSample1 {
	public static void main(String[] args) {
		
		// ArrayList>E>�� �ֿ� API
		
		ArrayList<String> list = new ArrayList<>(); // java7�̸��� ���������� <>() <String>()�� ��ߵȴ�.
		
		// boolean add(E e) : ArrayList��ü�� ��ü�� �����Ѵ�.
		//					  �� ������ ��ü ������ ��ü�� ����ȴ�.
		list.add("ȫ�浿");
		list.add("������");
		list.add("ȫ�浿");
		list.add("�̼���");
		list.add("ȫ�浿");
		list.add("������");
		
		// void clear() : ArrayList��ü�� ����� ��簴ü�� �����Ѵ�.
		// list.clear();
		
		// boolean isEmpty() : ArrayList��ü�� ����� ��ü�� �ϳ��� ������ true�� ��ȯ�Ѵ�.
		System.out.println("### ����� ��ü�� �ϳ��� ���°�? " + list.isEmpty());
		
		// int size() : ArrayList��ü�� ����� ��ü�� ������ ��ȯ�Ѵ�.
		System.out.println("### ����� ��ü�� ����: " + list.size());
		
		// boolean contains(Object e) : ArrayList��ü�� ������ ��ü�� �����ϸ� true�� ��ȯ�Ѵ�.
		System.out.println("### \"������\"�� ���ԵǾ� �ִ°�? " + list.contains("������"));
		
		// boolean remove(Object e) : ArrayList��ü�� ������ ��ü�� �����Ѵ�.
		list.remove("ȫ�浿"); // �� ó�� �߰ߵ� ��ü�� �����Ѵ�.
		
		
		// ArrayList�� ����� �����͸� �������
		// ���� for���� �̿��ؼ� ����ϱ�
		for(String name : list) {
			System.out.println("### ����� �̸�: " + name);
		}
		
		System.out.println("### ArrayList�� ������ ��ü�� ������ ����غ���");
		System.out.println(list);
	}
}
