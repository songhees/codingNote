package example_10_01_system;

import java.util.Arrays;

public class SystemApp5 {
	public static void main(String[] args) {
		// �迭 �����ϱ�
		// �� ū �迭�� �ű� �� �ִ�. 
		// ���� �迭
		int[] src = {10, 20, 30, 40, 50};
		// ���� �迭�� ������ �迭
		int[] dest = new int[10];
		
		/*
		 * System.arraycopy(Object[] scr, int scrPos, Object[] dest, int destPosm int length);
		 * 		src: �����迭
		 * 		srcPos: �����迭���� ���� ������ġ (�����迭�� index��ȣ)
		 * 		dest: ���迭
		 * 		destPos: ���迭�� �����迭�� ����� ��ġ(��� ���� �������� ���� ���迭�� index��ȣ)
		 * 		length: ���迭�� ������ �����迭�� ����Ƽ ����
		 */	

		System.out.println("���� �� ���迭: " + Arrays.toString(dest));
		
		// �����迭(src)�� 0������ ���迭(dest)�� 0��° ĭ�� �����Ѵ�. ������ �� ������ ������ �����迭�� ��� �����ʹ�.
		System.arraycopy(src, 0, dest, 0, src.length);
		System.out.println("���� �� ���迭: " + Arrays.toString(dest));
		
	}
}
