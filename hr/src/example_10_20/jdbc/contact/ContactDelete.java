package example_10_20.jdbc.contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import utils.ConnectionUtil;

public class ContactDelete {
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		
		String sql = "delete from tb_sample_contacts "
				+ "where name = ? ";
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = scan.next();
		
		pstmt.setString(1, name);
		
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount + "���� ���� �����Ǿ����ϴ�.");
		
		pstmt.close();
		connection.close();
		
		scan.close();
	}
}
