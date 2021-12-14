package example_09_16_casting;

public class CarApp {
	public static void main(String[] args) {
		// Ŭ���� ����ȯ�� �߻����� ����
		// ������ ��ü�� Ÿ�԰� �����ϴ� ������ Ÿ���� �����ϴ�.
		System.out.println("### Car��ü�� CarŸ���� ���������� ����");
		Car car1 = new Car();	
		car1.start();
		car1.drive();
		car1.speedUp();
		car1.speedDown();
		car1.stop();
		// car1 ���������� Car��ü�� ������ ��� �Ӽ��� ����� ����� �� �ִ�.
		
		System.out.println("### SUV��ü�� SUVŸ���� ���������� ����");
		SUV suv1 = new SUV();
		suv1.start();				// Car��ü�� ���
		suv1.speedUp();				// Car��ü�� ���
		suv1.drive();				// Car��ü�� ���
		suv1.speedDown();			// Car��ü�� ���
		suv1.driveOffLoad();		// SUV��ü�� ���
		suv1.stop();				// Car��ü�� ���
		// suv1 ���������� SUV��ü�� ������ ��� �Ӽ��� ����� ����� �� �ִ�.
		// suv1 ���������� ������ü�� Car��ü�� ������ ��� �Ӽ��� ����� ����� �� �ִ�.
		
		System.out.println("### RacingCar��ü�� RacingCarŸ���� ���������� ����");
		RacingCar racingCar1 = new RacingCar();
		racingCar1.start();			// Car��ü�� ���
		racingCar1.speedUp();		// Car��ü�� ���
		racingCar1.race();			// RacingCar��ü�� ���
		racingCar1.speedDown();		// Car��ü�� ���
		racingCar1.stop();			// Car��ü�� ���
		// racingCar1 ���������� RacingCar��ü�� ������ ��� �Ӽ��� ����� ����� �� �ִ�.
		// racingCar1 ���������� ������ü�� Car��ü�� ������ ��� �Ӽ��� ����� ����� �� �ִ�.
		
		System.out.println("### Palisade��ü�� PalisadeŸ���� ���������� ����");
		Palisade palisade1 = new Palisade();
		palisade1.start();				// Car��ü�� ���
		palisade1.drive();				// Car��ü�� ���
		palisade1.speedUp();			// Car��ü�� ���
		palisade1.changeDriveMode();	// Palisade��ü�� ���
		palisade1.driveOffLoad();		// SUV��ü�� ���
		palisade1.speedDown();			// Car��ü�� ���
		palisade1.stop();				// Car��ü�� ���
		// palisade1 ���������� Palisade��ü�� ������ ��� �Ӽ��� ����� ����� �� �ִ�.
		// palisade1 ���������� ������ü�� SUV��ü�� ������ ��� �Ӽ��� ����� ����� �� �ִ�.
		// palisade1 ���������� ������ü�� Car��ü�� ������ ��� �Ӽ��� ����� ����� �� �ִ�.
		
		// Ŭ���� ����ȯ�� �߻��Ѵ�.
		// ������ ��ü�� Ÿ�԰� �����ϴ� ������ Ÿ���� ���� �ٸ�
		// ������ ��ü�� Ÿ���� ���� Ŭ���� Ÿ���̰�, �����ϴ� ������ Ÿ���� ���� Ŭ���� Ÿ���̴�.
		System.out.println("### SUV��ü�� ���� Ŭ������ CarŸ���� ���������� ����");
		Car suv2 = new SUV();
		suv2.start();				// Car��ü�� ���
		suv2.speedUp();				// Car��ü�� ���
		suv2.drive();				// Car��ü�� ���
		suv2.speedDown();			// Car��ü�� ���
		((SUV)suv2).driveOffLoad();	// SUV��ü�� ��� 		// ���� �߻� -> (SUV)�� ��������ȯ
		// ���� ������ SUV��ü�� �����ϵ��� ��������ȯ �� �� �ִ�.
		suv2.stop();
		// car ���������� SUC��ü�� �����ϸ� SUV��ü�� ������ ��� �Ӽ��� ����� ����� �� ����.
		// ������ ������ ��ü�� SUV��ü����, ���������� Car��ü�� �����ϰ� �ֱ� ������ Car��ü�� ������ ��� �Ӽ��� ��ɸ� ����� �� �ִ�.
		// SUV��ü�� ������ �Ӽ��� ������ ����� ����ϱ� ���ؼ��� ����ȯ �����ڸ� �̿��ؼ� SUV��ü�� �����ϵ��� ��������ȯ�� �� �ִ�.
		// ��, ��������ȯ�� �ϴ��� suv2 ���������� �������� ���ϴ� ���� �ƴϴ�.
		
		
		System.out.println("### Palisade��ü�� ���� Ŭ������ CarŸ���� ���������� ����");
		Car palisade2 = new Palisade();
		palisade2.start();				// Car��ü�� ���
		palisade2.drive();				// Car��ü�� ���
		palisade2.speedUp();			// Car��ü�� ���
//		palisade2.changeDriveMode();	// Palisade��ü�� ��� // �����߻�
		((Palisade)palisade2).changeDriveMode();// ������ Palisade��ü�� �����ϵ��� ��������ȯ �� �� �ִ�.	
//		palisade2.driveOffLoad();		// SUV��ü�� ���		// �����߻�
		((SUV)palisade2).driveOffLoad();// ������ Palisade��ü�� �����ϰ� �ִ� SUV��ü�� �����ϵ��� ��������ȯ �� �� �ִ�.
		palisade2.speedDown();			// Car��ü�� ���
		palisade2.stop();
		// car ���������� Palisade��ü�� �����ϸ� Palisade��ü�� ������ ��� �Ӽ��� ����� ����� �� ����.
		// ������ ������ ��ü�� Palisade��ü����, ���������� Car��ü�� �����ϰ� �ֱ� ������ Car��ü�� ������ ��� �Ӽ��� ��ɸ� ����� �� �ִ�.
		// Palisade��ü�� SUV��ü�� ������ �Ӽ��� ������ ����� ����ϱ� ���ؼ��� ����ȯ �����ڸ� �̿��ؼ�
		// Palisade��ü Ȥ�� SUV��ü�� �����ϵ��� ��������ȯ�� �� �ִ�.
		// ��, ��������ȯ�� �ϴ��� palisade2 ���������� �������� ���ϴ� ���� �ƴϴ�.
						
		
		
	}
}
