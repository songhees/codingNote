package example_09_17_polymorphism;

import java.util.Scanner;

public class PersonApp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PersonService personService = new PersonService();
		
		while(true) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.��ȸ	2.���	3.�˻�	0.����");
			System.out.println("--------------------------------------------------------");
			
			System.out.print("�޴� ��ȣ �Է�: ");
			int menuNo = scan.nextInt();
			
			if (menuNo == 1) {
				System.out.println("[��ȸ]");
				personService.printAllPerson();
				
				
			} else if (menuNo == 2) {
				System.out.println("[�ű� ���]");
				System.out.println("### �ű� ����� �л�, ���� Ȥ�� ���������� �Է��ϼ���.");				
				
				System.out.println("�̸� �Է�: ");
				String name = scan.next();
				
				System.out.println("��ȭ��ȣ �Է�: ");
				String tel = scan.next();
				
				
				System.out.println("���Ÿ�� ����(�л�, ����, ���� �� ����): ");
				String type = scan.next();
			
				if ("����".equals(type)) {
					System.out.println("����а� �Է�: ");
					String dept = scan.next();
					
					System.out.println("���� �Է�: ");
					String position = scan.next();
					
					System.out.println("�������� �Է�: ");
					String researchProject = scan.next();
					
					personService.addNewPerson(new Professor(type, name, tel, dept, position, researchProject));
				
				} else if ("�л�".equals(type)) {
					System.out.println("�г� �Է�: ");
					int grade = scan.nextInt();
					
					System.out.println("�Ҽ��а� �Է�: ");
					String dept = scan.next();
					
					personService.addNewPerson(new Student(type, name, tel, grade, dept));
					
				} else if ("����".equals(type)) {
					System.out.println("�ҼӺμ� �Է�: ");
					String dept = scan.next();
					
					System.out.println("���� �Է�: ");
					String job = scan.next();
					
					System.out.println("�޿� �Է�: ");
					int salary = scan.nextInt();
					
					Employee employee = new Employee(type, name, tel, dept, job, salary);
					personService.addNewPerson(employee);
				}
				
				
			} else if (menuNo == 3) {
				System.out.println("[�˻�]");
		
				System.out.println("�˻���� �Է�(��ȣ, �̸� �� ����)");
				String opt = scan.next();
				
				if ("��ȣ".equals(opt)) {
					System.out.println("��ȣ �Է�: ");
					int no = scan.nextInt();
					// �����ڷ����� null���� �׻� Ȯ��
					// ��ȯŸ���� �����ڷ����� �޼ҵ��� ��ȯ���� null�� ���� �ִ�.��.��.��.��.��
					Person person = personService.searchPerson(no);
					if ( person != null) {
						person.print();
					} else {
						System.out.println("### �Է��� ��ȣ�� ��ġ�ϴ� ������ �����ϴ�.");
					}
					
				} else if ("�̸�".equals(opt)) {
					System.out.println("�̸� �Է�: ");
					String name = scan.next();
					// ��ȯŸ���� �����ڷ����� �޼ҵ��� ��ȯ���� null�� ���� �ִ�.��.��.��.��.��
					Person person = personService.searchPerson(name);
					if ( person != null) {
						person.print();
					} else {
						System.out.println("### �Է��� �̸��� ��ġ�ϴ� ������ �����ϴ�.");
					}
				}
				
				
			} else if (menuNo == 0) {
				System.out.println("[���α׷� ����]");
				break;
			} 	
		}
		scan.close();
	}
}
