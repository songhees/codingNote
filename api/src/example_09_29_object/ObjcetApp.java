package example_09_29_object;

public class ObjcetApp {
	public static void main(String[] args) {
		
		Student student1 = new Student(100, "ȫ�浿", "��ǻ�Ͱ��а�", 3);
		Student student2 = new Student(100, "ȫ�浿", "��ǻ�Ͱ��а�", 3);
		Student student3 = student1;
		Student student4 = student2;
		
		// Objcet�� boolean equals(Object other)
		// �Ű������� Object�� � ��ü�� �����ϴ� ��� ��
		// �� ��ü�� �������� ���ؼ� �������� ���� ��쿡 true�� ��ȯ�Ѵ�.
		System.out.println("��ü�� ������ ��ü���� ���θ� Ȯ������.");
		boolean result1 = student1.equals(student2);
		boolean result2 = student2.equals(student1);
		System.out.println("������ ��ü�ΰ�?" + result1);
		System.out.println("������ ��ü�ΰ�?" + result2);
	
		boolean result3 = student1.equals(student3);
		boolean result4 = student2.equals(student4);
		System.out.println("������ ��ü�ΰ�?" + result3);
		System.out.println("������ ��ü�ΰ�?" + result4);
		
		// ��ü�� ���ؼ� �� �����ڸ� ����� �� �ִ�.
		// ��ü�� ���ؼ� �� ������ �����ϸ� �ּҰ� �񱳸� �Ѵ�.
		boolean result5 = student1 == student2;
		boolean result6 = student1 == student3;
		System.out.println("������ ��ü�ΰ�?" + result5);
		System.out.println("������ ��ü�ΰ�?" + result6);
	}
}
