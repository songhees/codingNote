package example_10_01_system;

import java.io.IOException;

public class SystemApp {
	public static void main(String[] args) throws IOException{
		
		System.out.println(System.err);
		System.out.println(System.in);
		System.out.println(System.out);
		
		System.err.println("ǥ�� ���������ġ�� ���� �޼����� �������");
		System.err.println("ǥ�� ���������ġ�� ���� �޼����� �������");
		System.out.println("ǥ�� ���������ġ�� �޼����� �������");
		System.err.println("ǥ�� ���������ġ�� ���� �޼����� �������");
		System.err.println("ǥ�� ���������ġ�� ���� �޼����� �������");
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("ǥ�� �Է���ġ�� ���� �Է��� �о��");
		System.out.println("�Է��غ�����:");
		int value = System.in.read();
		System.out.println(value);
		System.out.println((char)value);
	}
}
