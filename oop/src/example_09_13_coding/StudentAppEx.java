package example_09_13_coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class StudentAppEx {

	public static void main(String[] args) {
		// �л�����/���������� �Է��ϰ�, ��ȸ�ϰ�, �����ϴ� ���α׷�
		
		// AtomicInteger�� �ڵ����� �������͵Ǵ� ���ڸ� �����ϴ� ��ü��.
		// new AtomicInteger(����) : ������ ���ں��� �����Ѵ�. ���ϸ� 0���� ����
		AtomicInteger atomic = new AtomicInteger(101); 
		Scanner scan = new Scanner(System.in);
		
		List<Student> list = new ArrayList<>(); 
		
		// ���� �л����� �̸� �Է��صα�
		list.add(new Student(atomic.getAndIncrement(), 1, "������", new ScoreDetail(100, 90, 70)));
		list.add(new Student(atomic.getAndIncrement(), 1, "������", new ScoreDetail(70, 70, 40)));
		list.add(new Student(atomic.getAndIncrement(), 1, "�̼���", new ScoreDetail(80, 90, 10)));
		list.add(new Student(atomic.getAndIncrement(), 1, "������", new ScoreDetail(100, 90, 100)));
		list.add(new Student(atomic.getAndIncrement(), 1, "ȫ�浿", new ScoreDetail(60, 40, 70)));
		
		while(true) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.��ȸ	2.�Է�	3.����	4.����	0.����");
			System.out.println("------------------------------------------------------");
			
			System.out.print("�޴���ȣ ����: ");
			int menuNo = scan.nextInt();
			
			if ( menuNo == 1 ) {
				System.out.println("[��ü �л�/���� ���� ���]");
				
				if (list.isEmpty()) {
					System.out.println("### ��ϵ� �л�/���� ������ �������� �ʽ��ϴ�.");
					continue;
				}
				
				System.out.println("�й�\t�г�\t�̸�\t����\t����\t����\t����\t���");
				for (Student student : list) {
					System.out.print(student.getNo() + "\t");
					System.out.print(student.getGrade() + "\t");
					System.out.print(student.getName() + "\t");
					System.out.print(student.getScore().getKor() + "\t");
					System.out.print(student.getScore().getEng() + "\t");
					System.out.print(student.getScore().getMath() + "\t");
					System.out.print(student.getScore().getTotal() + "\t");
					System.out.println(student.getScore().getAverage());
				}	
				System.out.println("### ��ϵ� �л�/���輺�� ������ ����� �Ϸ�Ǿ����ϴ�.");
				
				
			} else if ( menuNo == 2 ) {
				System.out.println("[�ű� �л�/���� ���� �Է�]");
				System.out.println("### �ű� �л�/���輺�� ������ �Է��ϼ���.");
				
				// AtomicInterger��ü�� getAndIncrement()�޼ҵ带 �����ؼ� ��ü�� ���� ���� ������ ����, ���� 1���� ��Ų��.
				int no = atomic.getAndIncrement();
				System.out.print("�г��Է�: ");
				int grade = scan.nextInt();
				System.out.print("�̸��Է�: ");
				String name = scan.next();
				System.out.print("�����Է�: ");
				int kor = scan.nextInt();
				System.out.print("�����Է�: ");
				int eng = scan.nextInt();
				System.out.print("�����Է�: ");
				int math = scan.nextInt();
				
				ScoreDetail score = new ScoreDetail(kor, eng, math);
				list.add(new Student(no, grade, name, score));
				System.out.println("### �л�/���輺�� ������ ������ �Ϸ�Ǿ����ϴ�.");
				
				
			} else if ( menuNo == 3 ) {
				System.out.println("[�л�/���� ���� ����]");
				System.out.println("### ���� ���� ������ �����մϴ�.");
				
				System.out.println("������ �л��� �й� �Է�: ");
				int num = scan.nextInt();				
				
				System.out.print("������ ����� �Է�: ");
				String subject = scan.next();
				
				System.out.print("������ ���� �Է�: ");
				int value = scan.nextInt();
				// �Է��� �ѹ��� ���� �й��� ���� Student��ü�� �ּҰ��� ������ ���� ����
				Student foundStudent = null;
				for (Student student : list) {
					if (student.getNo() == num) {
						foundStudent = student;
					}
				}
				if (foundStudent == null) {
					System.out.println("�����ϴ� �л� ������ �����ϴ�.");
					continue;
				}
				ScoreDetail score = foundStudent.getScore();
				
				switch (subject) {
					case "����":
						score.setKor(value);
						break;
					case "����":
						score.setEng(value);							
						break;
					case "����":
						score.setMath(value);							
						break;
				}
				System.out.println("### ���輺�� ������ ������ �Ϸ�Ǿ����ϴ�.");	
				
				
				
			} else if ( menuNo == 4 ) {
				System.out.println("[�л�/���� ���� ����]");
				System.out.println("������ �л��� �й��� �Է��ϼ���: ");
				int num = scan.nextInt();
					
				Student foundStudent = null;
				for (Student student : list) {
					if (student.getNo() == num) {
						foundStudent = student;
					}
				}
				if (foundStudent == null) {
					System.out.println("�����ϴ� �л� ������ �����ϴ�.");
					continue;
				}
				
				list.remove(foundStudent);

				System.out.println("### �л�/���輺�� ������ ������ �Ϸ�Ǿ����ϴ�.");
	
				
				
			} else if ( menuNo == 0 ) {
				System.out.println("[���α׷� ����]");
				break;
			}
			System.out.println("\n\n\n");
		}
		scan.close();
	}
}