package hundred;

import java.util.Scanner;

/**
 * [����-����] ���ϴ� ���ڰ� �Էµ� ������ �ݺ� ����ϱ�
 * @author song
 *
 */
public class Base79 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char al = 0;
		
		while (al != 'q') {
			al = scan.next().charAt(0);
			System.out.println(al);
		} 
		scan.close();
	}
}
