package example_09_16_casting;

public class CarApp6 {
	public static void main(String[] args) {
		/*
		 * Ŭ���� ����ȯ Ȱ���ϱ�
		 * 
		 * 		+ ������ ��ü�� Ŭ��������ȯ �Ǿ �����ǰ� ������,
		 * 		  �� ��ü�� ����� ���� �� ��ü�� ��� ����� ����� �� �ִ�.
		 */
		// �迭�� SUV, RacingCar, Palisade��ü�� �������� ����Ǿ� �ִ�.
		// �迭�� ����� ��� ��ü�� �迭�� �� ĭ�� CarŸ�� ��ü�� �ּҰ��� ����Ǿ� �ְ�, Ŭ��������ȯ�Ǿ� �ִ� ���´�.
		// �迭�� ����� ��ü�� ������� �̾Ƽ� �� ��ü�� ������ ����� �����϶�.
		
		Car[] cars = new Car[5];
		cars[0] = new Palisade();
		cars[1] = new SUV();
		cars[2] = new RacingCar();
		cars[3] = new Palisade();
		cars[4] = new RacingCar();
		
		for (Car car : cars) {
			if (car instanceof Palisade) {			// palisade�� �������ϸ� SUV�� ���̱� ������ �ɷ�������.
				Palisade palisade = (Palisade)car;	// car�� �����ϴ� ���� ��ü�� Palisade�� �� true��.
				palisade.changeDriveMode();
			} else if (car instanceof SUV) {		// car�� �����ϴ� ���� ��ü�� SUV�� �� true��. 	
				SUV suv = (SUV)car;					// car�� �����ϴ� ���� ��ü�� Palisade�� ���� true�� ������ �� �ִ�.	
				suv.driveOffLoad();					// �׷���, Palisade���� ���θ� ���� Ȯ���ؼ� Palisade�� ��� �� �κ��� ������� �ʴ´�.
			} else if (car instanceof RacingCar) {	// car�� �����ϴ� ���� ��ü�� RacingCar�� �� true��.
				RacingCar racingCar = (RacingCar) car;
				racingCar.race();
			} 
		}
	}
}
