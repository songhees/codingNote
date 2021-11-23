package simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// �� ��ǻ��(127.0.0.1)���� 3000�� port�� ������� �������α׷����� �����û�� ������.
		Socket socket = new Socket("127.0.01", 3000);
		System.out.println("### ������ �����û�� ���� ...");
		
		// �� ������ �ݴ��� ����(������ ����)�� ����� �Է�/��� ��Ʈ�� ȹ��
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
		
		// ������ �޼��� ������
		out.println("ȫ�浿");
		
		// ������ ���� �޼��� �ޱ�
		String message = in.readLine();
		System.out.println("������ ����޼���: " + message);
		
		socket.close();
	}
}
