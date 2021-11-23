package example_10_21_store.app;

import static utils.KeyboardUtil.*; //static import. ������ Ŭ������ ��� static �޼ҵ带 import��Ų��.
import java.sql.SQLException;
import java.util.List;

import example_10_21_store.exception.StoreException;
import example_10_21_store.service.ProdcutService;
import example_10_21_store.service.ProductServiceImpl;
import example_10_21_store.vo.Product;
//import static utils.ConnectionUtil.getConnection; ������ getConnection�� import��Ų���̴�.

public class StoreApp {
	
	// ��ǰ���� ���������� ������ ProductService�� ������ü(ProductServiceImpl��ü)�� �����Ѵ�.
	private ProdcutService service = new ProductServiceImpl();
	// ������ interfaceŸ���� ���̾�� �Ѵ�. 
	
	public void displayMenu() {
		try {
			System.out.println("### ��ǰ ���� ���α׷� ###");
			System.out.println("==============================================================");
			System.out.println("1.��ü��ȸ 2.������ 3.�˻� 4.�űԵ�� 5.���� 6.���� 0.����");
			System.out.println("==============================================================");
			
			System.out.print("�޴� ����: ");
			int menuNo = readInt();
			
			if (menuNo == 1) {
				��ü��ȸ();
			} else if (menuNo == 2) {
				����ȸ();
			} else if (menuNo == 3) {
				�˻�();
			} else if (menuNo == 4) {
				�űԵ��();
			} else if (menuNo == 5) {
				��������();
			} else if (menuNo == 6) {
				����();
			} else if (menuNo == 0) {
				����();
			}
			
		} catch (SQLException e) {
			System.out.println("### [�����ͺ��̽� ���� �߻�] " + e.getMessage());
			e.printStackTrace();
		} catch (StoreException e) {
			System.out.println("### [�������� ���� �߻�]" + e.getMessage());
			
		}
		System.out.println();
		
		displayMenu();
		
		
	}
	private void ��ü��ȸ() throws SQLException {
		System.out.println("[��ǰ ���� ��ü ��ȸ]");
		System.out.println("### ��ü ��ǰ ����� ǥ���մϴ�.");
		
		// ���������� ������ ProductService ������ü�� getAllProducts()�� ������� ��ǰ������ ������ ����� List<Product>�� ȹ���Ѵ�.
		List<Product> productList = service.getAllProducts();
		
		// List��ü�� ����ִ��� Ȯ���ؼ� ��ǰ����Ʈ�� ǥ���ϰų� �ȳ� �޼����� ǥ���Ѵ�.
		if (!productList.isEmpty()) {
			System.out.println("### ��ǰ ����Ʈ");
			System.out.println("--------------------------------------------------------------");
			System.out.println("��ȣ\t����\t���ΰ���\t��ǰ��");
			System.out.println("--------------------------------------------------------------");
			for(Product product:productList) {
				System.out.print(product.getNo() + "\t");
				System.out.print(product.getPrice() + "\t");
				System.out.print(product.getDiscountPrice() + "\t");
				System.out.println(product.getName());
			}
			System.out.println("--------------------------------------------------------------");
			
			
		} else {
			System.out.println("### [�ȳ�] ��ϵ� ��ǰ������ �������� �ʽ��ϴ�.");
		}
	}
	
	private void ����ȸ() throws SQLException {
		System.out.println("[��ǰ �� ����]");
		System.out.println("### �Է��� ��ǰ��ȣ�� �ش��ϴ� ��ǰ�� �������� ǥ���մϴ�.");
		
		System.out.print("��ǰ��ȣ �Է�: ");
		Product product= service.getProductDetail(readInt());
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("��ǰ��ȣ: " + product.getNo());
		System.out.println("ī�װ�: " + product.getCategory());
		System.out.println("��ǰ�̸�: " + product.getName());
		System.out.println("����ȸ��: " + product.getMaker());
		System.out.println("���󰡰�: " + product.getPrice());
		System.out.println("���ΰ���: " + product.getDiscountPrice());
		System.out.println("��ǰ���: " + product.getStock());
		System.out.println("�ǸŻ���: " + product.getOnSale());
		System.out.println("�������: " + product.getCreatedDate());
		System.out.println("--------------------------------------------------------------");
	}
	
