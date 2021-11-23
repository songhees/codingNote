package example_10_13_exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExampleSample4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UserService service = new UserService();
		
		while (true) {
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
					System.out.println("[�α���]");
					System.out.println("### �α����� ȸ�� ���̵� �Է�: ");
					String id = scan.next();
					System.out.println("### �α����� ȸ�� ��й�ȣ �Է�: ");
					String password = scan.next();
					
					service.login(id, password);
					System.out.println("### �α����� �Ϸ�Ǿ����ϴ�.");
					
				} else if (menuNo == 2) {
					System.out.println("[ȸ������]");
					System.out.println("### ������ ȸ�� ���̵� �Է�: ");
					String id = scan.next();
					System.out.println("### ������ ȸ�� ��й�ȣ �Է�: ");
					String password = scan.next();
					System.out.println("### ������ ȸ�� �̸� �Է�: ");
					String name = scan.next();
					
					service.registerUser(new User(id, password, name)); // ���ܰ� �������� �޼ҵ�
					System.out.println("### ȸ�������� �Ϸ�Ǿ����ϴ�.");
					
				} else if (menuNo == 3) {
					System.out.println("[�α׾ƿ�]");
					
					
					
				} else if (menuNo == 0) {
					System.out.println("[���α׷� ����]");
					break;
				}
			} catch (CustomException ex) {
				System.out.println("### ���� �޼���: " + ex.getMessage());
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		scan.close();
		
		
		
	}
	
	static class UserService {
		private List<User> users = new ArrayList<>();
		private User loginUser;
		/**
		 * �� ����� ������ ����ϴ� ����̴�. <br/>
		 * ���� ���̵� ����ϴ� ����ڰ� �����ϴ� ���, ���ܸ� �߻���Ų��. 
		 * @param user �� ����� ����
		 */
		public void registerUser(User user) {
			/*
			 * 1. ���޹��� ����� ������ ���Ե� ���̵�� �̹� ����� ����������� ��ȸ��ȥ��.
			 * 2. ����, ����������� ��ȸ�Ǹ� �ش� ���̵�� �̹� ������ ����ڰ� �����Ƿ� ���ܸ� �߻����� �޼ҵ带 �����Ų��.
			 * 3. ��ȸ�� ����������� null�̸� �ش� ���̵�� ���Ե� ����������� ���°��̹Ƿ� �� ����� ������ List��ü�� �߰��Ѵ�.
			 */
			// ���ܸ� ó�����ٴ� ������ ���ܸ� �߻���Ű�°� ������ �۾�
			User savedUser = this.getUserById(user.getId());
			if (savedUser != null) {
				throw new CustomException("�̹� ������� ���̵��Դϴ�.");		// ���ܸ� �߻����� ���� ���� ó����.
			}
			users.add(user);
		}
		
		/**
		 * ���̵�� ��й�ȣ�� ���޹޾Ƽ� �α���ó���� �����Ѵ�. <br/>
		 * ���̵� Ȥ�� ��й�ȣ�� �ùٸ��� ���� ���, ���ܸ� �߻���Ų��.
		 * @param id ���̵�
		 * @param password ��й�ȣ
		 */
		public void login(String id, String password) {
			/*
			 * 1. ���޹��� ���̵�� �̹� ����� ����� ������ ��ȸ�غ���.
			 * 2. ����� ������ null�̸� ���Ե��� �ʴ� ���̵������� ���ܸ� �߻���Ų��.
			 * 3. ��ȸ�� ����������� ��й�ȣ�� ���޹��� ��й�ȣ�� ��ġ���� ������ ���ܸ� �߻���Ų��.
			 * 4. ����������� �����ϰ�, ��й�ȣ�� ��ġ������ �α���ó���� �Ϸ��Ѵ�.
			 */
			User savedUser = this.getUserById(id);
			if (savedUser == null) {
				throw new CustomException("����������� �������� �ʽ��ϴ�.");		// ���ܸ� �߻����� ���� ���� ó����.
			}
			if (!savedUser.getPassword().equals(password)) {
				throw new CustomException("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
			}
			
			// �α��ε� ����������� loginUser ������ �����Ѵ�.
			loginUser = savedUser;
			System.out.println("");
		}
		
		/**
		 * ���� �α��� ���θ� ��ȯ�Ѵ�.
		 * @return loginUser�� null�� �ƴϸ� true�� ��ȯ�Ѵ�.
		 */
		public boolean isLogined() {
			return loginUser != null;
		}
		
		/**
		 * ���̵� ���޹޾Ƽ� �ش� ����� ������ ��ȯ�Ѵ�.<br/>
		 * @param id ���̵�
		 * @return ���������, ����������� �������� ���� ��� null�� ��ȯ�Ѵ�.
		 */
		public User getUserById(String id) {
			for (User user : users) {
				if (user.getId().equals(id)) {
					return user;
				}
			}
			return null;
		}
	}
	
	static class User {
		private String id;
		private String password;
		private String name;
		public User(String id, String password, String name) {
			this.id = id;
			this.password = password;
			this.name = name;
		}
		public String getId() {
			return id;
		}
		public String getPassword() {
			return password;
		}
		public String getName() {
			return name;
		}
		
	}
	// ��������� ����Ŭ����
	// ���� ������ Ŭ�������� �����ߵȴ�. static�� �ٿ�����.
	// ��������� ����Ŭ������ RuntimeException Ŭ������ Exception Ŭ������ ��ӹ޾Ƽ� �����Ѵ�.
	// ��������� ����Ŭ������ ������ ���� �ַ� �θ��� ������ �޼ҵ带 ȣ���ϴ� �����ڸ޼ҵ带 �����Ѵ�.
	static class CustomException extends RuntimeException {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 4529285267860689319L;

		// �⺻ ������ �޼ҵ�
		public CustomException() {}
		
		// ���� �޼����� ���ڷ� ���޹޴� ������ �޼ҵ�
		public CustomException(String message) {
			super(message);
		}
		
		// ���� �߻��� ������ �Ǵ� �ٸ� ������ ���޹޴� ������ �޼ҵ�
		public CustomException(Throwable cause) {
			super(cause);
		}
		
		// ���� �޼����� ���� �߻��� ������ �Ǵ� �ٸ� ������ ���޹޴� ������ �޼ҵ�
		public CustomException(String message, Throwable cause) {
			super(message, cause);
		}
	}
	
	
}
