package example_09_16_casting;

public class CarApp3 {
	public static void main(String[] args) {
		/*
		 * Ŭ���� ����ȯ Ȱ���ϱ�
		 * 
		 * 		+ �θ�Ÿ���� �迭�� �پ��� �ڽ�Ÿ�԰�ü�� ������ �� �ִ�.
		 * 		  (�迭�� ����Ǵ� ��ü�� �������� ������ �� �ִ�.)
		 */
		
		// ���� �ڵ��� ��ü�� ������ �� �ִ� �迭 �����ϱ�
		Car[] carArray1 = new Car[5];
		carArray1[0] = new Palisade();
		carArray1[1] = new SUV();
		carArray1[2] = new RacingCar();
		carArray1[3] = new Palisade();
		carArray1[4] = new Palisade();
		
		// ���� SUV ��ü�� ������ �� �ִ� �迭 �����ϱ�
		SUV[] carArray2 = new SUV[3];
		carArray2[0] = new SUV();
		carArray2[1] = new Palisade();
//		carArray2[1] = new Car();			//	����, SUVŬ������ ���� Ŭ����Ÿ�� ��ü�� �ƴ�
//		carArray2[1] = new RacingCar();		//	����, SUVŬ������ ���� Ŭ����Ÿ�� ��ü�� �ƴ�
		carArray2[2] = new Palisade();
		
	}
}
