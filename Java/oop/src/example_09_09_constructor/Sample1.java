package example_09_09_constructor;

public class Sample1 {

	
	// �⺻�ڷ������� ���޹޾Ƽ� ���� �����ϴ� �޼ҵ�
	void changeValue(int number) {
		System.out.println("���޹��� number�� ��" + number);
		number++;
		System.out.println("����� number�� ��" + number);
	}
	
	
	// ��ü�� ���޹޾Ƽ� ���� �����ϴ� �޼ҵ�
	void changeValue(Student student) {
		System.out.println("���޹��� student�� ��");
		student.printStudentInfo();
		
		student.no = 300;
		student.name = "������";
		student.dept = "�����а�";
		student.email = "kang@jhta.com";
		student.phone = "010-1111-1111";	//Student�� phone�ʵ忡 "010-1111-1111"���� ����
		
		System.out.println("����� student�� ��");
		student.printStudentInfo();			//student�� printStudentInfo �޼ҵ带 ����Ͽ� ���� ȭ�鿡 ���
	}
	
}
