package example_08_31_operator;

public class Sample3 {
	public static void main(String[] args) {
		/*
		 * ���Կ�����
		 * =	 +=		 -=		 *=		 /=		 %=
		 * ������ �켱������ ���� ���� �����ڴ�.
		 * 
		 * = �� ������ ���� �����Ѵ�. == ������ ���� ���ο� ������ �����Ѵ�.
		 */
		int num = 10; 
		System.out.println("num�� ��: "+num);	//10
		
		num = 5;
		System.out.println("num�� ��: "+num);	//5
		
		// +=�� ������ ���� ������ ����ŭ ������Ų��.
		num += 20;	// num = num + 20; �� �����ϴ�.
		System.out.println("num�� ��: "+num);	// 25
		
		// -=�� ������ ���� ������ ����ŭ ���ҽ�Ų��.
		num -= 10;	// num = num - 10; �� �����ϴ�.
		System.out.println("num�� ��: "+num);	// 15
		
		// *=�� ������ ���� ������ ����ŭ ���Ѱ��� ������ �����Ѵ�.
		num *= 3;	// num = num*3; �� �����ϴ�.	// 45
		System.out.println("num�� ��: "+num);
		
		// /=�� ������ ���� ������ ������ �������� ������ �����Ѵ�.
		num /= 9;	//
		System.out.println("num�� ��: "+num);	// 5
		
		// %=�� ������ ���� ������ ������ ���� �� �������� ������ �����Ѵ�.
		num %= 3;
		System.out.println("num�� ��: "+num);	// 2
		

		
		
	}
}
