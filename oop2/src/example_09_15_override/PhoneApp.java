package example_09_15_override;

public class PhoneApp {
	public static void main(String[] args) {
		
		// ������ư�� �̿��ؼ� ȭ���� �Ѱ� �ʹٸ�, Phone��ü�� �������
		System.out.println("### Phone��ü ����ϱ�");
		Phone phone = new Phone();
		phone.setTel("010-1111-1111");
		phone.on();
		phone.call("010-2222-2222");
		phone.off();
		
		//���̽� ���̵� �̿��ؼ� ȭ���� �Ѱ� �ʹٸ�, Iphone��ü�� �������.
		System.out.println("### Iphone��ü ����ϱ�");
		Iphone iphone = new Iphone();
		iphone.setTel("010-1234-5678");
		iphone.on();
		iphone.call("010-3333-3333");
		iphone.off();
		
		// ������ ���ų� ���ļ� ȭ���� �Ѱ� ���� �ʹٸ�, Galaxy ��ü�� �������
		System.out.println("### Galaxy��ü ����ϱ�");
		Galaxy galaxy = new Galaxy();
		galaxy.setTel("010-9784-7415");
		galaxy.on();
		galaxy.call("010-9999-8888");
		galaxy.off();
		
	}
}
