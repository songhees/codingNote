package example_08_31_operator;

public class Sample7 {
	public static void main(String[] args) {
		/*
		 * ��������
		 * &&	||	!
		 * ���������� �������� ������ boolean ���̴�.
		 * �����꿡 �����ϴ� ���� boolean Ÿ���� ���̰ų�, Ȥ�� �������� boolean���� ����ĸ� �����ϴ�.
		 * ������ boolean ����� boolean
		 * 
		 * && �����ڴ� ������ ���� false�� ������ ���� Ȯ������ �ʰ� ������ �������� false�� �����Ѵ�.
		 * || �����ڴ� ������ ���� true�� ������ ���� Ȯ������ �ʰ� ������ �������� true�� �����Ѵ�.
		 * ���� �Ʒ��� ���� �ڵ�� �߸��� �ڵ��.
		 * 
		 * boolean result = a > b || x > ++y; 
		 * int num = z + y;		
		 * 
		 * a>b�� true false�� ���� ������ ���꿩�ΰ� �����ǹǷ�
		 * a > b�� �������� true�� ��� y���� 1������Ű�� ������ ������� �ʴ´�.
		 * a > b�� �������� false�� ��쿡�� y���� 1�����ȴ�.
		 * ����, num�� ����� ���Ŀ��� a > b�� �������� ���� �ٸ� ����  ����� �� �ִ�.
		 * 
		 * ���� �ڵ�� �Ʒ��� ���� �����ؾ� �Ѵ�.
		 * ++y;
		 * boolean result = a > b || x > y;
		 * int num = z + y;
		 * �ؾ� num�� �׻� ���� ���� ���´�.
		 */
		
		String name = "ȫ�浿";
		//System.out.println(!name);	�Ұ��� �������� name�� boolean�� �ƴ�
		
		System.out.println(true && true);	//true
		System.out.println(true && false);	//false
		System.out.println(false && false);	//false
		
		System.out.println(true || true);	//true
		System.out.println(true || false);	//true
		System.out.println(false || false);	//false
		
		System.out.println(!true);
		System.out.println(!false);
		
	}
}
