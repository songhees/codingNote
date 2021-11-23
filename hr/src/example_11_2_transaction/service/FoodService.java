package example_11_2_transaction.service;

import java.sql.Connection;
import java.sql.SQLException;

import example_11_2_transaction.dao.CustomerDao;
import example_11_2_transaction.dao.FoodDao;
import example_11_2_transaction.dao.OrderDao;
import example_11_2_transaction.vo.Customer;
import example_11_2_transaction.vo.Food;
import example_11_2_transaction.vo.Order;
import example_11_2_transaction.vo.OrderItem;
import utils.ConnectionUtil;

public class FoodService {
	
	private CustomerDao customerDao = new CustomerDao();
	private FoodDao foodDao = new FoodDao();
	private OrderDao orderDao = new OrderDao();
	
	public void order(int customerNo, int foodNo, int amount) {
		// �ڵ��� ���� �κ��� Ȯ�� �ϱ� ���� ����� ����� ���� vo��ü�� toString�� ��� �����ϴ°� ����.
		// sql���� ���� developer���� �����غ��� �ڹٿ� ����Ѵ�.
		Connection connection = null;
		try {																			// ���ο� Ʈ����� ����
			connection = ConnectionUtil.getConnection(); // ��ɱ׷��� �����ϱ� ���ؼ��� connection�� ���� ������ �Ѵ�.
			connection.setAutoCommit(false); // ���� Ŀ�� ��� ������ ���� Ŀ�԰� �ѹ��� �ؾ� ��
			/*
			 * �ڹٴ� �⺻������ connection.setAutoCommit(ture);�̴�. insert���� ���� commit�� �Ѵ�.
			 * ���� �κ� ������ �Ͼ. ������ �ֹ��� �� ��ǰ�� �������� �� �ʰ��ϴ� �ֹ��� ���
			 * �ڵ忡 ���� �ֹ� ������ ��������� �� �Ŀ� �ֹ���ǰ������ ������ ������ ����Ƿ� �������� ���а� �ȴ�.
			 * �� �ֹ� ������ ������ �׿� ���� � ��ǰ�� �ֹ��ߴ��� ���� ���ϴ� �ڵ��� �ϰ����� �������� �ȴ�.
			 */
			
			// 1. food_seq ���������� �ֹ���ȣ ȹ���ϱ� - select
			int orderNo = orderDao.selectOrderNo(connection);							// Ʈ����Ǿȿ��� ��ȸ�۾� ����
			
			// 2. ��ǰ��ȣ�� �ش��ϴ� ��ǰ������ ��ȸ�Ѵ�. - select
			Food food = foodDao.selectFood(foodNo, connection);							// Ʈ����Ǿȿ��� ��ȸ�۾� ����
			
			// 2. ����ȣ�� �ش��ϴ� �������� ��ȸ�Ѵ�.
			Customer customer = customerDao.selectCustomer(customerNo, connection);		// Ʈ����Ǿȿ��� ��ȸ�۾� ����
			
			// 3. Order��ü�� �����ϰ�, �ֹ�����(�ֹ���ȣ, �ֹ���, �ѱ��űݾ�)�� �����ϰ�, tb_sample_food_orders ���̺� //�����Ų��. - insert
			Order order = new Order();
			order.setNo(orderNo);								// �ֹ���ȣ ����
			order.setCustomer(customer);						// �������� ���Ե� Customer��ü ����
			order.setTotalPrice(food.getPrice()*amount);		// �ѱ��Ű��� ����
			orderDao.insertOrder(order, connection);			// �ֹ����� ���̺� ����	// Ʈ����Ǿȿ��� �����۾� ����
			
			// 4. OrderItem��ü�� �����ϰ�, �ֹ���ǰ����(�ֹ���ȣ, ��ǰ��ȣ, ���ż���)�� �����ϰ�, ���̺� //�����Ų��. - insert
			OrderItem orderItem = new OrderItem();
			orderItem.setOrderNo(orderNo);						// �ֹ���ȣ ����
			orderItem.setFood(food);							// �ֹ���ǰ��ȣ�� �����ϰ� �ִ� Food��ü ����
			orderItem.setAmount(amount);						// �ֹ����� ����

			orderDao.insertOrderItem(orderItem, connection);	// �ֹ���ǰ���� ���̺� ����	// Ʈ����Ǿȿ��� �����۾� ����
			
			// 5. �ѱ��űݾ��� 1%�� �ش��ϴ� ����Ʈ�� ����Ѵ�.
			int depositPoint = (int)(food.getPrice()*amount*0.01);
			
			// 6. ��ȸ�� �������� ����Ʈ�� �����ϰ� ���̺� //�����Ų��. - update
			customer.setPoint(depositPoint + customer.getPoint());		// ������Ʈ �� �� : ������Ʈ �� ������ ��ȸ ������Ʈ�� ���븸 �ٲ�ġ���ϰ� DB�� ����
			customerDao.updateCustomer(customer, connection);			// ����Ʈ�� ����� �������� ������Ʈ�Ѵ�.	// Ʈ����Ǿȿ��� �����۾� ����
			
			// 7. ��ǰ������ ��� ���ż�����ŭ ���ҽ�Ű��, ���̺� //�����Ų��. - update
			food.setStock(food.getStock() - amount);
			foodDao.updateFood(food, connection);				// ���ż�����ŭ ��� ����� ��ǰ������ ������Ʈ�Ѵ�.	// Ʈ����Ǿȿ��� �����۾� ����
			
			// 8. ��� �����ͺ��̽� ������ �۾��� �������� �Ϸ�Ǹ� �����ߴ� ��� �۾��� ������ ���̽��� �ݿ���Ų��.
			connection.commit();															// Ʈ����Ǿȿ��� �����ߴ� �۾��� DB�� �ݿ�
			
		} catch (SQLException e) {
			// 9. �����ͺ��̽� ������ �۾��� ������ �߻��ϸ� �����ߴ� ��� �۾��� �����ͺ��̽� �ݿ��� ����Ѵ�.
			try {
				connection.rollback();														// Ʈ����Ǿȿ��� �����ߴ� �۾��� ���� ���
																							// Ʈ����� ����
			} catch (SQLException ex) {
			
			}
			throw new RuntimeException("�����ͺ��̽� ������ �۾� ����", e);
		} finally {
			// ��������/���� �߻��� ������� ������ �����ؾ� �ϴ� �ڵ带 �ۼ��ϴ� ���̴�.
			// �ַ�, ����ߴ� ���ҽ��� ��ȯ�ϴ� �ڵ尡 ��ġ�Ѵ�.
			// �ڿ��� �ݳ��ϴ� �ڵ�
			try {
				// 10. �����ͺ��̽��� ����� Ŀ�ؼ��� �ݴ´�.
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				
			}
		}
	}
	
	
	
}
