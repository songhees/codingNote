package example_09_02_array;

import java.util.Scanner;

public class Sample8_1 {
	public static void main(String[] args) {
		/*
		 * �л�����, �̸�, ����, ����, ���� ������ �迭�� �����ϰ�, ���������� ����Ͻÿ�.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		String[] names = new String[3];			
		int[][] scores = new int[3][];	
		String[] scoreNames = {"��������", "��������", "��������", "��������", "�������"};
		int savePosition = 0;
		
		while (true) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.��ȸ	2.�Է�	3.����.	0.����");
			System.out.println("---------------------------------------------------");
			System.out.println("�޴���ȣ�� �Է��ϼ���.");
			int menu = scan.nextInt();
			
			if (menu == 1) {
				System.out.println("[�������� ��ȸ]");
				
				for (int i = 0 ; i <3; i++) {
					System.out.println("�л��̸�: " + names[i]);
					int[] score = scores[i];
					for(int j =0; j <5; j++)
						System.out.println(scoreNames[j] + ": " + score[j]);
					System.out.println("------------------------------------");
				}
				
			} else if (menu == 2) {
				System.out.println("[�������� �Է�]");
				
				if (savePosition<3) {
					System.out.print("�л��̸��� �Է��ϼ���.");
					String name = scan.next();
					System.out.print("���������� �Է��ϼ���.");
					int korScore = scan.nextInt();
					System.out.print("���������� �Է��ϼ���.");
					int engScore = scan.nextInt();
					System.out.print("���������� �Է��ϼ���.");
					int mathScore = scan.nextInt();
					
					names[savePosition] = name;

					int score[] = new int[5];
					score[0] = korScore;
					score[1] = engScore;
					score[2] = mathScore;
					score[3] = korScore + engScore + mathScore;
					score[4] = score[3]/3;
					scores[savePosition] = score;
					
					savePosition ++;
					System.out.println("### �Է��� �Ϸ�Ǿ����ϴ�.");
				} else {
					System.out.println("### �� �̻� �Է��� �� �����ϴ�.");
				}
			} else if (menu == 2) {
				System.out.println("[�������� ����]");
				
			} else if (menu == 0) {
				System.out.println("[���α׷� ����]");
				System.exit(1);	
			}	
			scan.close();
		}
	}
}
