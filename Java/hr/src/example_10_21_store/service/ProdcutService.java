package example_10_21_store.service;
/**
 * ��ǰ���� ����� �����ϴ� ���� �������̽���.
 * @author song
 *
 */

import java.sql.SQLException;
import java.util.List;

import example_10_21_store.vo.Product;

public interface ProdcutService {
	
	/**
	 * 
	 * @return ��ǰ���� ����Ʈ
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	List<Product> getAllProducts() throws SQLException;
	
	/**
	 * ������ ��ǰ��ȣ�� ���� ��ǰ�������� ��ȯ�Ѵ�.
	 * @param productNo ��ǰ��ȣ
	 * @return ��ǰ������
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	Product getProductDetail(int productNo) throws SQLException;
	
	/**
	 * ������ ��ǰ������ ����Ѵ�.<br/>
	 * ������ �̸��� ��ǰ������ �����ϸ� �ش� ��ǰ�� ����� ������Ų��.
	 * @param product ����� ��ǰ����
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	void addNewProduct(Product product) throws SQLException;
	
	/**
	 * ������ ������ ��ǰ�� ������ �����Ѵ�.
	 * @param productNo ��ǰ��ȣ
	 * @param price ������ ��ǰ����
	 * @param discountPrice ������ ���ΰ���
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	void updateProductPrice(int productNo, int price, int discountPrice)throws SQLException;
	
	/**
	 * ������ ��ǰ��ȣ�� �ش��ϴ� ��ǰ������ �����Ѵ�.
	 * @param productNo ������ ��ǰ�� ��ȣ
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	void removeProduct(int productNo) throws SQLException;
	
	/**
	 * ������ ī�װ��� �ش��ϴ� ��ǰ������ ��ȯ�Ѵ�.
	 * @param category ��ȸ�� ��ǰ�� ī�װ�
	 * @return ������ ī�װ��� ��ǰ���� ���
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	List<Product> searchProductsByCategory(String category) throws SQLException;
	
	/**
	 * ������ Ű���尡 ��ǰ�� ���Ե� ��ǰ������ ��ȯ�Ѵ�.
	 * @param keyword �˻���
	 * @return ��ǰ���� ���
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	List<Product> searchProductsByName(String keyword) throws SQLException;
	
	/**
	 * ������ ���ݹ����� �ش��ϴ� ��ǰ������ ��ȯ�Ѵ�
	 * @param minPrice �ּҰ���
	 * @param maxPrice �ִ밡��
	 * @return ��ǰ���� ���
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	List<Product> searchProductsByPrice(int minPrice, int maxPrice) throws SQLException;
	
	/**
	 * ������ ��� ���� ���� ��ǰ������ ��ȯ�Ѵ�
	 * @param minStock �ּ� ���
	 * @return ��ǰ���� ���
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	List<Product> searchLowerStockProducts(int minStock) throws SQLException;
}
