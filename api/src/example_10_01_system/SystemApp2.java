package example_10_01_system;

import java.util.Date;

public class SystemApp2 {
	public static void main(String[] args) {
		
		// �ý����� ���н�Ÿ���� ��ȸ�ϱ�
		long unixTime = System.currentTimeMillis();
		System.out.println("���н� Ÿ��: " + unixTime);
		// ���н� Ÿ���� �̿��ؼ� url�� ��� ���ο� ���� �����´�.
		// ���� �տ� ���н� Ÿ���� �ٿ���
		// �Ȱ��� �����̸��� �������� �����Ƿ� �ߺ�ó������ ���� �� �ִ�
		// �Ź� �ٸ� ���� ����ϹǷ�
		// 1633059112280������.jpg 	Sns���� ���� �̸����� �÷��� ����Ǵ� ������ �ٸ���.
		// 1633059112780������.jpg	���н� Ÿ������ ���� �ߺ����� ó������ �ʴ´�.
		
		// �ý����� ���� ��¥�� �ð������� �����ϴ� ��ü �����ϱ�
		Date now = new Date();
		System.out.println(now);// toString�� �����ǵǾ� �ִ�.
		// now ��ü�� ��������� ������ �ý����� ��¥�� �ð������� �������ִ�.
		
		Date day = new Date(0);		// ���� ��¥�� �ð��� �ʿ��� ��� ���
		System.out.println(day);	// ���н�Ÿ���� ��µǴµ� ������ ���н� Ÿ���� 0���϶� �ѱ��� 9���̹Ƿ� 9�� ���´�.
									// Date���� ��¥�� �ð� ���õ� ������ ����.
		// ��¥�� �ð������� �����ϴ� ��ü java.util.Date
		// ��¥������ �����ϴ� ��ü java.sql.Date
		// �ð������� �����ϴ� ��ü java.sql.Timestamp
		//java.time ��Ű������ ��¥ �ð� ������ ���̺귯���� �ִ�
		// ��¥������ �����ϴ� ��ü java.time.LocalDate	//Local == ����
		// �ð������� �����ϴ� ��ü java.time.LocalTime
		// ��¥�� �ð������� �����ϴ� ��ü java.time.LocalDateTime
	}
}
