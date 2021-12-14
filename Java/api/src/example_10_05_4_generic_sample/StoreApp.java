package example_10_05_4_generic_sample;

import java.util.Scanner;

public class StoreApp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// ������� ���, ���� ������ ���, ��� Ƽ������ ���, Ƽ�ϻ����� ��� ����� �����ϴ� ��ü ����
		Store store = new Store();
		
		while(true) {
			boolean isLogined = store.isLogined();
			
			System.out.println("----------------------------------------------------");
			System.out.println("1.�����޴�  2.Ƽ�ϸ޴�  3.����ڸ޴�  0.����");
			System.out.println("----------------------------------------------------");
			
			System.out.print("[�޴�����]: ");
			int topLevelMenu = scan.nextInt();
			System.out.println();
			
			if (topLevelMenu == 1) {
				
				System.out.println("[���� �޴�]");
				System.out.println("----------------------------------------------------");
				if (isLogined) {
					System.out.println("1.�������  2.����������  3.�ֹ��ϱ�");
				} else {
					System.out.println("1.�������  2.����������");
				}
				System.out.println("----------------------------------------------------");

				System.out.print("[�����޴� ����]: ");
				int subLevelMenuNo = scan.nextInt();
				System.out.println();
				
				if (subLevelMenuNo == 1) {
					System.out.println("[���� ���]");
					store.displayAllBooks();
					
				} else if (subLevelMenuNo == 2) {
					System.out.println("[���� ������]");
					
					System.out.print("���� ��ȣ �Է�: ");
					int bookNo = scan.nextInt();
					
					store.displayBookDetail(bookNo);
					
				} else if (subLevelMenuNo == 3) {
					if (!isLogined) {
						System.err.println("### ���� : �α��� �� �̿밡���� ���� �Դϴ�.");
						continue;
					}
					System.out.println("[���� �ֹ��ϱ�]");
					
					System.out.println("�ֹ��� ���� ��ȣ�Է�: ");
					int bookNumber = scan.nextInt();
					System.out.println("�ֹ��� ���� �����Է�: ");
					int amount = scan.nextInt();
					
					store.orderBook(bookNumber,amount);
				}
				
				
			} else if (topLevelMenu == 2) {
				System.out.println("[Ƽ�� �޴�]");				
				System.out.println("----------------------------------------------------");
				if (isLogined) {
					System.out.println("1.Ƽ�ϸ��  2.Ÿ�ϻ�����  3.�����ϱ�");
				} else {
					System.out.println("1.Ƽ�ϸ��  2.Ÿ�ϻ�����");
				}
				System.out.println("----------------------------------------------------");
				
				System.out.print("[Ƽ�ϸ޴� ����]: ");
				int subLevelMenuNo = scan.nextInt();
				System.out.println();
				
				if (subLevelMenuNo == 1) {
					System.out.println("[Ƽ�� ���]");
					store.displayAllBooks();
					
				} else if (subLevelMenuNo == 2) {
					
					System.out.println("[Ƽ�� ������]");
					
					System.out.print("Ƽ�� ��ȣ �Է�: ");
					int ticketNo = scan.nextInt();
					
					store.displayTicketDetail(ticketNo);
					
				} else if (subLevelMenuNo == 3) {
					if(!isLogined) {
						System.err.println("### ���� : �α��� �� �̿밡���� ���� �Դϴ�.");
						continue;
					}
					System.err.println("[Ƽ�� �����ϱ�]");
					
					System.out.println("�ֹ��� Ƽ�� ��ȣ�Է�: ");
					int ticketNumber = scan.nextInt();
					System.out.println("�ֹ��� Ƽ�� �����Է�: ");
					int amount = scan.nextInt();
					
					store.orderTicket(ticketNumber,amount);
				}
				
				
				
				
					
			} else if (topLevelMenu == 3) {
				System.out.println("[����� �޴�]");
				
				System.out.println("----------------------------------------------------------");
				if (isLogined) {
					System.out.println("1.�α���  2.ȸ������ 3.�α׾ƿ� 4.Ż���ϱ� 5.�ֹ��������� 6.�ֹ�����ϱ� 7.����������");
				} else {
					System.out.println("1.�α���  2.ȸ������");
				}
				System.out.println("----------------------------------------------------------");

				System.out.print("[����ڸ޴� ����]: ");
				int subLevelMenuNo = scan.nextInt();
				System.out.println();
				
				if (subLevelMenuNo == 1) {
					System.out.println("[�α���]");
					
					System.out.print("����� ���̵��Է�: ");
					String id = scan.next();					
					System.out.print("����� ��й�ȣ�Է�: ");
					String password = scan.next();
					
					System.out.println();					
					store.login(id, password);
					
					
				} else if (subLevelMenuNo == 2) {
					System.out.println("[ȸ������]");
					
					System.out.print("����� �̸��Է�: ");
					String name = scan.next();
					System.out.print("����� ���̵��Է�: ");
					String id = scan.next();					
					System.out.print("����� ��й�ȣ�Է�: ");
					String password = scan.next();					
					System.out.println();					
					store.signUp(new User(name, id, password));

					
				} else if (subLevelMenuNo == 3) {
					if(!isLogined) {
						continue;
					}
					System.out.println("[�α׾ƿ�]");
					
					store.logout();
					
				} else if (subLevelMenuNo == 4) {
					if(!isLogined) {
						continue;
					}
					System.out.println("[Ż���ϱ�]");
					
					System.out.print("����� ���̵��Է�: ");
					String id = scan.next();					
					System.out.print("����� ��й�ȣ�Է�: ");
					String password = scan.next();	
					System.out.println();					
					store.exit(id, password);
					
				} else if (subLevelMenuNo == 5) {
					if(!isLogined) {
						continue;
					}
					System.out.println("[�ֹ���������]");
					store.displayMyOrders();
					
				} else if (subLevelMenuNo == 6) {
					if(!isLogined) {
						continue;
					}
					System.out.println("[�ֹ�����ϱ�]");
					
					System.out.println("�ֹ���ȣ �Է�: ");
					int no = scan.nextInt();
					store.cancelOrder(no);
					
				} else if (subLevelMenuNo == 7) {
					if(!isLogined) {
						continue;
					}
					System.out.println("[�� ���� ����]");
					System.out.println();					
					
					store.printMyInfo();
					
					
				}
				
			} else if (topLevelMenu == 0) {
				System.out.println("[���ø����̼� ����]");
				break;
			}
			System.out.println();
			System.out.println();
		}
		scan.close();
	}
}
