package example_10_20.jdbc.contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import utils.ConnectionUtil;

public class ContactUpdate {
	public static void main(String[] args) throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		
		String sql = "update tb_sample_contacts "
				+ "set "
				+ "		phone_number = ?, "
				+ "		email = ?,"
				+ "		company = ? "
				+ "where no = ? ";	
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		System.out.println("���� �Է�: ");
		int no = scan.nextInt();
		System.out.println("��ȭ��ȣ �Է�: ");
		String phoneNumber = scan.next();
		System.out.println("�̸��� �Է�: ");
		String email = scan.next();
		System.out.println("�Ҽ�ȸ�� �Է�: ");
		String company = scan.next();
		
		pstmt.setString(1, phoneNumber);
		pstmt.setString(2, email);
		pstmt.setString(3, company);
		pstmt.setInt(4, no);
		
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount + "���� ���� ���ŵǾ����ϴ�.");
		
		pstmt.close();
		connection.close();
		scan.close();
	}
}
