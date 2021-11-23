package example_10_13_custom_exception.app;

import java.util.Scanner;

import example_10_13_custom_exception.exception.HtaException;
import example_10_13_custom_exception.service.UserService;
import example_10_13_custom_exception.vo.User;

public class UserApp {
	// �ϳ��� �޼ҵ�ȿ��� �ʹ� ���� ���� ���� �ʰ� �ϰ� �ڵ带 ����/������ ã�� �����ϱ� ���ؼ�
	// ��ɸ��� �޼ҵ� ������ ������ �ٽ� �����Ѵ�. 
	// ������� Ű���� �Է��� �о���� ��ü
	Scanner scan = new Scanner(System.in);
	// ����ڿ� ���õ� ���������� �����Ǿ� �ִ� ��ü
	UserService userService = new UserService();

	public void displayMenu() {
		try {
			System.out.println("------------------------------------------------");
			if (userService.isLogined()) {
				System.out.println("3.�� �������� 4.�α׾ƿ� 0.����");
			} else {
				System.out.println("1.�α��� 2.ȸ������ 0.����");
			}
			System.out.println("------------------------------------------------");
			
			System.out.println("### �޴��� �����ϼ���.");
			int menuNo = scan.nextInt();
			
			if (menuNo == 1) {
				�α����ϱ�();
			} else if (menuNo == 2) { 
				ȸ�������ϱ�();
			} else if (menuNo == 3) { 
				����������();
			} else if (menuNo == 4) { 
				�α׾ƿ��ϱ�();
			} else if (menuNo == 0) {
				�����ϱ�();
			}
		} catch (HtaException ex) {
			System.out.println("### [���� �߻�] " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("### [���� �߻�] �� �� ���� ������ �߻��Ͽ����ϴ�.");
		}
		System.out.println();
		displayMenu(); // while���� ��� �ݺ�ȣ���� �ȴ�.
	}
	
	private void �α����ϱ�() {
		System.out.println("[�α���]");
		
		// ����ڿ� ��ȣ�ۿ��ϱ�
		System.out.println("### ���̵�� ��й�ȣ�� �Է��ϼ���.");
		System.out.println("### ���̵� �Է�: ");
		String id = scan.next();
		System.out.println("### ��й�ȣ �Է�: ");
		String password = scan.next();
		
		// �������� ����
		userService.login(id, password);
		// ����� ȭ�鿡 ó����� ǥ���ϱ�
		System.out.println("### [ó�� ����] �α��� ó���� �Ϸ�Ǿ����ϴ�.");
	}
	private void ȸ�������ϱ�() {
		System.out.println("[ȸ�������ϱ�]");
		
		// ����ڿ� ��ȣ�ۿ��ϱ�
		System.out.println("### ���̵�, ��й�ȣ, �̸��� �Է��ϼ���.");
		System.out.println("### ���̵� �Է�: ");
		String id = scan.next();
		System.out.println("### ��й�ȣ �Է�: ");
		String password = scan.next();
		System.out.println("### �̸� �Է�: ");
		String name = scan.next();
		
		// �������� ����
		userService.registerUser(new User(id, password, name));
		
		// ����� ȭ�鿡 ó����� ǥ���ϱ�
		System.out.println("### [ó�� ����] ȸ�������� �Ϸ�Ǿ����ϴ�.");
	}
	
	private void ����������() {
		System.out.println("[�� ���� ����]");
		
	}
		
	private void �α׾ƿ��ϱ�() {
		userService.logout();
		System.out.println("### [ó�� ����] �α׾ƿ��� �Ϸ�Ǿ����ϴ�.");
	}
	
	private void �����ϱ�() {
		System.out.println("[���α׷� ����]");
		System.out.println("### ���α׷��� �����մϴ�.");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		// ����ڿ� ��ȣ�ۿ��ϴ�  UserApp��ü ����
		UserApp app = new UserApp();
		// UserApp�� ����߿��� �޴� ǥ���ϱ� ��ɽ���
		app.displayMenu();
		
	}
}
