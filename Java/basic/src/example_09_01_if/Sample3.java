package example_09_01_if;

public class Sample3 {
	public static void main(String[] args) {
		/*if���� ������ �������� ��� ����� ���� Ȯ���ؾߵ� �� ����Ѵ�.
		 * if ~ else if ~ else if ~ else ��
		 * �˻��� ������ ���� ������ ��� ���Ǵ� ���ǹ��̴�.
		 * 
		 * ���������� �´� ������ ����ϴ� ���α׷�
		 * 
		 * 4.5 �̻�		"A+"
		 * 4.0 ~ 4.4	"A"
		 * 3.5 ~ 3.9	"B+"
		 * 3.0 ~ 3.4	"B"
		 * 2.5 ~ 2.9	"C+"
		 * 2.0 ~ 2.4	"C"
		 * 1.5 ~ 1.9	"D+"
		 * 1.0 ~ 1.4	"D"
		 * 0.9 ����		"F"
		 */
		
		double score = 4.8;
		
		// if���� ����ؼ� �����ϱ�
		/*if (score >= 4.5) {
			System.out.println("A+");
		}
		if (score >= 4.0 && score <= 4.4) {
			System.out.println("A");
		}
		if (score >= 3.5 && score <= 3.9) {
			System.out.println("B+");
		}
		if (score >= 3.0 && score <= 3.4) {
			System.out.println("B");
		}
		if (score >= 2.5 && score <= 2.9) {
			System.out.println("C+");
		}
		if (score >= 2.0 && score <= 2.4) {
			System.out.println("C");
		}
		if (score >= 1.5 && score <= 1.9) {
			System.out.println("D+");
		}
		if (score >= 1.0 && score <= 1.4) {
			System.out.println("D");
		}
		if (score <= 0.9) {
			System.out.println("F");
		}*/
	
		// if ~ else if ~ else if ~ else�� ����ؼ� �����ϱ�
		if (score >= 4.5) {
			System.out.println("A+");
		} else if (score >= 4.0) {
			System.out.println("A");
		} else if (score >= 3.5) {
			System.out.println("B+");
		} else if (score >= 3.0) {
			System.out.println("B");
		} else if (score >= 2.5) {
			System.out.println("C+");
		} else if (score >= 2.0) {
			System.out.println("C");
		} else if (score >= 1.5) {
			System.out.println("D+");
		} else if (score >= 1.0) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
