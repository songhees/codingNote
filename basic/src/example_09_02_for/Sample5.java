package example_09_02_for;

// JRE�� �����ϴ� ���̺귯�� �߿��� java.util ��Ű���� ���ԵǾ��ִ� Scanner�� Sample5���� import ��Ų��.
import java.util.Scanner;

public class Sample5 {
	public static void main(String[] args) {
		/*
		 * ���ڸ� �Է¹޾Ƽ� 1���� �� ���ڱ����� �հ踦 ���ϱ�
		 * 
		 * System.in(ǥ���Է���ġ, Ű����)���� ���� �Է°��� �о���� Scanner��ü�� ������
		 */
		Scanner scan = new Scanner(System.in);
		
		//nextInt()�� Ű����� �Էµ� ���� ����(intŸ��)�� �о�´�.
		System.out.print("�����Է�: ");
		int number = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + number + " �հ�: " + sum);
		
		scan.close();
	}
}
