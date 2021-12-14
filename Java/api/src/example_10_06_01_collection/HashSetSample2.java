package example_10_06_01_collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetSample2 {
	public static void main(String[] args) {
		
		// HashSet<E>�� �ֿ� API����ϱ�
		// HashSet<E>�� �θ� �������̽� Set<E>���� Set.of() �����޼ҵ尡 �ִ�.
		// Set<E> Set.of()				: Set ������ü�� �����Ѵ�.
		// Set<E> Set.of(E e)			: ��ü�� �ϳ� ����� Set ������ü�� �����Ѵ�.
		// Set<E> Set.of(E e, E e)		: ��ü�� �ΰ� ����� Set ������ü�� �����Ѵ�.
		// Set<E> Set.of(E e, ... E e)	: ��ü�� ������ ����� Set ������ü(HashSet or TreeSet)�� �����Ѵ�.
		Set<String> names = Set.of("���", "���ڿ�", "����", "������");
		// Set��������			Set�� ������ü ����
		HashSet<String> set = new HashSet<>();
		
		// boolean add(E e) : ������ ��ü�� HashSet��ü�� �����Ѵ�. ������ �����ϸ� true�� ��ȯ�Ѵ�.
		set.add("�����");
		set.add("���ڿ�");
		set.add("�����");	// �̹� "�����"�� HashSet�� �����ϱ� ������ ������� �ʴ´�. �ߺ��� ������� ����
		set.add("�����");	// �̹� "�����"�� HashSet�� �����ϱ� ������ ������� �ʴ´�.
		
		// boolean isEmpty() : HashSet<E>�� ��������� true�� ��ȯ�Ѵ�.
		System.out.println("HashSet<E> ��ü�� ����ִ°�? " + set.isEmpty()); // false
		
		// 	void clear() : HashSet<E>�� ����� ��� ��ü�� �����Ѵ�.
		// set.clear();
		System.out.println("HashSet<E> ��ü�� ����ִ°�? " + set.isEmpty()); // true
		
		// String toString() : HashSet<E>�� Object�� toString() �޼ҵ带 �������ߴ�.
		//					   HashSet<E>�� ����� ��ü�� toString()�� �����Ѵ�.
		
		// boolean addAll(Collection<? extends E//==(String)//> collection) : �ٸ� Collection������ü�� ����� ������(��ü)�� ���� �����Ѵ�. 
		// 				  Collection<? extends E>�� Collection������ü�� E�� E�� ����Ÿ���� �����ϰ� �־�� �ȴ�.
		//				  E�� addAll()�޼ҵ带 ȣ���ϴ� ��ü�� Ÿ�����ĸ����͸� ������.
		//				  �츮�� ������ ��ü�� HashSet<String>�̱� ������ E�� String�̴�.
		//				  ����, Collection<String>, Set<String>, List<String>, HashSet<String>,
		//				  		 ArrayList<String>, Vector<String>, LinkedList<String>, Stack<String>�� �����ϴ�.
		set.addAll(names);
		System.out.println(set.toString());
		
		// int size() : HashSet<E>��ü�� ����� ��ü�� ������ ��ȯ�Ѵ�.
		System.out.println("����� ��ü�� ��: " + set.size());
		
		// boolean contain(Object e) : HashSet<E>��ü�� ������ ��ü�� �����ϸ� true�� ��ȯ�Ѵ�.
		System.out.println("\"ġ��\"��� �̸��� ����� �����ϴ� ��? " + set.contains("ġ��"));
		System.out.println("\"���ڿ�\"��� �̸��� ����� �����ϴ� ��? " + set.contains("���ڿ�"));
		
		// boolean remove(Object e) : HashSet<E>��ü�� ������ ��ü�� �����ϸ� �����ϰ� true�� ��ȯ�Ѵ�.
		set.remove("���ڿ�");
		System.out.println("���� �� ����� ��ü�� ��: " + set.size());
		
		
		System.out.println(set);
	}
}
