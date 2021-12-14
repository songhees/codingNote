package example_10_07_2_comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSample1 {
	public static void main(String[] args) {
		// Arrays.asList(E ....e)�� ������ ��ü���� ����� List �ڷᱸ�� ��ü�� ��ȯ�Ѵ�.
		List<Integer> numbers = Arrays.asList(10, 20, 3, 57, 1, 63, 18, 21, 32);
//		System.out.println(numbers.getClass().getName());
		
		//Collections.sort(List<E> list)�� List��ü�� ����� ��ҵ��� ������������ �����Ѵ�.
		Collections.sort(numbers);
		System.out.println(numbers);
		
		//Collections.reverse(List<E> list)�� List��ü�� ����� ��ҵ��� �������� �ٽ� �����Ѵ�.
		Collections.reverse(numbers);
		System.out.println(numbers);
		
		// ���ڿ��� �����غ���
		List<String> names = Arrays.asList("������", "ȫ�浿", "�̼���", "������", "������");
		Collections.sort(names);
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
	}
}
