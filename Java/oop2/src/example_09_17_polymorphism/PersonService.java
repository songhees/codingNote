package example_09_17_polymorphism;
/**
 * �л�, ����, �������� ���� ���, ��ȸ, ��� ������ �����ϴ� Ŭ������.
 * @author ������
 *
 */
public class PersonService {
	/**
	 * �л�, ����, ������ ������ ����Ǵ� �迭
	 */
	private Person[] database = new Person[100];
	
	/**
	 * database�� �����ϴ� �迭���� ���ο� ������ ����Ǵ� ��ġ������ ������ �ִ� ������.
	 */
	private int position = 0;
	/**
	 * PersonService�� �⺻ ������ �޼ҵ� =>�ٹٲ� <br/>
	 * �׽�Ʈ�� ���ؼ� ���� database���������� �����ϴ� �迭�� �׽�Ʈ�� �����͸� �̸� �����Ѵ�.
	 */
	public PersonService() {
		database[position++] = new Student("�л�", "ȫ�浿", "010-2586-7530", 3, "���ڰ��а�");
		database[position++] = new Student("�л�", "������", "010-2222-3333", 1, "������а�");
		database[position++] = new Student("�л�", "����", "010-4567-7890", 2, "��ǻ�Ͱ��а�");
		database[position++] = new Student("�л�", "������", "010-3478-1231", 2, "�濵�а�");
		database[position++] = new Student("�л�", "���߱�", "010-2431-0000", 3, "���ڰ��а�");
		database[position++] = new Student("�л�", "��âȣ", "010-1892-4133", 2, "�����а�");
		database[position++] = new Professor("����", "�豳��", "010-2586-7530", "���ڰ��а�", "�α���", "�� ��������� ���� ������Ʈ");
		database[position++] = new Professor("����", "������", "010-1111-7777", "�������", "�α���", "�ܹ��� ���� ���� ������Ʈ");
		database[position++] = new Professor("����", "�ڱ���", "010-3211-1777", "�����а�", "������", "�ΰ����� ������Ʈ");
		database[position++] = new Professor("����", "�̱���", "010-7878-9999", "��ǻ�Ͱ��а�", "������", "���α׷� ����");
		database[position++] = new Employee("����", "���߱�", "010-853-9510", "������", "����", 4_500_000);
		database[position++] = new Employee("����", "������", "010-1234-6543", "������", "����", 4_000_000);
		database[position++] = new Employee("����", "������", "010-8378-1207", "������", "����", 3_000_000);
		database[position++] = new Employee("����", "������", "010-8378-3249", "������", "�븮", 3_500_000);
		
	}
	
	/**
	 * ������ ����� �����ͺ��̽��� �����Ѵ�.
	 */
	public void addNewPerson(Person person) {	// �Ű������� �������� ����Ǿ���. Person Ÿ���� ������ Student/Professor/Employee��ü�� ���޹��� �� �ִ�.
		database[position] = person;
		position++;
	}
	/**
	 * ��� ��������� ȭ�鿡 ����Ѵ�.
	 */
	public void printAllPerson() {
		for (Person person : database) {
			if (person == null) {
				break;
			}
			// person ���������� Student, Professor, Employee��ü�� ������ü�� Person��ü�� �����ϰ� �ִ�.
			// person ���������� print()�� �����ϸ�, person���������� �����ϴ� Person��ü�� print()�� ����Ǵ� ���� �ƴ϶�
			// Student/Professor/Employee��ü�� �����ǵ� print() �޼ҵ尡 ����ȴ�.
			person.print();
			System.out.println();
		}
	}
	
	/**
	 * ������ ��ȣ�� ����� ã�Ƽ� ��ȯ�Ѵ�.
	 * @param no �Ϸù�ȣ
	 * @return	�������, null�� �� ����
	 */
	public Person searchPerson(int no) {	// ��ȯŸ���� �������� ����Ǿ���. Person Ÿ���� ��ȯŸ���� Student/Professor/Employee ��ü�� ��� ��ȯ�� �� �ִ�.
		Person foundPerson = null;
		
		for(Person person : database) {
			if (person != null && person.getNo()==no) {	// null�� ���� Ȯ���ؾ� �ȴ�.!
				foundPerson = person;
				break;
			}
		}
		
		return foundPerson;
	}
	/**
	 * ������ �̸����� ����� ã�Ƽ� ��ȯ�Ѵ�.
	 * @param name	�˻��� �̸�
	 * @return �������, null�� �� ����
	 */
	public Person searchPerson(String name) {	// ��ȯŸ���� �������� ����Ǿ���. Person Ÿ���� ��ȯŸ���� Student/Professor/Employee ��ü�� ��� ��ȯ�� �� �ִ�.
		for (Person person : database) {
			if (person != null && person.getName().equals(name)) {	// null�� ���� Ȯ���ؾ� �ȴ�.!
				return person;	// �����ΰ���� return�� ����ߵ�
			} 
		}
		return null;
	}
}