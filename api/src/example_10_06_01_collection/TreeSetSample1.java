package example_10_06_01_collection;

import java.util.TreeSet;

public class TreeSetSample1 {
	public static void main(String[] args) {
		
		TreeSet<String> names = new TreeSet<>();
  		
		// TreeSet<E>�� ����Ǵ� ��ü�� ������������ �����ؼ� �����Ѵ�.
		names.add("�̼���");
		names.add("������");
		names.add("���߱�");
		names.add("������");
		names.add("��âȣ");
		names.add("�豸");
		names.add("������");
		names.add("�ѿ��");
		names.add("�̺�â");
		
		for(String name : names) {
			System.out.print(name + "\t");
		}
		System.out.println();
		
	}
}
