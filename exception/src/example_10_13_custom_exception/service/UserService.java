package example_10_13_custom_exception.service;

import java.util.ArrayList;
import java.util.List;

import example_10_13_custom_exception.exception.PasswordMismatchException;
import example_10_13_custom_exception.exception.UserAlreadyExistsException;
import example_10_13_custom_exception.exception.UserNotFoundException;
import example_10_13_custom_exception.vo.User;

public class UserService {
	
	private List<User> users = new ArrayList<>();
	private User loginUser = null;
	
	public void registerUser(User user) {
		User savedUser = this.getUserById(user.getId());
		if (savedUser != null) {
			throw new UserAlreadyExistsException("[" + user.getId() + "]�� ��ϵ� ���̵� �Դϴ�.");
		}
		users.add(user);
	}
	
	public void login(String id, String password) {
		User savedUser = this.getUserById(id);
		if (savedUser == null) {
			throw new UserNotFoundException("[" + id + "] ����������� ã�� �� �����ϴ�.");
		}
		if (!password.equals(savedUser.getPassword())) {
			throw new PasswordMismatchException("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		
		loginUser = savedUser;
	}
	
	public void logout() {
		if (loginUser != null) {
			loginUser = null;
		}
	}
	
	public boolean isLogined() {
		return loginUser != null;
	}
	
	public User getUserById(String id) {
		for (User user : users) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
}
