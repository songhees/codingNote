package example_10_13_exception;

import java.util.ArrayList;
import java.util.List;


public class CustomerService {
	private List<Customer> list = new ArrayList<Customer>();
	private Customer login;
	
	/**
	 * �� ����� ������ ����ϴ� ����̴�. <br/>
	 * ���� ���̵� ����ϴ� ����ڰ� �����ϴ� ���, ���ܸ� �߻���Ų��. 
	 * @param user �� ����� ����
	 */
	public void registerUser(Customer cus) {
		Customer save = getCustomer(cus.getId());
		
		if (save != null) {
			throw new CustomerNotFoundException("���� ���̵� �����մϴ�.");
		}
		list.add(cus);
		System.out.println("�Ϸ�Ǿ����ϴ�.");
	}
	
	/**
	 * ���̵�� ��й�ȣ�� ���޹޾Ƽ� �α���ó���� �����Ѵ�. <br/>
	 * ���̵� Ȥ�� ��й�ȣ�� �ùٸ��� ���� ���, ���ܸ� �߻���Ų��.
	 * @param id ���̵�
	 * @param password ��й�ȣ
	 */
	public void login(String id, String password) {
		Customer save = getCustomer(id);
		if (save == null) {
			throw new CustomerNotFoundException("����������� �������� �ʽ��ϴ�.");
		}
		if (!password.equals(save.getPassword())) {
			throw new CustomerNotFoundException("Ʋ�� ��й�ȣ�Դϴ�.");
		}
		login = save;
		System.out.println("�Ϸ�Ǿ����ϴ�.");
	}
	

	public void logout() {
		login = null;
	}
	
	/**
	 * ���� �α��� ���θ� ��ȯ�Ѵ�.
	 * @return loginUser�� null�� �ƴϸ� true�� ��ȯ�Ѵ�.
	 */
	public boolean isLogined() {
		return login != null;
	}
	
	public Customer getCustomer(String id) {
		Customer save = null;
		for (Customer cus : list) {
			if (id.equals(cus.getId())) {
				return cus;
			}
		}
		return save;
	}
	
}
