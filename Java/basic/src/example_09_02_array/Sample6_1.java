package example_09_02_array;

import java.util.Scanner;

public class Sample6_1 {
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
	
		for (int i = 0; i < names.length; i++) {
			System.out.print("�̸��Է�: ");
			names[i] = scan.next();
			System.out.print("����� �Է�: ");
			korScores[i] = scan.nextInt();
			System.out.print("����� �Է�: ");
			engScores[i] = scan.nextInt();
			System.out.print("���м��� �Է�: ");
			mathScores[i] = scan.nextInt();
			
		}
		
		for (int i = 0 ; i < names.length ; i ++) {
			String name = names[i];
			int korScore = korScores[i];
			int engScore = engScores[i];
			int mathScore = mathScores[i];
			int totalScore = korScore + engScore + mathScore;
			int average = totalScore/3;
			System.out.println(name + "\t" + korScore + "\t" + engScore + "\t" + mathScore + "\t" + totalScore + "\t" + average);
			
		}
		
		scan.close();
	}
}
