package example_09_16_casting;

public class CarApp5 {
	public static void main(String[] args) {
		/*
		 * Ŭ���� ����ȯ Ȱ���ϱ�
		 * 
		 * 		+ ������ ��ü�� Ŭ��������ȯ �Ǿ �����ǰ� ������,
		 * 		  �� ��ü�� ����� ���� �� ��ü�� ��� ����� ����� �� �ִ�.
		 * 		  (instanceof �����ڸ� ����ϸ� ���������� �����ϴ� ��ü�� ������ � ��ü���� ������ �� �ִ�.)
		 * 		  ����
		 * 				�������� instanceof Ŭ������
		 * 					���������� �����ϴ� ��ü�� ������ Ŭ����Ÿ���� ��ü�� true�� ��ȯ�ϰ�, �ƴϸ� false�� ��ȯ�Ѵ�.
		 */
		
		Car car1 = new Car();
		Car car2 = new SUV();
		Car car3 = new Palisade();
		Car car4 = new RacingCar();
		
		System.out.println("### car1�� �����ϴ� ��ü�� Car��ü�ΰ�? " + (car1 instanceof Car));				// true
		System.out.println("### car1�� �����ϴ� ��ü�� SUV��ü�ΰ�? " + (car1 instanceof SUV));				// false
		System.out.println("### car1�� �����ϴ� ��ü�� RacingCar��ü�ΰ�? " + (car1 instanceof RacingCar));	// false
		System.out.println("### car1�� �����ϴ� ��ü�� Palisade��ü�ΰ�? " + (car1 instanceof Palisade));		// false
		System.out.println();
		
		System.out.println("### car2�� �����ϴ� ��ü�� Car��ü�ΰ�? " + (car2 instanceof Car));				// true
		System.out.println("### car2�� �����ϴ� ��ü�� SUV��ü�ΰ�? " + (car2 instanceof SUV));				// true
		System.out.println("### car2�� �����ϴ� ��ü�� RacingCar��ü�ΰ�? " + (car2 instanceof RacingCar));	// false
		System.out.println("### car2�� �����ϴ� ��ü�� Palisade��ü�ΰ�? " + (car2 instanceof Palisade));		// false
		System.out.println();
		
		System.out.println("### car3�� �����ϴ� ��ü�� Car��ü�ΰ�? " + (car3 instanceof Car));				// true
		System.out.println("### car3�� �����ϴ� ��ü�� SUV��ü�ΰ�? " + (car3 instanceof SUV));				// true
		System.out.println("### car3�� �����ϴ� ��ü�� RacingCar��ü�ΰ�? " + (car3 instanceof RacingCar));	// false
		System.out.println("### car3�� �����ϴ� ��ü�� Palisade��ü�ΰ�? " + (car3 instanceof Palisade));		// true
		System.out.println();
		
		System.out.println("### car4�� �����ϴ� ��ü�� Car��ü�ΰ�? " + (car4 instanceof Car));				// true
		System.out.println("### car4�� �����ϴ� ��ü�� SUV��ü�ΰ�? " + (car4 instanceof SUV));				// false
		System.out.println("### car4�� �����ϴ� ��ü�� RacingCar��ü�ΰ�? " + (car4 instanceof RacingCar));	// true
		System.out.println("### car4�� �����ϴ� ��ü�� Palisade��ü�ΰ�? " + (car4 instanceof Palisade));		// false
		
		
		
		
	}
}
