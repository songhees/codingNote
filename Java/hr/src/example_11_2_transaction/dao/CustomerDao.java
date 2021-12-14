package example_11_2_transaction.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import example_11_2_transaction.vo.Customer;

public class CustomerDao {

	/**
	 * ������ ����ȣ�� �ش��ϴ� �������� ��ȯ�Ѵ�.
	 * @param customerNo ����ȣ
	 * @param connection �����ͺ��̽��� ����� Ŀ�ؼ� ��ü
	 * @return ������
	 * @throws SQLException
	 */
	public Customer selectCustomer(int customerNo, Connection connection) throws SQLException {
		Customer customer = null;
		
		String sql = "select customer_no, customer_name, customer_tel, customer_point, customer_in_out, customer_created_date "
				   + "from tb_sample_food_customers "
				   + "where customer_no = ?";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, customerNo);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			customer = new Customer();
			customer.setNo(rs.getInt("customer_no"));
			customer.setName(rs.getString("customer_name"));
			customer.setTel(rs.getString("customer_tel"));
			customer.setPoint(rs.getInt("customer_point"));
			customer.setInOut(rs.getString("customer_in_out"));
			customer.setCreatedDate(rs.getDate("customer_created_date"));
		}
		rs.close();
		pstmt.close();
		
		return customer;
	}
	
	/**
	 * ����� ������ �����ϰ� �ִ� �������� ���޹޾Ƽ� ���̺� �����Ѵ�.
	 * @param customer ����� ������
	 * @param connection Ŀ�ؼ� ��ü
	 * @throws SQLException
	 */
	public void updateCustomer(Customer customer, Connection connection) throws SQLException {
		String sql = "update tb_sample_food_customers "
				+ "set "
				+ "customer_name = ?, "
				+ "customer_tel = ?, "
				+ "customer_point = ?, "
				+ "customer_in_out = ? "
				+ "where customer_no = ? ";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, customer.getName());
		pstmt.setString(2, customer.getTel());
		pstmt.setInt(3, customer.getPoint());
		pstmt.setString(4, customer.getInOut());
		pstmt.setInt(5, customer.getNo());
		
		pstmt.executeUpdate();
		
		pstmt.close();
	}
	
	
	
	
	
	
}
