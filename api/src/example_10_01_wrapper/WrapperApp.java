package example_10_01_wrapper;

public class WrapperApp {
	public static void main(String[] args) {
		//Wrapper Ŭ���� ����ϱ�
		int a1 = 10;						// a1���� �⺻�ڷ��� Ÿ���� ������ 10�� ����Ǿ� �ִ�.
		Integer a2 = new Integer(10);		// a2�� ���� 10�� �����ϰ� �ִ� Integer��ü�� �ּҰ��� ������ �ִ�.
		Integer a3 = new Integer("1000");	// a3�� ���ڿ� "1000"�� 1000���� �����ؼ� �����ϰ� �ִ� Integer��ü�� �ּҰ��� ������ �ִ�.
		
		long b1 = 10000000000L;				
		Long b2 = new Long(10000000000L);				
		Long b3 = new Long("10000000000");				
		
		double c1 = 3.14;
		Double c2 = new Double(3.14); 
		Double c3 = new Double("3.14");
		
	}
}
