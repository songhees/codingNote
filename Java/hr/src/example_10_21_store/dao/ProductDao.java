package example_10_21_store.dao;

import java.sql.SQLException;
import java.util.List;

import example_10_21_store.vo.Product;

/**
 * TB_SAMPLE_PRODUCTS ���̺� ���� CRUD �۾��� ���ǵ� �������̽���.
 * @author song
 *
 */
public interface ProductDao {
	/**
	 * TB_SAMPLE_PRODUCTS ���̺��� ��� ��ǰ������ ��ȸ�ؼ� ��ȯ�Ѵ�.
	 * @return ��� ��ǰ����
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	List<Product> selectAllProducts() throws SQLException;
	
	/**
	 * ������ ��ǰ������ TB_SAMPLE_PRODUCTS ���̺� �߰��Ѵ�.
	 * @param product �� ��ǰ����
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	void insertProduct(Product product) throws SQLException;
	
	/**
	 * ������ ��ȣ�� �ش�Ǵ� ��ǰ������ TB_SAMPLE_PRODUCTS�� ��ȸ�ؼ� ��ȯ�Ѵ�.
	 * @param productNo	��ȸ�� ��ǰ�� ��ǰ��ȣ
	 * @return	��ǰ����, Ʋ�� ��ǰ��ȣ�� ��� null�� ��ȯ�ȴ�.
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	Product selcetProductByNo(int productNo) throws SQLException;
	
	/**
	 * ������ ��ǰ������ TB_SAMPLE_PRODUCTS ���̺� �ش� ������ �����Ѵ�.
	 * @param product ������ ��ǰ����
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	void updateProduct(Product product) throws SQLException;
	
	/**
	 * ������ ��ǰ��ȣ�� �ش��ϴ� ��ǰ������ TB_SAMPLE_PRODUCTS ���̺��� �����Ѵ�.
	 * @param productNo ������ ��ǰ��ȣ
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	void deleteProduct(int productNo) throws SQLException;
	
	/**
	 * ������ ��ǰ�̸��� �ش��ϴ� ��ǰ������ TB_SAMPLE_PRODUCTS ���̺��� ��ȸ�Ѵ�.
	 * @param productName ��ǰ�̸�
	 * @return ��ǰ����
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	Product getProductByProductName(String productName) throws SQLException;
	
	/**
	 * ������ Ű���尡 ��ǰ�̸��� ���Ե� ��� ��ǰ������ TB_SAMPLE_PRODUCTS ���̺��� ��ȸ�ؼ� ��ȯ�Ѵ�.
	 * @param keyword �˻��� 
	 * @return ��ǰ����
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	List<Product> getProductsByName(String keyword) throws SQLException;
	
	/**
	 * ������ ī�װ��� ���ϴ� ��� ��ǰ������ TB_SAMPLE_PRODUCTS ���̺��� ��ȸ�ؼ� ��ȯ�Ѵ�.
	 * @param category ī�װ�
	 * @return ��ǰ���� ���
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	List<Product> getProductsByCategory(String category) throws SQLException;
	
	/**
	 * ������ ���ݹ����� ���ϴ� ��� ��ǰ������ TB_SAMPLE_PRODUCTS ���̺��� ��ȸ�ؼ� ��ȯ�Ѵ�.
	 * @param minPrice �ּҰ��� 
	 * @param maxPrice �ִ밡��
	 * @return ��ǰ���� ���
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	List<Product> getProductsByPrice(int minPrice, int maxPrice) throws SQLException;
	
	/**
	 * ������ ������� ���� �����ִ� ��� ��ǰ������ TB_SAMPLE_PRODUCTS ���̺��� ��ȸ�ؼ� ��ȯ�Ѵ�.
	 * @param stock �ּ� ���
	 * @return ��ǰ���� ���
	 * @throws SQLException DB Access ������ ���ܰ� �߻��Ѵ�.
	 */
	List<Product> getProductsByStock(int stock) throws SQLException;
	
	
	
	
	
}
