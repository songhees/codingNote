package example_10_20.jdbc.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionUtil;

public class Sample2 {
	public static void main(String[] args) throws SQLException {
		// 1. SQL �����ϱ�
		// Query�� ���� ��ĭ�� ����ش�.
		String sql = "insert into tb_sample_books "
				+ "(book_no, book_title, book_writer, book_publicsher, book_price, book_discount_price) "
				+ "values "
				+ "(?, ?, ?, ?, ?, ?) ";
		
		// 2. RDBMS�� ������ ����ϴ� Connection ��ü ȹ���ϱ�
		Connection connection = ConnectionUtil.getConnection();
		
		// 3. SQL�� Parameter�� �����ͺ��̽� ����/�����Ű�� PreparedStatement��ü ȹ���ϱ�
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		// 4. ?�� �Ķ���Ͱ� ���ε��ϱ�
		pstmt.setInt(1, 10007);
		pstmt.setString(2, "������ ����");
		pstmt.setString(3, "������");
		pstmt.setString(4, "â��");
		pstmt.setInt(5, 16000);
		pstmt.setInt(6, 14000);
		
		// 5. SQL ���� �� ������ �ޱ�
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount + "���� ���� �߰��Ǿ����ϴ�.");
		
		// 6. ����ߴ� �ڿ� ������Ű��
		pstmt.close();
		connection.close();
	}
}
