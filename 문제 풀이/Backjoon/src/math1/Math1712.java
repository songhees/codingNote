package math1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math1712 {
	public static void main(String[] args) throws IOException {
		
		/*
		 * �������ڴ� ��Ʈ���� �����ϰ� �Ǹ��ϴ� ȸ���̴�. ��Ʈ�� �Ǹ� ����� ������� �ų� �Ӵ��, ��꼼, �����, �޿� �� A������ ���� ����� ���,
		 * �� ���� ��Ʈ���� �����ϴ� ������ ����� �ΰǺ� �� �� B������ ���� ����� ��ٰ� �Ѵ�.
		 * ���� ��� A=1,000, B=70�̶�� ����. �� ��� ��Ʈ���� �� �� �����ϴ� ���� �� 1,070������ ���, �� �� �����ϴ� ���� �� 1,700������ ���.
		 * ��Ʈ�� ������ C�������� å���Ǿ��ٰ� �Ѵ�. �Ϲ������� ���� ����� �÷� ���� ���� ��� ���� �� ����(�Ǹź��)�� �� ���(=�������+�������)���� �������� �ȴ�. 
		 * ���ʷ� �� ������ �� ��뺸�� ������ ������ �߻��ϴ� ������ ���ͺб���(BREAK-EVEN POINT)�̶�� �Ѵ�.
		 * A, B, C�� �־����� ��, ���ͺб����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// ��������� ������ �����ϱ�
		StringTokenizer st = new StringTokenizer(bf.readLine()); //StringTokenizer���ڰ��� �Է� ���ڿ� ����
		long fixedCost = Long.parseLong(st.nextToken()); //ù��° ȣ��
		long variableCost = Long.parseLong(st.nextToken()); 
		long cost = Long.parseLong(st.nextToken()); 
		
		long x = 0;
		if (variableCost == cost) {
			x = -1;
			
 		} else {
			long standard = fixedCost/(cost-variableCost);
			while (standard >= x) {
				x++;
			}
 		}
		if (x==0) {
			x = -1;
		}
		System.out.println(x);
	}
}
