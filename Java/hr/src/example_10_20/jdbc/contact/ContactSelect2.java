package example_10_20.jdbc.contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import utils.ConnectionUtil;

public class ContactSelect2 {
	public static void main(String[] args) throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		
		String sql = "select no, name, phone_number, email, company "
				+ "from tb_sample_contacts "
				+ "where name = ? ";
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String nam = scan.next();
		
		pstmt.setString(1, nam);
		
		ResultSet rs = pstmt.executeQuery();
		
		rs.next();
		int no = rs.getInt("no");
		String name = rs.getString("name");
		String phoneNumber = rs.getString("phone_number");
		String email = rs.getString("email");
		String company = rs.getString("company");
		System.out.println("����\t�̸�\t��ȭ��ȣ\t	�̸���\t	�Ҽ�ȸ��");
		System.out.printf("%d\t%s\t%s\t%s\t%s\n", no, name, phoneNumber, email, company);

		rs.close();
		pstmt.close();
		connection.close();
		scan.close();
	}
}
