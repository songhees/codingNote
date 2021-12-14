package example_10_21_store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import example_10_21_store.vo.Product;
import static utils.ConnectionUtil.getConnection;

public class ProductJdbcDao implements ProductDao {

	@Override
	public List<Product> selectAllProducts() throws SQLException {
		List<Product> products = new ArrayList<>();
		String sql = "select product_no, product_price, product_discount_price, product_name "
				+ "from tb_sample_products "
				+ "order by product_no desc ";

		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			// Product��ü�� �����Ѵ�.
			// ResultSet���� ���� Ŀ���� ����Ű�� ���� ���� ��ȸ�ؼ� Product��ü�� �ִ´�.
			Product product = new Product();
			product.setNo(rs.getInt("product_no"));
			product.setPrice(rs.getInt("product_price"));
			product.setDiscountPrice(rs.getInt("product_discount_price"));
			product.setName(rs.getString("product_name"));
			
			// ��ǰ������ ��� Product��ü�� List��ü�� ����
			products.add(product);
		}

		rs.close();
		pstmt.close();
		connection.close();

		return products;
		//ctrl A + ctrl I �鿩����
	}

	@Override
	public void insertProduct(Product product) throws SQLException {
		String sql = "insert into tb_sample_products "
				+ "(product_no, product_category, product_name, product_maker, product_price, product_discount_price, product_stock ) "
				+ "values "
				+ "(product_seq.nextval, ?, ?, ?, ?, ?, ? ) ";
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		pstmt.setString(1, product.getCategory());
		pstmt.setString(2, product.getName());
		pstmt.setString(3, product.getMaker());
		pstmt.setInt(4, product.getPrice());
		pstmt.setInt(5, product.getDiscountPrice());
		pstmt.setInt(6, product.getStock());
		
		pstmt.executeUpdate(); //�� �ؾ� ������Ʈ �ȴ�.
		
		pstmt.close();
		connection.close();
	}

	@Override
	public Product selcetProductByNo(int productNo) throws SQLException {
		// �Ѱ��� ��ȸ�Ǵ� �������� ����
		// �������� ��ȯ�Ǵ� ��� list��ü�� �Ѱǵ� ���ٰ� �ؼ� null�� ��ȯ���� �ʴ´�. ����ִ� ���̴�. 
		// �Ѱ��� ��ȸ�ϴ� ����̰�, ���� ���  null�� ��ȯ�ϱ�� ��� �Ѱ��̴�. ������ new Product()�� ���� �ʴ´�.
		// ������ �����ϰ�
		Product product = null;
		String sql = "select product_no, product_category, product_name, product_maker, "
				+ "product_price, product_discount_price, product_stock, "
				+ "product_on_sale, product_created_date "
				+ "from tb_sample_products "
				+ "where product_no = ? ";
		
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, productNo);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			product = rowToProduct(rs);
		}
		rs.close();
		pstmt.close();
		connection.close();
		
		return product;
	}

	@Override
	public void updateProduct(Product product) throws SQLException {
		String sql = "update tb_sample_products "
				+ "set "
				+ " product_category = ?, "
				+ " product_name = ?, "
				+ " product_maker = ?, "
				+ " product_price= ?, "
				+ " product_discount_price = ?, "
				+ " product_stock = ?, "
				+ " product_on_sale = ? "
				+ "where product_no = ? ";
		
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		pstmt.setString(1, product.getCategory());
		pstmt.setString(2, product.getName());
		pstmt.setString(3, product.getMaker());
		pstmt.setInt(4, product.getPrice());
		pstmt.setInt(5, product.getDiscountPrice());
		pstmt.setInt(6, product.getStock());
		pstmt.setString(7, product.getOnSale());
		pstmt.setInt(8, product.getNo());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}

	@Override
	public void deleteProduct(int productNo) throws SQLException {
		String sql = "delete from tb_sample_products "
				+ "where product_no = ? ";
		
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);

		pstmt.setInt(1, productNo);
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}

	@Override
	public Product getProductByProductName(String productName) throws SQLException {
		Product product = null;
		String sql = "select product_no, product_category, product_name, product_maker, "
		+ "product_price, product_discount_price, product_stock, "
		+ "product_on_sale, product_created_date "
		+ "from tb_sample_products "
		+ "where product_name = ? ";
		
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);

		pstmt.setString(1, productName);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			product = rowToProduct(rs);
		}
		rs.close();
		pstmt.close();
		connection.close();
		return product;
	}


	@Override
	public List<Product> getProductsByName(String keyword) throws SQLException {
		List<Product> products = new ArrayList<>();
		String sql = "select product_no, product_category, product_name, product_maker, "
				+ "product_price, product_discount_price, product_stock, "
				+ "product_on_sale, product_created_date "
				+ "from tb_sample_products "
				+ "where product_name like '%' || ? || '%' ";
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);

		pstmt.setString(1, keyword);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			// ���� ������ ���� ��ü�� �����Ѵ�.
			Product product = rowToProduct(rs);
			products.add(product);
		}
		rs.close();
		pstmt.close();
		connection.close();
		
		return products;
	}
	
	// ���ϳ�

	@Override
	public List<Product> getProductsByCategory(String category) throws SQLException {
		List<Product> products = new ArrayList<>();
		String sql = "select product_no, product_category, product_name, product_maker, "
				+ "product_price, product_discount_price, product_stock, "
				+ "product_on_sale, product_created_date "
				+ "from tb_sample_products "
				+ "where product_category = ? ";
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);

		pstmt.setString(1, category);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			Product product = rowToProduct(rs);
			products.add(product);
		}
		rs.close();
		pstmt.close();
		connection.close();
		
		return products;
	}

	@Override
	public List<Product> getProductsByPrice(int minPrice, int maxPrice) throws SQLException {
		List<Product> products = new ArrayList<>();
		String sql = "select product_no, product_category, product_name, product_maker, "
				+ "product_price, product_discount_price, product_stock, "
				+ "product_on_sale, product_created_date "
				+ "from tb_sample_products "
				+ "where product_price between ? and ? ";
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);

		pstmt.setInt(1, minPrice);
		pstmt.setInt(2, maxPrice);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			Product product = rowToProduct(rs);
			products.add(product);
		}
		rs.close();
		pstmt.close();
		connection.close();
		
		return products;
	}

	@Override
	public List<Product> getProductsByStock(int stock) throws SQLException {
		List<Product> products = new ArrayList<>();
		String sql = "select product_no, product_category, product_name, product_maker, "
				+ "product_price, product_discount_price, product_stock, "
				+ "product_on_sale, product_created_date "
				+ "from tb_sample_products "
				+ "where product_stock < ? ";
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);

		pstmt.setInt(1, stock);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			Product product = rowToProduct(rs);
			products.add(product);
		}
		rs.close();
		pstmt.close();
		connection.close();
		
		return products;
	}

	private Product rowToProduct(ResultSet rs) throws SQLException {
		Product product;
		product = new Product();
		product.setNo(rs.getInt("product_no"));
		product.setCategory(rs.getString("product_category"));
		product.setName(rs.getString("product_name"));
		product.setMaker(rs.getString("product_maker"));
		product.setPrice(rs.getInt("product_price"));
		product.setDiscountPrice(rs.getInt("product_discount_price"));
		product.setStock(rs.getInt("product_stock"));
		product.setOnSale(rs.getString("product_on_sale"));
		product.setCreatedDate(rs.getDate("product_created_date"));
		return product;
	}
}