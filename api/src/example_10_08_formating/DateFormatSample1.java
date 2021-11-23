package example_10_08_formating;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatSample1 {
	public static void main(String[] args) {
		// �ý����� ���� ��¥�� �ð������� �����ϰ� �ִ� Date��ü ����
		Date date = new Date();
		
		System.out.println("### Date��ü�� toString() �޼ҵ尡 ��ȯ�ϴ� ���ڿ� ����ϱ�");
		System.out.println(date);
		
		// Date�� ������ ������ ���ڿ��� �ٲٱ�
		System.out.println("Date�� ���Ե� ���ڸ� ����ȭ�� �ؽ�Ʈ�� ��ȯ�ϱ�");
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		
		// Date�� ���Ե� ��¥�� �ð������� "2010-10-08" �������� �������ϴ� ������ �����ϱ�
		sdf1.applyPattern("yyyy-MM-dd");
		String dateText1 = sdf1.format(date);
		System.out.println("[yyyy-MM-dd] " +dateText1);
		
		sdf1.applyPattern("yyyy�� M�� d�� EEEE");
		String dateText2 = sdf1.format(date);
		System.out.println("[yyyy�� M�� d�� EEEE]"+ dateText2);
		
		sdf1.applyPattern("HH:mm:ss");
		String dateText3 = sdf1.format(date);
		System.out.println("[HH:mm:ss]" + dateText3);
		
		sdf1.applyPattern("a h�� m�� s��");
		
		sdf1.applyPattern("yy�� M�� d�� EEEE a h�� m�� s��");
		String dateText5 = sdf1.format(date);
		System.out.println("[yy�� M�� d�� EEEE a h�� m�� s��] "+ dateText5);
		
	}
}
