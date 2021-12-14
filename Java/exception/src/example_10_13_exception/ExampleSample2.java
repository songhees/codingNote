package example_10_13_exception;

import java.util.ArrayList;
import java.util.List;


public class ExampleSample2 {
	public static void main(String[] args) {
		
		/*
		 * ���� ���� �߻���Ű��
		 * 		- ���ø����̼��� ������ �� ���ܸ� ������ �߻���ų �� �ִ�.
		 * 		- ���� �����߻� ��Ȳ
		 * 			* ���������� ����Ǵ� ���
		 * 				(������ ���̵� ���� ����ڰ� ��ϵǴ� ��, �α���ó���� �� ��й�ȣ�� ���� �ʴ� ��, ��ݱݾ׺��� �ܾ��� ������ ��.)
		 * 			* ��ȿ�� �Է°��� �ƴ� ���
		 * 				(���̵� �� ���ڿ��� ��, �̸��������� �ƴ� �̸��� �ּ�, ���� ������ �Ѿ�� ��, ���õ� �׸��� �ƴ� �׸��� ��)
		 * 		- ���� ���� �߻���Ű��
		 * 			throw new ����Ŭ����();
		 * 			throw new ����Ŭ����(�����޼���);
		 * 			throw new ����Ŭ����(�����޼���, ���ܿ���); ���ܿ����� �ٸ� ���ܰ�ü��.
		 */
		User user1 = new User("hong", "ȫ�浿");
		User user2 = new User("kim", "������");
		User user3 = new User("hong", "ȫ�浿");
		
		UserManager userManager = new UserManager();
		
		try {
			userManager.addNewUser(user1);
			userManager.addNewUser(user2);
			userManager.addNewUser(user3);		// ���� �߻�, RunTimeException�� �߻��Ͽ���, ���̵� �ߺ����� ���� �������� Ȯ���� �� ����
		} catch (RuntimeException ex) {
			/*
			 * catch ����� �����
			 * 		 - addNewUser(user( ������ �����Ͽ���
			 *		 - ���� �޼����� ���Ե� ���ܰ�ü�� ��Ҵ�.
			 *			+ ������ ���� ���� ������ ȹ���� �� �ִ�. ���ܰ�ü�� String getMessage()�� ���� �޼����� ��ȯ�Ѵ�.
			 *		 	+ ������ �߻��� ���๮�� Ȯ���� �� �ִ�. ���� ��ü�� void printStackTrace()�� ���ܰ� �߻��� ���๮������ ����Ѵ�.
			 */
			System.out.println("���� �޼���: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * ����� ���� ����/��ȸ/����/���� ����� �����ϴ� Ŭ����
	 * @author OhSong
	 *
	 */
	static class UserManager {
		private List<User> userList = new ArrayList<>();
		
		/**
		 * ���ο� ����� ������ ���޹޾Ƽ� �����ϴ� ����� �����Ѵ�. <br/>
		 * ���̵�� �̸��� �ߺ��Ǵ� ����ڴ� ������ �� ����. <br/>
		 * ���� �ߺ��� �߻��ߴٸ�, �� �޼ҵ带 ȣ���� ������ ���̵�/�̸� �ߺ�����
		 * ������ �� �����ٴ� ������ �˸��� �ʹ�.<br/>
		 *  ����� �����ϸ� true, ����� �����ϸ� false�� ��ȯ�Ѵ�.<br/>
		 *  	public boolean addNewUser(User user) {
		 *  	}
		 * <br/> �� ����� ���п� ���� �ڼ��� ������ ������ �� ����. <br/>
		 * 
		 *  ��� ����/���п��θ� ��ȯ������ �����ϴ� ���
		 *  ����ڰ� �ߺ�����Ǵ� ��츦 ������ ����.<br/>
		 *  ���� ���� ������ ������ ���� <br/>
		 *  ����� �ߺ��� �߻��ߴٸ� ���ܰ�ü�� �߻���Ű��.(���� ���� �߻�)<br/>
		 *  ������ ���� ���� ������ ȣ���� ������ �����ϴ� ���� �����ϴ�.
		 *  	public void addNewUser(User user) {
		 *  	}
		 * @param user ���ο� ����� ����
		 */
		public void addNewUser(User user) {
			for (User savedUser : userList) {
				if (savedUser.getId().equals(user.getId())) {
					// ���̵� �ߺ���Ȳ Ȯ��, ���� �����߻�, ���ܰ� �߻��ϸ� �ش� �޼ҵ�� ��� ������ �ߴ� �ȴ�. ���� ���ῡ �ش�ȴ�.
					throw new RuntimeException("[" + user.getId() + "] ���̵� �ߺ�");
				}
					// �̸� �ߺ���Ȳ Ȯ��, ���� �����߻�, ���ܰ� �߻��ϸ� �ش� �޼ҵ�� ��� ������ �ߴ� �ȴ�. ���� ���ῡ �ش�ȴ�.=> return�� ���� �߻��� �̿� �ش�
				if (savedUser.getName().equals(user.getName())) {
					throw new RuntimeException("[" + user.getName() + "] �̸� �ߺ�");
				}
			}
			// userList��ü�� User��ü�� �����ϴ� �� ���๮�� ����Ǳ� ���ؼ��� for���� ���ܸ� ������ �߻���Ű�� ���๮�� ����� ������� �ʾƾ� �Ѵ�.
			userList.add(user);
			System.out.println("### ����� ����[" + user.getName() + "]�� ����Ǿ����ϴ�.");
		}
	}
	
	static class User {
		private String id;
		private String name;
		
		public User(String id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public String getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}
	}
}
