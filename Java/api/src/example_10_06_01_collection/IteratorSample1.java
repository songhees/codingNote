package example_10_06_01_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorSample1 {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("ȫ�浿");
		names.add("�̼���");
		names.add("ȫ�浿");
		names.add("������");
		names.add("ȫ�浿");
		names.add("������");
		
		System.out.println("### Iterator�� �̿��� �ݺ�ó��");
		// ArrayList�� ������ Iterator������ü�� ȹ���Ѵ�.
		Iterator<String> iter = names.iterator();
		// while���� ����ؼ� �ݺ�ó���� �����Ѵ�.
		// hasNext()�� �ݺ�ó���� �����Ͱ� ���������� true�� ��ȯ�Ѵ�.
		while(iter.hasNext()) {
			// next()�� �����ִ� �������߿��� �ϳ��� ��ȯ�Ѵ�.
			String name = iter.next();
			System.out.println(name);
		}
		
		System.out.println("### ���� for���� �̿��ؼ� �ݺ�ó��");
		for (String name:names) {
			System.out.println(name);
		}
		
		//java.util.ConcurrentModificationException ���� �߻�
		//���� for���� ����ؼ� Collection<E>�� ������ü�� ����� ���� �ݺ�ó���߿� ����� ���� ������ �� ����.
//		for (String name:names) {
//			if (name.equals("ȫ�浿")) {
//				names.remove(name);
//			}
//		}
		
	}
}
