package example_09_29_object;

public class ObectApp2 {
	public static void main(String[] args) {
		
		Student student1 = new Student(100, "ȫ�浿", "��ǻ�Ͱ��а�", 3);
		Student student2 = new Student(100, "ȫ�浿", "��ǻ�Ͱ��а�", 3);
		Student student3 = student1;
		Student student4 = student2;
		
		// Object�� int hashCode()
		// ��ü�� �ؽ��ڵ尪�� ������ ��ȯ�Ѵ�.
		// ���� ��ü�� �ؽ��ڵ尪�� ����.
		// �ؽ��ڵ尪�� ������ ���� ��ü��(true�� ���� �ְ� false�� ���� �ִ�.)
		System.out.println("��ü�� �ؽ��ڵ尪�� ����غ���");
		int result1 = student1.hashCode();
		int result2 = student2.hashCode();
		int result3 = student3.hashCode();
		int result4 = student4.hashCode();
		System.out.println("�ؽ��ڵ� " + result1);
		System.out.println("�ؽ��ڵ� " + result2);
		System.out.println("�ؽ��ڵ� " + result3);
		System.out.println("�ؽ��ڵ� " + result4);
		
	}
}
