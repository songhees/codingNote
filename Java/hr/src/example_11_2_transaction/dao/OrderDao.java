package example_11_2_transaction.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import example_11_2_transaction.vo.Order;
import example_11_2_transaction.vo.OrderItem;

public class OrderDao {

	/**
	 * �ֹ���ȣ�� ���� ���������� ��ȯ�Ѵ�.
	 * @param connection Ŀ�ؼ� ��ü
	 * @return �ֹ���ȣ
	 * @throws SQLException
	 */
	public int selectOrderNo(Connection connection) throws SQLException {
		int orderNo = 0;
		String sql = "select foodorder_seq.nextval as order_no from dual";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		rs.next();
		orderNo = rs.getInt("order_no");
		
		rs.close();
		pstmt.close();
		
		return orderNo;
	}
	
	/**
	 * �ֹ������� ���޹޾Ƽ� �����Ѵ�.
	 * @param order �ֹ�����
	 * @param connection Ŀ�ؼ� ��ü
	 * @throws SQLException
	 */
	public void insertOrder(Order order, Connection connection) throws SQLException {
		String sql = "insert into tb_sample_food_orders "
				+ "(order_no, customer_no, order_total_price) "
				+ "values "
				+ "(?, ?, ?) ";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, order.getNo());
		pstmt.setInt(2, order.getCustomer().getNo());
		pstmt.setInt(3, order.getTotalPrice());
		pstmt.executeUpdate();
		
		pstmt.close();
	}
	
	/**
	 * ������ �ֹ���ǰ������ ���̺� �����Ѵ�.
	 * @param orderItem �ֹ���ǰ����
	 * @param connection Ŀ�ؼ� ��ü
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	public void insertOrderItem(OrderItem orderItem, Connection connection) throws SQLException {
		String sql = "insert into tb_sample_food_order_items "
				+ "(order_no, food_no, food_amount) "
				+ "values "
				+ "(?, ?, ?) ";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, orderItem.getOrderNo());
		pstmt.setInt(2, orderItem.getFood().getNo());
		pstmt.setInt(3, orderItem.getAmount());
		pstmt.executeUpdate();
		
		pstmt.close();
		
	}
}
