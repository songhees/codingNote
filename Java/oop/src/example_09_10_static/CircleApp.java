package example_09_10_static;

public class CircleApp {
	public static void main(String[] args) {
		
		/*
		 *  ���������� Ŭ�����̸�.���������� ����Ѵ�.
		 *  ��ü �������̵� ��밡���ϴ�.
		 */
		System.out.println(Circle.PI);		// Ŭ���� ��������� �ִ� Ŭ�������� PI�� ȣ��
		
		// �������� �߿��� final Ű���带 �ٿ��� ����� ���� ���� �ѹ� ������ ���� ������ �� ����.
		// Circle.PI = 3.14;	// ����, ���� ������ �� ����.
		
		Circle circle1 = new Circle(5);
		Circle circle2 = new Circle(10);
		Circle circle3 = new Circle(15);
		Circle circle4 = new Circle(20);
		Circle circle5 = new Circle(25);
		
		System.out.println("������ 5�� ���� ����: " + circle1.getArea());
		System.out.println("������ 10�� ���� ����: " + circle2.getArea());
		System.out.println("������ 15�� ���� ����: " + circle3.getArea());
		System.out.println("������ 20�� ���� ����: " + circle4.getArea());
		System.out.println("������ 25�� ���� ����: " + circle5.getArea());
		
		
	}
	
}
