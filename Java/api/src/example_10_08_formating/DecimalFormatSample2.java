package example_10_08_formating;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatSample2 {
	public static void main(String[] args) throws ParseException {
		
		String text1 = "12345";
		String text2 = "12,345";
		
		// ���� ���� ���ڰ� ���� ���
		int number1 = Integer.parseInt(text1);
//		int number2 = Integer.parseInt(text2); // �����߻� java.lang.NumberFormatException <= ����ó���� ���ص��Ǵ� ���� �߻�
		// �� �������� �ȶ���?
		// ����ó���� �����ϴ� exception�� ó������ �ʾƵ� ������� exception�� �ִ�.
		
		// ���ڿ��� ���ڸ� ���� ������ ���� ���ڷ� �ٲٱ�
		text2 = text2.replace("," , "");
		int number2 = Integer.parseInt(text2);
		
		// ���ڷ� ����� ������ ��Ģ���� �����غ���
		System.out.println(number1 + number2);
		
		String text3 = "12,345,678";
		DecimalFormat df = new DecimalFormat("##,###");
		// Number�� Byte, Short, Integer, Long, Float, Double�� �θ� Ŭ������.
		Number number3 = df.parse(text3);
		int value = number3.intValue();
		System.out.println(value);
	}
}