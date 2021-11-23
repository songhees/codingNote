package example_10_15_data;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamSample {
	public static void main(String[] args) {
		
		/*
		 * DataOutputStream
		 * 		�⺻�ڷ��� �� ���ڿ��� Ÿ�԰� �� �״�� ����ϴ� ��Ʈ���̴�.
		 */
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("c:/temp/doc/data.sav"));) {
			
			dos.writeInt(100);				// ��ȣ
			dos.writeUTF("�ڹ��� ����");		// ����
			dos.writeInt(35000);			// ����
			dos.writeDouble(0.03);			// ������
			dos.writeBoolean(false);		// ��������
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
