package example_09_02_array;

import java.util.Scanner;

public class Sample8 {
	public static void main(String[] args) {
		/*
		 * �л�����, �̸�, ����, ����, ���� ������ �迭�� �����ϰ�, ���������� ����Ͻÿ�.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		String[] names = new String[3];			//{"�̼���", "������", "������"}
		int[][] scores = new int[3][];			//{100, 100, 100, 300, 100}, {80, 80, 100, 260, 86}, 
		String[] scoreNames = {"��������", "��������", "��������", "��������", "�������"};
		
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
				
				for(int i = 0; i <3; i++) {
					System.out.print("�л��̸��� �Է��ϼ���.");
					String name = scan.next();
					System.out.print("���������� �Է��ϼ���.");
					int korScore = scan.nextInt();
					System.out.print("���������� �Է��ϼ���.");
					int engScore = scan.nextInt();
					System.out.print("���������� �Է��ϼ���.");
					int mathScore = scan.nextInt();
					
					//�л��̸��� names�迭�� �����Ѵ�.
					names[i] = name;
					//���� ����, ����, ����� �����ϴ� �迭�� �����Ѵ�.
					int score[] = new int[5];
	
					//������ �迭�� ���� ����, ����, ����� ������� �����Ѵ�.
					score[0] = korScore;
					score[1] = engScore;
					score[2] = mathScore;
					score[3] = korScore + engScore + mathScore;
					score[4] = score[3]/3;
					//������ �迭�� 2���� �迭�� �����Ų��.
					// for���� ���๮ ����� ����� ������ scores�迭�� 0��° 1��° 2���� ���� ������ �迭�� ����(����ȴ�.
					scores[i] = score;
				}
				System.out.println("### �Է��� �Ϸ�Ǿ����ϴ�.");
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
