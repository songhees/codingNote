package example_09_23_Interface;

public class CarApp {
	public static void main(String[] args) {
		// ����Ŭ������ �������̽��� �ڽ��̴�.
		// �������̽� Ÿ���� ���������� �ڽ� ��ü�� ������ �� �ִ�.
		Car car1 = new Sonata();
		Car car2 = new Genesis();
		
		car1.start();		// ���� ��ü�� �ҳ�Ÿ�̱� ������ override�� �ҳ�Ÿ�� �޼ҵ尡 ����ȵ�.
		car1.speedUp();
		car1.speedUp();
		int car1Speed = car1.getCurrentSpeed();
		System.out.println("car1�� ����ӵ�: " + car1Speed);
		car1.stop();
		
		car2.start();
		car2.speedUp();
		car2.speedDown();
		int car2Speed = car2.getCurrentSpeed();
		System.out.println("car2�� ����ӵ�: " + car2Speed);
		car2.stop();
	}
	
}
