package example_09_14_extends;
/**
 * ����� ���õ� �Ӽ� �� ����� ���ǵ� Ŭ������.
 * @author ������
 *
 */
public class Person {
	private String name;
	private String tel;
	private String email;
	
	/**
	 * �⺻ ������ �޼ҵ��.
	 */
	public Person() {}
	
	/**
	 * �̸��� ��ȯ�Ѵ�.
	 * @return	�̸�
	 */
	public String getName() {
		return name;
	}

	/**
	 * ������ ������ �̸��� �����Ѵ�.
	 * @param name	������ �̸�
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ��ȭ��ȣ�� ��ȯ�Ѵ�.
	 * @return ��ȭ��ȣ
	 */
	public String getTel() {
		return tel;
	}
	
	/**
	 * ������ ������ ��ȭ��ȣ�� �����Ѵ�.
	 * @param tel	������ ��ȭ��ȣ
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	/**
	 * �̸����� ��ȯ�Ѵ�.
	 * @return	�̸���
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * ������ ������ �̸����� �����Ѵ�.
	 * @param email	������ �̸���
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
