package example_09_09_constructor;

public class Sample1App {
	public static void main(String[] args) {
		// �� ���� ����� ������ Sample1��ü ����
		Sample1 sample1 = new Sample1();	//Sample1Ŭ�����κ��� Sample1��ü�� �����Ͽ� sample1���������� �ּҰ��� ����
		// ������ �� ����
		int number = 100;					//intŸ�� number������ 100�� ����
		Student student = new Student("��ǻ�Ͱ��а�", "������", "010-1111-2222"); 
		//Student�� ���������� loading�ǰ� ���Ϸκ��� Student��ü�� ������ ���� �����ڸ� �����Ͽ� ������� �ʱ�ȭ���� �� student���������� �ּҰ��� ����
		System.out.println();
		System.out.println("changeValue�޼ҵ� ���� �� number: " + number); //100
		System.out.println("changeValue�޼ҵ� ���� �� Student: ");
		student.printStudentInfo();		//dept = "��ǻ�Ͱ��а�", name =  "������", phone = "010-1111-2222"
		
		// changeValue() �޼ҵ带 �����ؼ� �� �����ϱ�
		sample1.changeValue(number);		// �������� number�� ���� ������ ���� //sample1�� �����ϴ� ��üSample1�� changeValue�� number�� ���� ����
		sample1.changeValue(student);		// student�� ������� ���� ���� ////sample1�� �����ϴ� ��üSample1�� changeValue�� Student �ּҰ��� ����
		
		System.out.println();
		System.out.println("changeValue�޼ҵ� ���� �� number: " + number); //100
		System.out.println("changeValue�޼ҵ� ���� �� Student: "); //dept = "�����а�", name = "������", phone = "010-1111-1111"
		student.printStudentInfo();
	}
}
