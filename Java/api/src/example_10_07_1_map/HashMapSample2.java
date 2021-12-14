package example_10_07_1_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSample2 {
	public static void main(String[] args) {
		// ��ǰ������ ǥ���ϴ� �׸���� ȭ�鿡 ���� �ſ� �������� ��, ������ ValueObject�� �����ϱ� ���ٴ� Map���� �����ϴ� ���� ����.
		// valueObject�� ��ü��
		
		// ����ȭ�鿡�� ǥ�õǴ� ��ǰ����
		// ��ǰ������ �ʿ�
		Map<String, Object> mainProduct = new HashMap<>();
		mainProduct.put("name", "���� �Ż� ����");
		mainProduct.put("price", 35000);
		mainProduct.put("discountPrice", 32500);
		
		// ī�װ��� ��ǰ���ȭ�鿡 ǥ�õǴ� ��ǰ����
		// ��ǰ���� + �������� �ʿ�
		Map<String, Object> categoryProduct = new HashMap<>();
		categoryProduct.put("name", "���� �Ż� ����");
		categoryProduct.put("price", 35000);
		categoryProduct.put("discountPrice", 32500);
		categoryProduct.put("reviews", 13);
		categoryProduct.put("score", 4.5);
		categoryProduct.put("likes", 100);
		
		// ��ȭ��
		// ��ǰ���� + �������� + �̻�ǰ�� ������ ������� �� ��ǰ����(��������)
		Map<String, Object> detailProduct = new HashMap<>();
		detailProduct.put("name", "���� �Ż� ����");
		detailProduct.put("price", 35000);
		detailProduct.put("discountPrice", 32500);
		detailProduct.put("reviews", 13);
		detailProduct.put("score", 4.5);
		detailProduct.put("likes", 100);
		// ����ǰ�� ������ ������� ������ ��ǰ�̸�
		List<String> productNames = new ArrayList<>();
		productNames.add("���� �Ż� ����");
		productNames.add("���� �Ż� ����");
		productNames.add("���� �Ż� ������");
		
		detailProduct.put("suggestProductNames", productNames);
		
		// Map�� ����� �پ��� �� ������
		// ����1. Ű�� ��Ÿ�� �־ üũ���� �ʴ´�.
		detailProduct.get("nane"); // �������� �ȳ���
		// ����2. �ɿ��� ���� ������ �� ����ȯ�� �ʿ��ϴ�.
		String name = (String)detailProduct.get("name");
		int price = (Integer)detailProduct.get("price");
		System.out.println("��ǰ�̸�: " + name);
		System.out.println("��ǰ����: " + price);
		
	}
}
