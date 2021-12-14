package example_09_29_object;


public class ObjectApp5 extends Student implements Cloneable{
	public static void main(String[] args) throws CloneNotSupportedException {
		Person original = new Person("ȫ�浿", "010-1111-1111", "hong@gmail.com");
		Person clonePerson = original.copy();
		
		// ������ü�� ������ ��ü�� ������ Ȯ���غ���, �ؽ��ڵ尪�� �ٸ���.
		// ��, ������ü�� ������ ��ü�� ���� �ٸ� ��ü���� �� �� �ִ�.
		System.out.println("������ü: " + original);			//ObjectApp5$Person@7d6f77cc
		System.out.println("������ ��ü: " + clonePerson);		//ObjectApp5$Person@5aaa6d82
		
		System.out.println("������ ��ü Ȯ���ϱ�");
		System.out.println(clonePerson.name);
		System.out.println(clonePerson.tel);
		System.out.println(clonePerson.email);

	}
//Person�� ������Ʈ�� �ڼ��̱� ������ Ŭ�� �޼ҵ带 ����� �� �ִ�. 
// Person��� ��ü�� ���ؼ� Ŭ���ϴ°��̰� �����ϴ� ���� App�ȿ��� �����ϴ� ���̹Ƿ�
//App�ȿ��� clone�� �ϸ� App�� �����ϴ� ���̱� ������ �ٷ� ����� �Ұ����ϴ� ���� �����ҷ��°� ������ ��ü�ȿ��� �� ���� ����
	//���� ���� Ŭ����
	static class Person implements Cloneable{
		String name;
		String tel;
		String email;
		
		public Person(String name, String tel, String email) {
			super();
			this.name = name;
			this.tel = tel;
			this.email = email;
		}
		
		// ��ü�� �������� �����ϴ� �޼ҵ��.
		public Person copy() throws CloneNotSupportedException {
			Person person =(Person)this.clone();
			return person;
		}
		
		
	}
}


//