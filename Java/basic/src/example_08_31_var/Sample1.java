package example_08_31_var;

public class Sample1 {
	public static void main(String[] args) {
		/*����,		����,		����,		����,		����� �����ϴ� ���� �����
		  ����		����		����		����		�Ǽ�
		  int		int		int		int		double
		 korScore mathScore engScore totalScore averageScore */
		
		//����(���� ��� �����) �����ϱ�
		
		int korScore; //������ �����ϴ� ����Ҹ� �޸𸮿� �����ϰ�, �� ������� �̸��� korScore�� ������.
		int mathScore;
		int engScore;
		int totalScore;
		double averageScore;
		
		//������ ������ ���� ����(����)�ϱ�
		korScore = 100;
		mathScore = 80;
		engScore = 90;
		
		//������ ������ �� ����ϱ�
		//������ ������ �� ȭ�鿡 ����ϱ�
		System.out.println("����, ����, �������� ����ϱ�");
		System.out.println(korScore);
		System.out.println(mathScore);
		System.out.println(engScore);
		//System.out.println(totalScore);  //���� : ���� ������� �ʴ� ������ ����� �� ����.
		
		//������ ������ ���� ���꿡 Ȱ���ϱ�
		//���Կ�����(=)�� ��� ������ �߿��� �켱 ������ ���� ����.
		totalScore = korScore + mathScore + engScore;
		averageScore = totalScore / 3;
		
		//������ ������ �� ȭ�鿡 ����ϱ�
		System.out.println("����, ��� ����ϱ�");
		System.out.println(totalScore);
		System.out.println(averageScore);
		
		
		
	}
}
