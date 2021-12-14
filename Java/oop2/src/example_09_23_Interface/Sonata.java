package example_09_23_Interface;

/**
 * Sonata�� Car�������̽��� ��� ����� �����ϴ� ����Ŭ������.<br/>
 * Sonata�� Car�� ���ǵ� �����ΰ� ���� �޼ҵ带 ���� �������ؾ� �Ѵ�.
 * @author ������
 *
 */
public class Sonata implements Car {
	private int speed;
	
	@Override
	public void start() {
		System.out.println("�ҳ�Ÿ�� ��߽�Ų��.");
		speed = 10;
	}

	@Override
	public void stop() {
		System.out.println("�ҳ�Ÿ�� ������Ų��.");
		speed = 0;
	}

	@Override
	public void speedUp() {
		System.out.println("�ҳ�Ÿ�� �ӵ��� ������.");
		speed += 5;			
		if (speed > Car.MAX_SPEED) {
			speed = Car.MAX_SPEED;
		}
	}

	@Override
	public void speedDown() {
		System.out.println("�ҳ�Ÿ�� �ӵ��� ���δ�.");
		speed -= 5;
		if (speed < Car.MIN_SPEED) {
			speed = Car.MIN_SPEED;
		}
	}

	@Override
	public int getCurrentSpeed() {
		System.out.println("�ҳ�Ÿ�� ���� �ӵ��� ��ȯ�Ѵ�.");
		return speed;
	}
}
