package example_11_2_transaction.app;

import static utils.KeyboardUtil.*;

import example_11_2_transaction.service.FoodService;

public class App {
	
	private FoodService foodSerivce = new FoodService();

	public void �ֹ��ϱ�() {
		// ����ȣ, ��ǰ��ȣ, ���ż����� �Է¹޾Ƽ� ���� �ֹ�ó���ϱ�
		System.out.print("����ȣ �Է�: ");
		int customerNo = readInt();
		
		System.out.print("��ǰ��ȣ �Է�: ");
		int foodNo = readInt();
		
		System.out.print("���ż��� �Է�: ");
		int amount = readInt();
		
		foodSerivce.order(customerNo, foodNo, amount);

		System.out.println("### �ֹ��� �Ϸ�Ǿ����ϴ�.");
	}
	
	
	public static void main(String[] args) throws Exception {
		
		App app = new App();
		app.�ֹ��ϱ�();
		
	}
}
