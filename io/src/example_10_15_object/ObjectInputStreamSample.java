package example_10_15_object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamSample {
	public static void main(String[] args) {
		
		/*
		 * ObjectIntputStream
		 * 		- ����ȭ�� ��ü�� �о�ͼ� ������ȭ�ϴ� ��Ʈ���̴�.
		 * 		- ������ȭ�� ����ȭ�� ��ü ������ �о ��ü�� �����ϰ�, ������� ���� �����ϴ� ���̴�.
		 */
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/temp/doc/objcet.sav"))){
			// object.sav ���Ͽ� ����ȭ�� ��ü������ �о ������ȭ(��ü�� ����) �Ѵ�.
			User user = (User)ois.readObject(); // ObjectŸ�� 
			
			System.out.println("���̵�: " + user.getId());
			System.out.println("��й�ȣ: " + user.getPassword());
			System.out.println("�ڵ�����: " + user.getCar().getName());
			System.out.println("������: " + user.getCreatedDate());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
