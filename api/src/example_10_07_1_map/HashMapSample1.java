package example_10_07_1_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSample1 {
	public static void main(String[] args) {
		Map<Integer, Product> productMap = new HashMap<>();
		// value ==> Product�� �ּҰ�
		// key ==> ��ȣ
		// 1��° ����: key value�� ������ ���� �� �ִ�.
		// V put(K key, V value) : Map������ �ڷᱸ�� ��ü�� ���ο� key, value���� ���� �����Ѵ�.
		productMap.put(101, new Product(101, "�ƺ����� M1", 1_690_000));
		productMap.put(102, new Product(102, "���ÿ�ġ 7", 690_000));
		productMap.put(103, new Product(103, "�������ø�3", 2_000_000));
		productMap.put(104, new Product(104, "�Ƹ��� Ų��", 200_000));
		productMap.put(105, new Product(105, "�����е� ����", 1_500_000));
		
		// V get(Object key) : Map������ �ڷᱸ�� ��ü���� ������ key�� ����� Value��ü�� ��ȸ�Ѵ�.
		System.out.println("### Map ��ü���� key�� ����� Value ã��");
		Product product1 = productMap.get(103);
		
		System.out.println(product1.getNo());
		System.out.println(product1.getName());
		System.out.println(product1.getPrice());
		System.out.println();
		
		// boolean isEmpty() : Map������ �ڷᱸ�� ��ü�� ����� �����Ͱ� �ϳ��� ������ true�� ��ȯ�Ѵ�.
		// int size() : Map������ �ڷᱸ�� ��ü�� ����� key, value���� ������ ��ȯ�Ѵ�.
		// void clear() : Map������ �ڷᱸ�� ��ü�� ����� ��� ������ �����Ѵ�.
		
		// boolean containsKey(Object key)
		boolean isExist = productMap.containsKey(100);
		System.out.println("### HashMap�� 100�� Key�� ���ԵǾ� �ִ°�? " + isExist);
		// �߿�! Map������ key�� �����ڰ� �� �ȴٴ� ���� �Ͽ� ����ϹǷ� �ݺ����� ����ؼ� ������ �ʰ� key�� �ٷ� ����
		// Set<Map.Entry<K, V>> entrySet() : Map������ �ڷᱸ�� ��ü�� ����� Entry�� Set��ü�� ��Ƽ� ��ȯ�Ѵ�.
		System.out.println("### HashMap�� ����� ��� Entry�� ��ȸ�ؼ� ����ϱ�");
		Set<Entry<Integer, Product>> entries = productMap.entrySet();
		for(Entry<Integer, Product> entry : entries) {
			int key = entry.getKey();
			Product value = entry.getValue();
			System.out.println("[" + key + "] name:" +  value.getName() +", price: " + value.getPrice());
		
		}
		
		
		
		
	}
	
	static class Product {
		private int no;
		private String name;
		private int price;
		
		public Product(int no, String name, int price) {
			super();
			this.no = no;
			this.name = name;
			this.price = price;
		}

		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
		
	
	}
}
