package question;

/**
 * �ڡڡڡڡ�
 * �迭���� ���� 100�� ���� �ٸ� ��ġ�� �� ���Ұ� �����ϸ� 1�� �ƴϸ� 0�� ��ȯ�ϴ� �Լ� ���ϱ�
 * @author song
 *
 */
public class Q0X01import {
	// �� ���� ���� ���θ� üũ�ϴ� �迭 �����
	// 100�� �Ǵ� ���� ���翩�θ� O(N)�� �ƴ� O(1)���� �˾� ������ �ؾ�
	// O(N)�� �ذ�å�� ã�� �� �ִ�.
	public static void main(String[] args) {
		int[] array = {1, 23, 53, 77, 60};
		System.out.println(func2(array));
		
	}
	
	static int func2(int[] arr) {
		int[] num = new int[99]; // 1���� 99������ ¦�� ���� ���θ� �����ϴ� �迭 ����
		int result = 0;
		
		for (int i=0; i<arr.length; i++) {
			// �迭�� ���� ���� 100�̵Ǵ� ���� index�� �ش��ϴ� num�迭�� ���� 0�̸� ¦�� �����̰� 1�̸� ¦�� �����̴�.
			// index�� ������ �ٷ� index���� Ȯ���ؼ� ¦���θ� �Ǵ��ϹǷ� ��ü���� �ð����⵵�� O(N)�̴�.
			int tar = 100-arr[i];
			if (num[tar-1] != 1) {
				num[arr[i]-1]++;
			} else {
				result = 1;
				break;
			}
		}
		return result;
	}
}
