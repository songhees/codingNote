package example_09_16_casting;

import java.util.Scanner;

public class CarApp2 {
	public static void main(String[] args) {
		/*
		 * Ŭ���� ����ȯ Ȱ���ϱ�
		 * 
		 * 		+ �θ�Ÿ���� ���������� ��� �ڽ�Ÿ�԰�ü�� ������ �� �ִ�.
		 */
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.SUV	 2.���̽�ī	 3.�縮���̵�");
			System.out.println("----------------------------------------------------------");
			
			System.out.print("������ ������ �����ϼ���: ");
			int carType = scan.nextInt();
			
	//		SUV car1 = null;
	//		RacingCar car2 = null;
	//		Palisade car3 = null;
			// �̷��� ���� ���� �þ�� ���� ������ �����ؾ��ϹǷ� ������ �þ�� �ȴ�.
			Car car = null;
			// ������� �θ� Car�̹Ƿ� ������� ��ü�� Car ���������� ���� �� �ִ�.
			if (carType == 1 ) {
				car = new SUV();
			} else if (carType == 2) {
				car = new RacingCar();
				
			} else if (carType == 3) {
				car = new Palisade();
				
			} else {
				System.out.println("### �����ϱ� �ʴ� �����Դϴ�.");
				continue;
			}
			
			System.out.println("������ ���� �̸�: " + car.getClass().getName());
			
			scan.close();
			break;
		}
	}
}
