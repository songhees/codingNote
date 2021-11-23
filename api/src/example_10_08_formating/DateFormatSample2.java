package example_10_08_formating;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatSample2 {
	public static void main(String[] args) throws ParseException {
		
		Date today = new Date();
		
		String text1 = "1997-04-04";
		// parse�� text�� �Ȱ��� ������ �������ش�.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = sdf.parse(text1);
		// ����ڰ� �Է��� ��¥�� �߸��� �Է��� ������ ��� ó���� �� �ΰ�? ex) 13��
		//������� �Ǽ��� �ý��� ������ ������ ������ �������� ��� ó���� ���� �ڵ忡 ����� ���ߵȴ�.
		// ������� �Ǽ��� �ý��� ������ ������ �߻��� ���ɼ���
		// �ִ� �޼ҵ��� ��� ParseException��� ���� ��ü(���������� ��� �ִ�)�� �����ؼ� ������.
		// ���� ��ü�� ����� �޼ҵ�(main)�� ��������.
		// �Ǵ����°� = ����(throws) ���ܰ� �߻��ϸ� �� ���ܸ� catch�ϴ� ������ ���°�(try catch) 
		
		long todayUnixTime = today.getTime();
		long birthdayUnixTime = birthday.getTime();
		
		long day = (todayUnixTime-birthdayUnixTime)/(60*60*24*1000);
		
		System.out.println(day);
		
		
	}
}
