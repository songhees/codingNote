package example_08_31_var;

public class Sample5 {
	public static void main(String[] args) {
		/* ����(boolean ��)
		 * �� ���� ���¸��� ������ ���� ǥ���� �� ���Ǵ� ���̴�.
		 * ��) �հ�/���հ�, ����/����, ��ȥ/��ȥ, ��/��, ...
		 * true�� false�� ���� ��/�������� ǥ���ϴ� �ڹ��� ������.
		 * �Ҹ�Ÿ���� ������ ���� true/false �� �� �ϳ��� ���� ������ �� �ִ�.
		 */
		
		boolean passed = true;	// �հ��� true, ���հ��� false
		boolean guest = true;	// ��ȸ���� true, ȸ���� false
		boolean hasHouse = true;// ������ true, �ܺ��� false
		
		System.out.println(passed);
		System.out.println(!guest);
		
		// ȭ�鿡 �Ҹ�Ÿ���� ���� ���ڿ��� ������� �� � ���� �Ҹ������� ������ �� ����.
		System.out.println(true);		// true�� ���
		System.out.println("true");		// true�� ���
		System.out.println("false");	// false�� ���
	}
}
