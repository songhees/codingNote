package example_09_06_class;

public class ProductApp {
	public static void main(String[] args) {
		// ��ǰ������ ���� �� �����ϱ� ���� �迭 �����ϱ�
		Product[] products = new Product[3];
		
		Product item1 = new Product();
		item1.number = 10;
		item1.name = "apple watch 6";
		item1.make = "apple";
		item1.price = 539_000;
		item1.sale = 500_000;
		item1.stock = 10;
		
		Product item2 = new Product();
		item2.number = 20;
		item2.name = "�����ÿ�ġ 4";
		item2.make = "�Ｚ����";
		item2.price = 399_000;
		item2.sale = 350_000;
		item2.stock = 30;
		
		Product item3 = new Product();
		item3.number = 30;
		item3.name = "���������� 945";
		item3.make = "����";
		item3.price = 749_000;
		item3.sale = 720_000;
		item3.stock = 5;
		
		// �迭�� ��ǰ���� �����ϱ�
		products[0] = item1;
		products[1] = item2;
		products[2] = item3;
		
		// ��� ��ǰ������ ȭ�鿡 ����ϱ�		
		int totalStock = 0;
		int totalStockPrice = 0;
		System.out.println("�迭�� ����� ��� ��ǰ������ ���");
		for (Product product : products) {
			System.out.print(product.number + "\t");
			System.out.print(product.name + "\t");
			System.out.print(product.make + "\t");
			System.out.print(product.price + "\t");
			System.out.print(product.stock + "\t");
			System.out.println(product.sale);
		}
		
		System.out.println("�迭�� ����� ��� ��ǰ������ �����Ȳ�� ���");
		for (Product product : products) {
			System.out.print(product.number + "\t");
			System.out.print(product.name + "\t");
			System.out.print(product.make + "\t");
			System.out.print(product.price + "\t");
			System.out.print(product.stock + "\t");
			System.out.println(product.stock*product.price);
			
			totalStock += product.stock;
			totalStockPrice += product.stock*product.price;
		}
		System.out.println("�迭�� ����� ��� ��ǰ������ �� ��ǰ����, �� ������� ���");
		System.out.println("�� ��ǰ����: " + totalStock);
		System.out.println("�� �����: " + totalStockPrice);
	}
}
