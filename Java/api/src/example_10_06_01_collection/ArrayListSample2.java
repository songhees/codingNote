package example_10_06_01_collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample2 {
	public static void main(String[] args) {
		// ��ü�� ����� ���� ��� ������ ���ÿ� �Ѵ�. new ArrayList<>(); -> list.add("");
		List<String> list = new ArrayList<>();
		list.add("���");
		list.add("������");
		list.add("�丶��");
		
		// void add(int index, E e) : ������ �ε����� ��ü�� �߰��Ѵ�. ���� ��ü�� �ڷ� �̵��ȴ�.
		list.add(1, "���ξ���");
		
		System.out.println("### List��ü�� ������ ���캸��");
		System.out.println(list);
		
		// E set(int index, E e) : ������ �ε����� ����� ��ü�� ���ο� ��ü�� ��ü�Ѵ�.
		list.set(0, "����");
		
		System.out.println("### List��ü�� ������ ���캸��");
		System.out.println(list);
		
		// E remove(int index) : ������ �ε����� ����� ��ü�� �����Ѵ�.
		list.remove(3);
	
		System.out.println("### List��ü�� ������ ���캸��");
		System.out.println(list);
		
		// E get(int index) : ������ �ε��� ��ġ�� ����� ��ü�� ��ȯ�Ѵ�.
		String name0 = list.get(0);
		String name1 = list.get(1);
		String name2 = list.get(2);
		System.out.println(name0 + ", " + name1 + ", " + name2);
		
		// �ϴ� for���� �̿��ؼ� ArrayList�� ����� ��� ������ ��������
		System.out.println("### �Ϲ� for���� ����ؼ� ArrayList��ü�� ����� �� ��������");
		int length = list.size();
		for (int index = 0; index < length; index++) {
			String name = list.get(index);
			System.out.println(name);
		}
		
		// for���� ���ǽĿ��� list.size()�� ������ ������ ��ȸ�ϴ� ���� ���༺���� ���ڰ� �����.
//		for (int index = 0; index < list.size(); index++) {
//			String name = list.get(index);
//			System.out.println(name);
//		}
	}
}
