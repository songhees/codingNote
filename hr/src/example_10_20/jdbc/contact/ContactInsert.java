package example_10_20.jdbc.contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import utils.ConnectionUtil;

public class ContactInsert {
	public static void main(String[] args) throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int no = scan.nextInt();
		System.out.print("�̸� �Է�: ");
		String name = scan.next();
		System.out.print("��ȭ��ȣ �Է�: ");
		String phoneNumber = scan.next();
		System.out.print("�̸��� �Է�: ");
		String email = scan.next();
		System.out.print("�Ҽ�ȸ�� �Է�: ");
		String company = scan.next();
		
		String sql = "insert into tb_sample_contacts "
				+ "(no, name, phone_number, email, company) "
				+ "values "
				+ "(?, ?, ?, ?, ? ) ";
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);

		
		pstmt.setInt(1, no);
		pstmt.setString(2, name);
		pstmt.setString(3, phoneNumber);
		pstmt.setString(4, email);
		pstmt.setString(5, company);
		
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount + "���� ���� �߰��Ǿ����ϴ�.");
		
		pstmt.close();
		connection.close();
		scan.close();
	}
}
