package example_09_29_object;

public class ObjectApp3 {
	public static void main(String[] args) {
		Student student1 = new Student(100, "ȫ�浿", "��ǻ�Ͱ��а�", 3);
		Student student2 = new Student(200, "������", "���ڰ��а�", 2);
		Student student3 = new Student(300, "������", "����Ʈ������а�", 1);
		
		// Object�� String toString()
		// ��ü�� ����(Ŭ��������ü�̸�@�ؽ��ڵ�)�� ���ڿ��� ��ȯ�Ѵ�.
		System.out.println("��ü�� ������ ��ȸ�غ���");
		String result1 = student1.toString();
		String result2 = student2.toString();
		String result3 = student3.toString();
		
		System.out.println("��ü�� ����: " + result1);
		System.out.println("��ü�� ����: " + result2);
		System.out.println("��ü�� ����: " + result3);
		
		// System.out.println(��������)�� ���������� ����� ������(�ּҰ�)�� ������� �ʴ´�.
		// System.out.println(��������)�� System.out.println(��������.toString())�� ���ؼ� ����ȴ�.
		System.out.println("���������� �ܼ�ȭ�鿡 ����� ���");
		System.out.println(student1);				// �������� student1�� �ּҰ��� �ƴ϶�, student1�� �����ϴ� ��ü�� toString()�� ��ȯ���� ��µȴ�.
		System.out.println(student2);				// �������� student2�� �ּҰ��� �ƴ϶�, student2�� �����ϴ� ��ü�� toString()�� ��ȯ���� ��µȴ�.
		System.out.println(student3);				// �������� student3�� �ּҰ��� �ƴ϶�, student3�� �����ϴ� ��ü�� toString()�� ��ȯ���� ��µȴ�.
		System.out.println("���������� �����Ǵ� ��ü�� toString()�� ��ȯ�ϴ� ���� ����� ���");
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
	
		
		System.out.println("�迭�� ����� Student��ü�� ���� ����ϱ�");
		Student[] students = new Student[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		
		System.out.println(students.toString());
		System.out.println(java.util.Arrays.toString(students));
		
		
	}
}
