package example_09_17_polymorphism;

import java.util.concurrent.atomic.AtomicInteger;

public class Person {
	
	private static AtomicInteger atomicInteger = new AtomicInteger(1000);	//AtomicInteger ������ ���ں��� ���������� ����ɶ� ���� ���� �þ
	private int no;		// ����� ��ȣ
	private String type;// � ����?
	private String name;// �̸�
	private String tel;// ��ȭ��ȣ
	
	public Person() {}	// �⺻������
	public Person(String type, String name, String tel) {	//��ü ������ �ʱ�ȭ �ϴ� ������
		this.no = atomicInteger.getAndIncrement();	// 1000���� ����� 1�� ������
		this.type = type;
		this.name= name;
		this.tel = tel;
	}
	public int getNo() {
		return no;
	}

	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public void print() {
		
		System.out.println("�Ϸù�ȣ: " + no);
		System.out.println("��   ��: " + type);
		System.out.println("��   ��: " + name);
		System.out.println("��ȭ��ȣ: " + tel);
	}
	
}
