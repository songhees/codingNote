package example_09_08_method;

public class Sample2 {
	
	// ������ ���� �ܾ� 
	long balance = 100_000_000L;
	int password = 1234;
	
	// ���� �ܾ��� ��ȯ�ϴ� ���
	// long getCurrentBalance(){...}
	long getCurrentBalance() {
		return balance;
	}
	// �ݾ��� ���޹޾Ƽ� �ܾ��� �����ϴ� ���
	// void updateBalance(long depositMoney)
	void updateBalance(long depositMoney) {
		balance += depositMoney;
	}
	// ���� ��й�ȣ�� �� ��й�ȣ�� ���޹޾Ƽ� ��й�ȣ�� �����ϴ� ���
	// void changePassword(int prevPassword, int newPassword)
	void changePassword(int prevPassword, int newPassword) {
		if (password != prevPassword) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		} else {
			password = newPassword;
		}
	}
	
	
}
