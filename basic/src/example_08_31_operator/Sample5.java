package example_08_31_operator;

public class Sample5 {
	public static void main(String[] args) {
		/*
		 * ����������
		 * ++ --
		 * ������ ���� 1������Ű�ų� 1���ҽ�Ų��.
		 */
		int num = 5;
		
		num ++;		// num += 1;�� �����ϴ�.	//	6
		System.out.println("num�� ��: "+ num);
		++ num;
		System.out.println("num�� ��: "+ num);	// 7
		
		num --;
		System.out.println("num�� ��: "+ num);	// 6
		-- num;
		System.out.println("num�� ��: "+ num);	// 5
		
		// ������������ ��ġ�� ���� ���� ����
		int x = 10;
		int y = 10;
		
		int value1 = ++x;		// x�� ���� 1������Ű�� x�� ���� value1�� �����Ѵ�. 
		int value2 = y++;		// y�� ���� value2�� �����ϰ� y�� ���� 1������Ų��. ���� ���������ڿ� �ٸ� �����ڸ� ���� ���°��� ������ �ʴ´�.
		
		
		System.out.println("x�� ��:" + x); // 11
		System.out.println("y�� ��:" + y); // 11
		System.out.println("value1�� ��:" + value1); // 11
		System.out.println("value2�� ��:" + value2); // 10
		
		// ���������ڿ� �ٸ� �����ڸ� �����ؼ� ���๮�� �ۼ����� �ʴ´�.
		++x;
		int value3 = x; // 12
		y++;
		int value4 = y; // 12
		
		System.out.println("x�� ��:" + x);
		System.out.println("y�� ��:" + y);
		System.out.println("value3�� ��:" + value3);
		System.out.println("value4�� ��:" + value4);
	}
}
