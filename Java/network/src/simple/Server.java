package simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		// 3000�� port�� Ŭ���̾�Ʈ�� �����û�� ��ٸ��� �������ϰ�ü ����
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(3000);
		System.out.println("### ������ ����� ...");
		
		while (true) {
			System.out.println("### Ŭ���̾�Ʈ�� ���� ��û�� ��� �� ...");
			Socket socket = serverSocket.accept(); // Ŭ���̾�Ʈ�� �����û�� ���
			System.out.println("### Ŭ���̾�Ʈ�� ���� ��û�� �����ϰ�, �ش� Ŭ���̾�Ʈ�� ����ϴ� ������ ������ ...");
			
			// �� ������ �ݴ��� ����(������ ����)�� ����� �Է�/��� ��Ʈ�� ȹ��
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

			// Ŭ���̾�Ʈ�� ���� �޼��� ����
			String text = in.readLine();
			
			// Ŭ���̾�Ʈ�� ���� �޼��� ������
			out.println("�ݰ����ϴ�." + text);
			
			socket.close();
		}
	}
}
