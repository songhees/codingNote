package example_10_15_object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutputStreamSample {
	public static void main(String[] args) {
		
		/*
		 * ObjectOutputStream
		 * 		- ��ü�� ����ȭ��Ű�� ����ϴ� ��Ʈ���̴�.
		 * 		- ����ȭ�� ��ü�� ��Ʈ������ ��°����� ���·� ��ȯ�ϴ� ���� ���Ѵ�.
		 * 		- ����ȭ�� ������ ��ü�� Ŭ������, ��������� �̸��� Ÿ��, ��������� ����� ���� ��Ʈ������ ����ϴ� ���̴�. �ϳ��� �������°�
		 */
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/temp/doc/objcet.sav"));) {
			
			User user = new User();
			user.setId("hong");
			user.setName("��");
			user.setPassword("zxcv1234");
			user.setPoint(35000);
			user.setCreatedDate(new Date());
			
			user.setCar(new Car("���׽ý�", "����", 80000000L));
			// ������ User��ü�� ����ȭ�ؼ� ��Ʈ������ ����ϱ�
			oos.writeObject(user);
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
}
