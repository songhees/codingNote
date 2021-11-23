package example_10_14_reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class BufferedReaderExample2 {

	public static void main(String[] args) throws Exception {
		// ���ҽ�	
		String path = "https://raw.githubusercontent.com/choosunsick/Korea_Stocks/master/Korea_Stocks_since_2021/000020.csv";
		// url�ּҸ� ǥ���ϴ� ��ü
		URL url = new URL(path);
		
		// url�ּҰ� ����Ű�� ���ҽ��� 1byte�� �о���� ��Ʈ����ü�� ȹ����
//		InputStream inputStream = url.openStream();
		// ����Ʈ��Ʈ���� ����Ǵ� Reader��ü �����ϱ�
//		InputStreamReader isr = new InputStreamReader(inputStream);
		// �� ���ξ� �о���� BufferedReader�� InputStreamReader��ü ����
//		BufferedReader reader = new BufferedReader(isr);
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		
		// �����Ϳ� ���� �÷��� ȹ���ϱ�
//		String[] columns = reader.readLine().split(",");
	
		// ù��°�� �о ����
		reader.readLine();
		
		int totalAmount = 0;
		
		String text = null;
		while((text = reader.readLine()) != null) {
			String[] values = text.split(",");
			int amount = Integer.parseInt(values[5]);
			totalAmount += amount;
		}
		System.out.println("�Ⱓ�� �� �ŷ��ݾ�: " + totalAmount + "��(��)");
		
		reader.close();
	}

}
