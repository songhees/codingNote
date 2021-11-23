package example_10_21_store.service;

import java.sql.SQLException;
import java.util.List;

import example_10_21_store.dao.ProductDao;
import example_10_21_store.dao.ProductJdbcDao;
import example_10_21_store.exception.StoreException;
import example_10_21_store.vo.Product;

public class ProductServiceImpl implements ProdcutService{
	private ProductDao productDao = new ProductJdbcDao();
	
	@Override
	public List<Product> getAllProducts() throws SQLException {
		return productDao.selectAllProducts();
	}

	@Override
	public Product getProductDetail(int productNo) throws SQLException {
		Product product= productDao.selcetProductByNo(productNo);
		if (product == null) {
			// StoreException ���ܴ� ������������ ������ ���� �� ���� �߻���Ű�� ���ܴ�.
			throw new StoreException("["+productNo + "] ��ǰ��ȣ�� �ش��ϴ� ��ǰ������ �������� �ʽ��ϴ�.");
		}
		return product;
	}

	@Override
	public void addNewProduct(Product product) throws SQLException {
		// ���� ����Ϸ��� ��ǰ�� ��ǰ��� ������ ��ǰ�� �ִ��� ��ȸ�Ѵ�.
		Product savedProduct = productDao.getProductByProductName(product.getName());
		if(savedProduct != null) {
			// ���� ��ǰ�� ����� ����Ϸ��� ��ǰ�� ����� �հ踦 ����Ѵ�.
			int totalStock =savedProduct.getStock()+ product.getStock();
			// ��ǰ������ ����� �����Ѵ�.
			savedProduct.setStock(totalStock);
			// ����� ����� ��ǰ������ ���̺� �ݿ��Ѵ�.
			productDao.updateProduct(savedProduct);
		} else {
			productDao.insertProduct(product);
		}
	}
	
	@Override
	public void updateProductPrice(int productNo, int price, int discountPrice) throws SQLException {
		if (discountPrice > price) {
			throw new StoreException("���ΰ����� ���갡�ݺ��� ũ�� �����Ǿ����ϴ�.");
		}
		// ��ǰ��ȣ�� �ش��Ѵ� ��ǰ������ ��ȸ�Ѵ�.
		Product product =  this.getProductDetail(productNo);
		// ������ �׸��� ����������� �����Ѵ�.
		product.setPrice(price);
		product.setDiscountPrice(discountPrice);
		// ����� ������ �ݿ��� Product��ü�� �����ؼ� ���̺� �ݿ��ǰ� �Ѵ�.
		productDao.updateProduct(product);
	}

	@Override
	public void removeProduct(int productNo) throws SQLException {
		Product product = productDao.selcetProductByNo(productNo);
		if (product == null) {
			throw new StoreException("["+productNo+"] ��ǰ��ȣ�� �ش��ϴ� ��ǰ������ �������� �ʾ�, ������ �Ϸ���� �ʾҽ��ϴ�.");
		}
		productDao.deleteProduct(productNo);
	}

	@Override
	public List<Product> searchProductsByCategory(String category) throws SQLException {
		List<Product> products = productDao.getProductsByCategory(category);
		return products;
	}

	@Override
	public List<Product> searchProductsByName(String keyword) throws SQLException {
		List<Product> products = productDao.getProductsByName(keyword);
		return products;
	}

	@Override
	public List<Product> searchProductsByPrice(int minPrice, int maxPrice) throws SQLException {
		List<Product> products = productDao.getProductsByPrice(minPrice, maxPrice);
		return products;
	}

	@Override
	public List<Product> searchLowerStockProducts(int minStock) throws SQLException {
		List<Product> products = productDao.getProductsByStock(minStock);
		return products;
	}
}
