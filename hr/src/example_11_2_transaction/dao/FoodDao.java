package example_11_2_transaction.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import example_11_2_transaction.vo.Category;
import example_11_2_transaction.vo.Food;

public class FoodDao {

	/**
	 * ������ ��ǰ��ȣ�� �ش��ϴ� ��ǰ������ ��ȯ�Ѵ�.
	 * @param foodNo ��ǰ��ȣ
	 * @param connection Ŀ�ؼ� ��ü
	 * @return ��ǰ����
	 * @throws SQLException
	 */
	public Food selectFood(int foodNo, Connection connection) throws SQLException {
		Food food = null;
		
		String sql = "select F.food_no, F.food_name, F.food_price, F.food_stock, F.food_on_sale, C.category_no, C.category_name "
				   + "from tb_sample_foods F, tb_sample_food_categories C "
				   + "where F.category_no = C.category_no "
				   + "and F.food_no = ? ";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, foodNo);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			food = new Food();
			food.setNo(rs.getInt("food_no"));
			food.setName(rs.getString("food_name"));
			food.setPrice(rs.getInt("food_price"));
			food.setStock(rs.getInt("food_stock"));
			food.setOnSale(rs.getString("food_on_sale"));
			
			Category category = new Category();
			category.setNo(rs.getInt("category_no"));
			category.setName(rs.getString("category_name"));
			food.setCategory(category);
		}
		
		rs.close();
		pstmt.close();		
		
		return food;
	}
	
	/**
	 * ����� ������ �����ϰ� �ִ� ��ǰ������ ���޹޾Ƽ� ���̺� �����Ѵ�.
	 * @param food ��ǰ����
	 * @param connection Ŀ�ؼ� ��ü
	 * @throws SQLException
	 */
	public void updateFood(Food food, Connection connection) throws SQLException {
		String sql = "update tb_sample_foods "
				+ "set "
				+ "food_name = ?, "
				+ "food_price = ?, "
				+ "food_stock = ?, "
				+ "food_on_sale = ?, "
				+ "category_no = ? "
				+ "where food_no = ? ";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, food.getName());
		pstmt.setInt(2, food.getPrice());
		pstmt.setInt(3, food.getStock());
		pstmt.setString(4, food.getOnSale());
		pstmt.setInt(5, food.getCategory().getNo());
		pstmt.setInt(6, food.getNo());
		pstmt.executeUpdate();
		
		pstmt.close();	
	}
	
	
	
	
	
	
}
