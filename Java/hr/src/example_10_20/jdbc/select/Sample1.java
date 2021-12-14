package example_10_20.jdbc.select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import utils.ConnectionUtil;

public class Sample1 {
	public static void main(String[] args) throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("### å �˻� ���α׷�");
		System.out.println("### �˻��� Ű���带 �Է��ϼ���");
		System.out.println("### Ű����: ");
		
		String keyword = scan.next();
		// 1. SQL �ۼ��ϱ�
		String sql = "select book_no, book_title, book_writer, book_publisher, book_price, book_discount_price, "
				+ "		book_stock, book_on_sale "
				+ "from tb_sample_books "
				+ "where book_title like '%' || ? || '%' " // ||�� ���ڸ� ������ �ִ� SQL�ܾ�
				+ "order by book_no desc ";
		
		// 2. Connection ��ü ȹ���ϱ�
		Connection connection = ConnectionUtil.getConnection();
		
		// 3. PreparedStatement ��ü ȹ���ϱ�
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		// 4. ?�� �� ���ε��ϱ�

		pstmt.setString(1, keyword);
		
		// 5. SQL�� RDBMS�� �����ؼ� �����Ű��, ��ȸ����� ���Ե� ResultSet��ü�� ȹ���Ѵ�.
		
		ResultSet rs = pstmt.executeQuery();
		
		// 6. ResultSet�� API�� ����ؼ� ��ȸ����� �����ؼ� ȭ�鿡 ����Ѵ�.
		
		while (rs.next()) {
			int no = rs.getInt("book_no");
			String title = rs.getString("book_title");	
			String writer = rs.getString("book_writer");
			String publisher = rs.getString("book_publisher");	
			int price = rs.getInt("book_price");
			int discountPrice = rs.getInt("book_discount_price");
			int stock = rs.getInt("book_stock");
			String onSale = rs.getString("book_on_sale");
			System.out.printf("%d %s %s %s %d %d %d %s\n", no, title, writer, publisher, price, discountPrice, stock, onSale);
		}
		// 7. ����ߴ� �ڿ��� �����Ѵ�.
		rs.next();		//close�� ȹ���� ������ �����̴�.
		rs.close();
		pstmt.close();
		connection.close();
		scan.close();
	}
}
