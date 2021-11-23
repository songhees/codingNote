package example_09_23_Interface;

public class Genesis implements Car {

	private int speed;
	
	@Override
	public void start() {
		System.out.println("���׽ý��� ��߽�Ų��.");
		speed = 10;
	}

	@Override
	public void stop() {
		System.out.println("���׽ý��� ������Ų��.");
		speed = 0;
	}

	@Override
	public void speedUp() {
		System.out.println("���׽ý��� �ӵ��� ������.");
		speed += 10;		
		if (speed > Car.MAX_SPEED) {
			speed = Car.MAX_SPEED;
		}
	}

	@Override
	public void speedDown() {
		System.out.println("���׽ý��� �ӵ��� ���δ�.");
		speed -= 10;
		if (speed < Car.MIN_SPEED) {
			speed = Car.MIN_SPEED;
		}
	}

	@Override
	public int getCurrentSpeed() {
		System.out.println("���׽ý��� ���� �ӵ��� ��ȯ�Ѵ�.");
		return speed;
	}
}
