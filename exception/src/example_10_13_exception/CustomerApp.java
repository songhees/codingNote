package example_10_13_exception;

import java.util.Scanner;

import example_10_13_exception.ExampleSample4.CustomException;

public class CustomerApp {
	Scanner scan = new Scanner(System.in);
	CustomerService service = new CustomerService();
	
	public void menu() {
		
		try {
			System.out.println("----------------------------------------------------------");
			if (service.isLogined()) {
				System.out.println("3.�α׾ƿ� 0.����");
			} else {
				System.out.println("1.�α��� 2.ȸ������ 0.����");
			}
			System.out.println("----------------------------------------------------------");
			System.out.print("### �޴� ����: ");
			int menuNo = scan.nextInt();
			
			if (menuNo == 1) {
				login();
			} else if (menuNo == 2) {
				newCustomer();
			} else if (menuNo == 3) {
				logout();
			} else if (menuNo == 0) {
				logout();
			}
		} catch (CustomException ex) {
			System.out.println("### ���� �޼���: " + ex.getMessage());
		}
		menu();
	}
	
	void login () {
		System.out.println("[�α���]");
		System.out.println("### �α����� ȸ�� ���̵� �Է�: ");
		String id = scan.next();
		System.out.println("### �α����� ȸ�� ��й�ȣ �Է�: ");
		String password = scan.next();
		
		service.login(id, password);
		System.out.println("### �α����� �Ϸ�Ǿ����ϴ�.");
	}
	
	void newCustomer() {
		System.out.println("[ȸ������]");
		System.out.println("### ������ ȸ�� ���̵� �Է�: ");
		String id = scan.next();
		System.out.println("### ������ ȸ�� ��й�ȣ �Է�: ");
		String password = scan.next();
		System.out.println("### ������ ȸ�� �̸� �Է�: ");
		String name = scan.next();
		
		service.registerUser(new Customer(id, password, name)); // ���ܰ� �������� �޼ҵ�
		System.out.println("### ȸ�������� �Ϸ�Ǿ����ϴ�.");
	}
	
	void logout() {
		System.out.println("[�α׾ƿ�]");
		service.logout();
	}
	
	void exists() {
		System.out.println("[���α׷� ����]");
		
	}
	
	
	public static void main(String[] args) {
		CustomerApp app = new CustomerApp();
		app.menu();
		
	}
}
