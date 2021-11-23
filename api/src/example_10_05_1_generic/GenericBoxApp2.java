package example_10_05_1_generic;

public class GenericBoxApp2 {
	public static void main(String[] args) {
		
		GenericBox<Contact> contactBox = new GenericBox<>();
		
		Contact contact1 = new Contact("ȫ�浿", "010-1234-5678", "�Ｚ����");
		Contact contact2 = new Contact("������", "010-1234-0001", "LG����");
		Contact contact3 = new Contact("�̼���", "010-1234-0005", "����");
		
		// void addItems(T item){...}��
		// void addItems(Contact item){...}���� ����ȴ�. Ÿ�Ծ������� �����
		contactBox.addItems(contact1);
		contactBox.addItems(contact2);
		contactBox.addItems(contact3);
		
		// T getItem(int index) {...}��
		// Contact getItem(int index) {...}���� ����ȴ�. ����ȯ ������ �ʿ����
		Contact savedContact1 = contactBox.getItem(0);
		Contact savedContact2 = contactBox.getItem(1);
		Contact savedContact3 = contactBox.getItem(2);
		
		System.out.println(savedContact1.getName() + ", " + savedContact1.getTel() + ", " + savedContact1.getCompany());
		System.out.println(savedContact2.getName() + ", " + savedContact2.getTel() + ", " + savedContact2.getCompany());
		System.out.println(savedContact3.getName() + ", " + savedContact3.getTel() + ", " + savedContact3.getCompany());
	}
}
