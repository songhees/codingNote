package example_10_20.jdbc.delate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionUtil;

public class Sample1 {
	public static void main(String[] args) throws SQLException {
		
		// 1. SQL ���� �ۼ��ϱ�
		String sql = "delete from tb_sample_books "
				+ "where book_no = ? ";
		
		// 2. Connection ȹ���ϱ�
		Connection connection = ConnectionUtil.getConnection();
		
		// 3. PreparedStatement ȹ���ϱ�
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		// 4. ?�� �� ���ε��ϱ�
		pstmt.setInt(1, 10007);
		
		// 5. SQL ���� �� ������ �ޱ�
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount + "���� ���� �����Ǿ����ϴ�.");
		
		// 6. �ڿ� ����
		pstmt.close();
		connection.close();
	}
}
