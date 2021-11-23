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

public class service {
	private CustomerDao customerDao = new CustomerDao();
	private FoodDao foodDao = new FoodDao();
	private OrderDao orderDao = new OrderDao();
	
	public void order(int customerNo, int foodNo, int amount) throws SQLException {
		// �ڵ��� ���� �κ��� Ȯ�� �ϱ� ���� ����� ����� ���� vo��ü�� toString�� ��� �����ϴ°� ����.
		// sql���� ���� developer���� �����غ��� �ڹٿ� ����Ѵ�.
		Connection connection = null;
		try {											
			connection = ConnectionUtil.getConnection(); 
			connection.setAutoCommit(false); 
			
			// 1. �ֹ��ޱ�
			int orderNo = orderDao.selectOrderNo(connection); //�ֹ���ȣ �ޱ�
			
			// 2. � �����ΰ�
			Food food = new Food();
			food = foodDao.selectFood(foodNo, connection);
			
			// 3. �ֹ� ����ϱ�
			Order order = new Order();
			
			Customer customer = new Customer();
			customer.setNo(customerNo);
			order.setCustomer(customer);
			
			order.setNo(orderNo);
			int totalPrice = amount*food.getPrice();
			order.setTotalPrice(totalPrice);
			
			orderDao.insertOrder(order, connection);
			
			// 4. �ֹ���ǰ ���
			OrderItem item = new OrderItem();
			item.setAmount(amount);
			item.setFood(food);
			item.setOrderNo(orderNo);
			
			orderDao.insertOrderItem(item, connection);
			
			// 5. �ֹ��� ���� �� ��ŭ ��� �����ϱ�
			food.setStock(food.getStock() - amount);
			foodDao.updateFood(food, connection);
			
			// 6. ���� ����Ʈ �ø���
			customer = customerDao.selectCustomer(customerNo, connection);
			customer.setPoint((int)(totalPrice*0.01) + customer.getPoint());
			customerDao.updateCustomer(customer, connection);
			
			connection.commit();
			
		} catch (SQLException e) {
			connection.rollback();
		}
	}
}
