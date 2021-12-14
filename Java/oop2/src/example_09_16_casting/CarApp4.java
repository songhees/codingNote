package example_09_16_casting;

public class CarApp4 {
	public static void main(String[] args) {
		/*
		 * Ŭ���� ����ȯ Ȱ���ϱ�
		 * 
		 * 		+ ������ ����� ����� ���ԵǾ� �ִ� Ŭ���� Ÿ���� ���� Ȥ�� �迭��ü�� �����ϸ�
		 * 		  Ư���� ����ȯ���� ����� ������ �� �ִ�.
		 */
		
		// �䱸����
		// ��� �ڵ������� ��߱��, �������, ��������� �������ּ���
		// ��� SUV������ ��߱��, �������, �������, �����ε����� �������ּ���
		
		// car�迭�� ����� �ڵ�ü���� ��߱��, �������, ������� �����ϱ�
		System.out.println("### ��� �ڵ����� ��߱��, �������, ������� �����ϱ�");
		Car[] cars = new Car[3];
		cars[0] = new Car();
		cars[1] = new SUV();
		cars[2] = new Palisade();
		
		for (Car car : cars) {
			System.out.println(car.getClass().getName() + "������ ���/����/������� �����ϱ�");
			car.start();
			car.stop();
			car.drive();
		}
		
		// SUV�迭�� ����� �ڵ�ü���� �����ε��� �����ϱ�
		System.out.println("### ��� SUV�ڵ����� �����ε��� �����ϱ�");
		SUV[] suvs = new SUV[3];
		suvs[0] = new SUV();
		suvs[1] = new Palisade();
		suvs[2] = new SUV();
		
		for (SUV suv : suvs) {
			System.out.println(suv.getClass().getName() + "������ �����ε��� �����ϱ�");			
			suv.driveOffLoad();
		}
		
		
		
		
		
		
		
	}
}
