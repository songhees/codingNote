package example_10_01_math;

public class ex {
	public static String delChar(String src, String target) {
		/*
		 * ���ڿ��� ������ ���ڰ� ���ԵǾ� �ִ� ��ġ�� Ȯ��
		 * Ȯ���� ��ġ�� �ִ� ���ڸ� ����
		 * ���ڿ��� ��ȯ�Ѵ�.
		 * 
		 */
		StringBuffer delate = new StringBuffer(src);
		int index = 0;
		int pos = 0;
		
		while (index != target.length()) {
			pos = src.indexOf(target.charAt(index), pos);
			if (pos == -1) {
				index ++;
				pos = 0;
				continue;
			}
			delate.deleteCharAt(pos);	
			src = delate.toString();
			pos++;
		}
		return src.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println(delChar("(1 2 3 4\t5)"," \t"));
	}
}