	private void �˻�() throws SQLException {
		System.out.println("[��ǰ ���� �˻�]");
		while (true) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.ī�װ� 2.��ǰ�� 3.���� 4.��� 0.����");
			System.out.println("--------------------------------------------------------------");
			
			System.out.print("�˻� �޴� ����: ");
			int menuNo = readInt();
			
			if (menuNo == 1) {
				System.out.println("### ��ǰ ī�װ��� �˻�");
				System.out.print("��ǰ ī�װ� �Է�: ");
				String category = readString();
				printProduct(service.searchProductsByCategory(category));
				
			} else if (menuNo == 2) {
				System.out.println("### ��ǰ�� �˻�");
				System.out.print("�˻� Ű���� �Է�: ");
				String keyword = readString();
				printProduct(service.searchProductsByName(keyword));
			
			} else if (menuNo == 3) {
				System.out.println("### ���ݺ� �˻�");
				System.out.print("�ּҰ��� �Է�: ");
				int minPrice = readInt();
				System.out.print("�ִ밡�� �Է�: ");
				int maxPrice = readInt();
				printProduct(service.searchProductsByPrice(minPrice, maxPrice));
			
			} else if (menuNo == 4) {
				System.out.println("### ��� ���� �˻�");
				System.out.print("���� ��� �Է�: ");
				int stock = readInt();
				printProduct(service.searchLowerStockProducts(stock));
			
			} else if (menuNo == 0) {
				break;
			}
			System.out.println();
		}
		
	}
	
	private void printProduct(List<Product> productList) {
		if (productList.isEmpty()) {
			System.out.println("### [�ȳ�] �˻������ �������� �ʽ��ϴ�.");
			return;
		}
		System.out.println("### �˻� ��ǰ ����Ʈ");
		System.out.println("--------------------------------------------------------------");
		System.out.println("��ȣ\t����\t���ΰ���\t���\t��ǰ��");
		System.out.println("--------------------------------------------------------------");
		for(Product product:productList) {
			System.out.print(product.getNo() + "\t");
			System.out.print(product.getPrice() + "\t");
			System.out.print(product.getDiscountPrice() + "\t");
			System.out.print(product.getStock() + "\t");
			System.out.println(product.getName());
		}	
		System.out.println("--------------------------------------------------------------");
		System.out.println();
	}
	
	private void �űԵ��() throws SQLException {
		System.out.println("[�ű� ��ǰ ���]");
		System.out.println("### �Է��� ��ǰ������ ����մϴ�.");

		System.out.println("### ī�װ�, ��ǰ�̸�, ����ȸ��, ����, ���ΰ���, �԰������ �Է����ּ���.");
		Product product = new Product();
		
		System.out.print("��ǰ ī�װ� �Է�: ");
		product.setCategory(readString());
		System.out.print("��ǰ    �̸� �Է�: ");
		product.setName(readString());
		System.out.print("��ǰ ����ȸ�� �Է�: ");
		product.setMaker(readString());
		System.out.print("��ǰ ���󰡰� �Է�: ");
		product.setPrice(readInt());
		System.out.print("��ǰ ���ΰ��� �Է�: ");
		product.setDiscountPrice(readInt());
		System.out.print("��ǰ �԰���� �Է�: ");
		product.setStock(readInt());
		
		service.addNewProduct(product);
		System.out.println("### [�ȳ�] ��ǰ����� �Ϸ�Ǿ����ϴ�.");
	}
	
	private void ��������() throws SQLException {
		System.out.println("[��ǰ ���� ����]");
		System.out.println("### �Է��� ������ ��ǰ������ �����մϴ�.");
		System.out.println("### ������ ��ǰ��  ��ǰ��ȣ, ����, ���ΰ����� �Է��ϼ���.");
		
		System.out.print("��ǰ��ȣ �Է�: ");
		int no = readInt();
		System.out.print("��ǰ���� �Է�: ");
		int price = readInt();
		System.out.print("��ǰ���ΰ��� �Է�: ");
		int discountPrice = readInt();
		
		service.updateProductPrice(no, price, discountPrice);
		System.out.println("### [�ȳ�] ��ǰ ���� ������ �Ϸ�Ǿ����ϴ�.");
	}

	private void ����() throws SQLException {
		System.out.println("[��ǰ ���� ����]");
		System.out.println("### �Է��� ��ǰ��ȣ�� �ش��ϴ� ��ǰ������ �����մϴ�.");
		
		System.out.print("��ǰ��ȣ �Է�: ");
		service.removeProduct(readInt());
		System.out.println("### [�ȳ�] ��ǰ ������ �����Ǿ����ϴ�.");
	}
	
	private void ����() throws SQLException {
		System.out.println("[���α׷� ����]");
		System.out.println("### ���α׷��� �����մϴ�.");
		
		close();				//keyboardUtil�� close() �޼ҵ� ���� : ����°��� ���ҽ� �ݱ�
		System.exit(0);			// ���α׷��� �����Ų��. �������� ������ ������ ���� �����.
	}

	
	public static void main(String[] args) {
		new StoreApp().displayMenu();
	}
}
