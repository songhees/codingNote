package example_09_02_array;

import java.util.Scanner;

public class Sample6 {
	public static void main(String[] args) {
		/*
		 * �л��̸�, ��������, ��������, ���������� �Է¹޾Ƽ� �迭�� �����ϰ�,
		 * �л��� ����, ����� ����ؼ� ����Ͻÿ�.
		 * ��¿�) 	������	100		100		100		300		100
		 *  		������	80		70		80		230		75
		 */
		
		Scanner scan = new Scanner(System.in);
		
		// �л��̸�, ��������, ��������, ���������� �����ϴ� �迭�� �����ϱ�
		String[] names = new String[5];
		int[] korScores = new int[5];
		int[] engScores = new int[5];
		int[] mathScores =  new int[5];
		int[] totalScores = new int[5];
		int[] averages = new int[5];
	
		for (int i = 0; i < names.length; i++) {
			System.out.print("�̸��Է�: ");
			names[i] = scan.next();
			System.out.print("����� �Է�: ");
			korScores[i] = scan.nextInt();
			System.out.print("����� �Է�: ");
			engScores[i] = scan.nextInt();
			System.out.print("���м��� �Է�: ");
			mathScores[i] = scan.nextInt();
			
			totalScores[i] = korScores[i] + engScores[i] + mathScores[i];
			averages[i] = totalScores[i]/3;
		}
		
		for (int i = 0 ; i < names.length ; i ++) {
			System.out.println(names[i] + "\t" + korScores[i] + "\t" + engScores[i] + "\t" + mathScores[i] + "\t" + totalScores[i] + "\t" + averages[i]);
			
		}
		
		scan.close();
	}
}
