package example_08_31_casting;

public class Sample1 {
	public static void main(String[] args) {
		/*
		 * �ڵ�����ȯ
		 * ���α׷� ����� JVM�� �ڵ����� ó���Ѵ�.
		 * ũ�Ⱑ �� ū �ڷ����� ������ ����� �� �ڵ�����ȯ�� �Ͼ��.
		 */
		int num = 100;			 // 
		double value1 = num;	 // double value1 = 100 -> double value1 = 100.0
								 // 		double	int			double		double
							 	 // 100�� ���� double������ �ٲ��(casting) value1�� �������.
		System.out.println(num);
		System.out.println(value1);
		
		/*
		 * ������ �����ϱ� ���� ���� ������Ÿ������ ��ȯ�� ���� ������ ����ȴ�.
		 * ���꿡 ������ ���� ������Ÿ�Ե� �߿��� ���е��� ���ų� ũ�Ⱑ �� ū �ڷ������� �ڵ�����ȯ�� �Ͼ��.
		 */
		System.out.println(3/10);		// ����/����			3/10 			   = 0
										// �¿찡 Ÿ���� �����Ƿ� ����ȯ�� �ʿ����.	
		System.out.println(3/10.0);		// ����/�Ǽ� 			3/10.0 -> 3.0/10.0 = 0.3
										// ���е��� ���� �Ǽ��� �ڵ����� ��ȯ�Ѵ�. ������ �ٲٸ� ������ �ս��� �߻��ϹǷ� ��ȯ���� �ʴ´�.
		
		System.out.println(3.0/10);		// �Ǽ�/����			3.0/10 -> 3.0/10.0 = 0.3
		System.out.println(3.0/10.0);	// �Ǽ�/�Ǽ�			3.0/10.0		   = 0.3
		
	}
}
