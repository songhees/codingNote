package example_10_05_4_generic_sample;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Store {
	
	//private Database<Book> books = new Database<>(Book[].class);
	//private Database<Ticket> tickets = new Database<>(Ticket[].class);
	private Set<Book> books = new HashSet<>();
	private Set<Ticket> tickets = new HashSet<>();
	private Set<User> users = new HashSet<>();
	private List<Order> orders = new ArrayList<>();
	//private Database<User> users = new Database<>();
	//private Database<Order> orderDatabase = new Database<>();
	
	// �ֹ���ȣ�� �����ϴ� ��ü�� �����Ѵ�.
	// sequence.getAndIncrement(); �޼ҵ带 �����ϸ� 10000������ ������� ��ȣ�� �����Ѵ�.
	private AtomicInteger sequence = new AtomicInteger(10000);
	
	// loginUsers�� �α��ΰ����� ����� ����� ������ ����Ǵ� Map��ü��.
	// loginUsers Map��ü���� �α����� ����� ���̵�(String)�� �� ����� ����(User)�� ����ȴ�.
	// �α��ε� ������� ������ �����ϴ� ����
	private User loginUsers;
	
	public Store() {
		books.add(new Book(101, "�̰��� �ڹٴ�", "�ſ��", "��ǻ��", 35000));
		books.add(new Book(102, "�ڹ��� ������", "���ü�", "��ǻ��", 30000));
		books.add(new Book(103, "��Ŀ�����ͺ�ī", "��Ŀ��", "�ܱ���", 28000));
		books.add(new Book(104, "����� �Թ���", "ȫ�浿", "��ǻ��", 25000));
		books.add(new Book(105, "�ڹ��ڵ� ���ͺ�", "��â��", "��ǻ��", 38000));
		
		tickets.add(new Ticket(201, "����� ����", "2021-10-15", 66000));
		tickets.add(new Ticket(202, "�������� ����", "2021-10-17", 55000));
		tickets.add(new Ticket(203, "����޺� ����", "2021-10-25", 44000));
		tickets.add(new Ticket(204, "��ҳװ��� ����", "2021-10-28", 66000));
		tickets.add(new Ticket(205, "��������Ź�� ����", "2021-10-31", 44000));
		
		users.add(new User("ȫ�浿", "hong", "zxcv1234"));
		users.add(new User("������", "yousin", "zxcv1234"));
		users.add(new User("������", "kang", "zxcv1234"));
		users.add(new User("�̼���", "sunshin", "zxcv1234"));
		
		orders.add(new Order(sequence.getAndIncrement(), "hong", "����", 101, 1, "����Ϸ�"));
		orders.add(new Order(sequence.getAndIncrement(), "hong", "����", 103, 2, "����Ϸ�"));
		orders.add(new Order(sequence.getAndIncrement(), "youshin", "Ƽ��", 201, 2, "����Ϸ�"));
		orders.add(new Order(sequence.getAndIncrement(), "kang", "����", 104, 2, "����Ϸ�"));
		orders.add(new Order(sequence.getAndIncrement(), "kang", "Ƽ��", 202, 4, "����Ϸ�"));
	}
	
	// ��� å ������ ����ϴ� ���
	public void displayAllBooks() {
		for (Book book : books) {
			System.out.println("��ȣ " + book.getNo());
			System.out.println("�̸� " + book.getName());
			System.out.println("�۰� " + book.getWriter());
			System.out.println("�帣 " + book.getGenre());
			System.out.println("���� " + book.getPrice());
			System.out.println("��� " + book.getStock());
			System.out.println();
		}
	}

	// å������ å�� �������� ����ϴ� ���
	public void displayBookDetail(int bookNo) {
		Book foundBook = null;
		for(Book book : books) {
			if (book.getNo() == bookNo) {
				foundBook = book;
				break;
			}
		}
		if (foundBook == null) {
			System.out.println("### ���� : å������ ã�� �� �����ϴ�.");
			return;
		}
		System.out.println("��ȣ " + foundBook.getNo());
		System.out.println("�̸� " + foundBook.getName());
		System.out.println("�۰� " + foundBook.getWriter());
		System.out.println("�帣 " + foundBook.getGenre());
		System.out.println("���� " + foundBook.getPrice());
		System.out.println("��� " + foundBook.getStock());
		System.out.println();
	}
	
	// å �����ϱ�
	public void orderBook(int bookNumber,int amount) {
		Book foundBook = null;
		for(Book book : books) {
			if (book.getNo()==bookNumber) {
				foundBook = book;
			}
		}
		if (foundBook == null) {
			System.err.println("�������� �ʴ� å ��ȣ�Դϴ�.");
			return;
		}
		if (foundBook.getStock()==0) {
			System.err.println("��� �����ϴ�.");
			return;
		}
		
		Order order = new Order();
		order.setNo(sequence.getAndIncrement());
		order.setUserId(loginUsers.getUserId());
		order.setProductType("����");
		order.setProductNo(bookNumber);
		order.setOrderDate(new Date());
		order.setStatus("����Ϸ�");
		order.setAmount(amount);
		
		orders.add(order);
		foundBook.setStock(foundBook.getStock()-1);
		loginUsers.setPoint(loginUsers.getPoint() + foundBook.getPrice()/100);
	}
	
	
	// ��� Ƽ�������� ����ϴ� ���
	public void displayAllTickets() {
		for (Ticket ticket : tickets) {
			System.out.println("��ȣ: " + ticket.getNo());
			System.out.println("�̸�: " + ticket.getName());
			System.out.println("����: " + ticket.getPrice());
			System.out.println("�����¼�: " + ticket.getStock());
			System.out.println();
		}
	}

	// Ƽ�� �������� ����ϴ� ���
	public void displayTicketDetail(int ticketNo) {
		
		Ticket foundTicket = null;
		for (Ticket ticket : tickets) {
			if (ticket.getNo() == ticketNo) {
				foundTicket = ticket;
				break;
			}
		}
		if (foundTicket == null) {
			System.err.println("### ���� : Ƽ�������� �������� �ʽ��ϴ�.");
			return;
		}
		System.out.println("��ȣ " + foundTicket.getNo());
		System.out.println("�̸� " + foundTicket.getName());
		System.out.println("���� " + foundTicket.getPrice());
		System.out.println("��� " + foundTicket.getStock());
		System.out.println();
	}
	
	// Ƽ�� �����ϱ�
	public void orderTicket(int ticketNumber,int amount) {
		Ticket foundTicket = null;
		for(Ticket ticket : tickets) {
			if (ticket.getNo() == ticketNumber) {
				foundTicket = ticket;
			}
		}
		if (foundTicket == null) {
			System.err.println("�������� �ʴ� Ƽ�� ��ȣ�Դϴ�.");
			return;
		}
		if (foundTicket.getStock()==0) {
			System.err.println("��� �����ϴ�.");
			return;
		}
		
		Order order = new Order();
		order.setNo(sequence.getAndIncrement());
		order.setUserId(loginUsers.getUserId());
		order.setProductType("Ƽ��");
		order.setProductNo(ticketNumber);
		order.setOrderDate(new Date());
		order.setStatus("����Ϸ�");
		order.setAmount(amount);
		
		orders.add(order);
		foundTicket.setStock(foundTicket.getStock()-1);
		loginUsers.setPoint(loginUsers.getPoint() + foundTicket.getPrice()/100);
	}
	
	
	
	// ȸ�� ���� ���
	// ���̵� ������ ����ڴ� ���Ե� �� ����.
	public void signUp(User user) {
		boolean isSuccess = users.add(user);
		if (isSuccess) {
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.err.println("### ���� : ������ ���̵� ���� ����ڰ� �̹� �����մϴ�.");
		}
	}
	
	// ȸ�� Ż�� ���
	// HashSet���� ����������� �����Ѵ�.
	public void exit(String id, String password) {
		User savedUser = this.findUserById(id);
		if (savedUser == null) {
			System.err.println("### ���� : ����������� ã�� �� �����ϴ�.");
			return;
		}
		if (!savedUser.getPassword().equals(password)) {
			System.err.println("### ���� : ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			return;
		}
		
		users.remove(savedUser);
		// Ż�������� �α׾ƿ�
		logout();
		System.out.println("### ����� ������ �����Ǿ����ϴ�.");
		// �̹� hash�� equals�� �������Ͽ����Ƿ� remove�� �ȴ�.
		
//		Iterator<User> iter = users.iterator();
//		while(iter.hasNext()) {
//			User data = iter.next();
//			if (data == savedUser) {
//				iter.remove();
//			}
//		}
		
//		Iterator<User> iter = users.iterator();
//		while(iter.hasNext()) {
//			User data = iter.next();
//			if (data.getUserId().equals(id) && data.getPassword().equals(password)) {
//				iter.remove();
//				System.out.println("ȸ��Ż�� �Ϸ�Ǿ����ϴ�.");
//				return;
//			}
//		}
//		System.out.println("�����ʴ� ȸ�������Դϴ�.");
	}
	
	
	// �α��� ���
	public void login(String id, String password) {
		User savedUser = findUserById(id);
		if (savedUser == null) {
			System.err.println("### ���� : ����������� ã�� �� �����ϴ�.");
			return;
		}
		if (!savedUser.getPassword().equals(password)) {
			System.err.println("### ���� : ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			return;
		}
		loginUsers = savedUser;
		System.out.println("### �α����� �Ϸ�Ǿ����ϴ�.");
	}
	
	// �α׾ƿ� ���
	public void logout() {
		loginUsers = null;
		System.out.println("### �α׾ƿ��� �Ϸ�Ǿ����ϴ�.");
	}
	
	// ����������
	public void printMyInfo() {
		if (loginUsers==null) {
			System.err.println("### ����: �α����� �Ͻʽÿ�.");
			return;
		}
		System.out.println("���̵�\t�̸�\t�ܿ�����Ʈ");
		System.out.print(loginUsers.getUserId() + "\t");
		System.out.print(loginUsers.getUsername() + "\t");
		System.out.print(loginUsers.getPoint() + "\t");
	}
	
	// �ֹ��������� �޼ҵ�
	public void displayMyOrders() {
		if (!isLogined()) {
			System.out.println("### ����: �α����� �Ͻʽÿ�.");
			return;
		}
		Order findOrder = null;
		for(Order order : orders) {
			if (order.getUserId().equals(loginUsers.getUserId())) {
				findOrder = order;
				System.out.println("�ֹ���ȣ: " + findOrder.getNo());
				System.out.println("�ֹ��ھ��̵�: " + findOrder.getUserId());
				System.out.println("�ֹ���ǰ: " + findOrder.getProductType());
				System.out.println("��ǰ��ȣ: " + findOrder.getProductNo());
				System.out.println("����: " + findOrder.getAmount());
				System.out.println("�ֹ�����: " + findOrder.getStatus());
				System.out.println("�ֹ�����: " + findOrder.getOrderDate());
				System.out.println("�ֹ��������: " + findOrder.getCancelDate());
				System.out.println();
			}
		}
		if(findOrder==null) {
			System.out.println("�ֹ������� �������� �ʽ��ϴ�.");
			return;
		}
	}
	
	
	// �ֹ� ��� �޼ҵ�
	public void cancelOrder(int no) {
		if (!isLogined()) {
			System.out.println("### ����: �α����� �Ͻʽÿ�.");
			return;
		}
		Order findOrder = null;
		for (Order order : orders) {
			if(order.getNo()==no) {
				findOrder = order;
			}
		}
		if (findOrder==null) {
			System.err.println("����: �ֹ� ������ �������� �ʽ��ϴ�.");
			return;
		}
		
		if (!findOrder.getUserId().equals(loginUsers.getUserId())) {
			System.err.println("### ����: ���� ���̵� �ƴմϴ�.");
			return;
		}
		if ("�ֹ����".equals(findOrder.getStatus())) {
			System.out.println("�̹� ��ҵ� �ֹ��Դϴ�.");
		}
		
		findOrder.setStatus("�ֹ����");
		findOrder.setCancelDate(new Date());

		Product findProduct = null;
		for(Book book : books) {
			if(book.getNo()==findOrder.getProductNo()) {
				findProduct = book;
			}
		}
		for(Ticket ticket : tickets) {
			if(ticket.getNo()==findOrder.getProductNo()) {
				findProduct = ticket;
			}
		}
		
		int point = (findProduct.getPrice()*findOrder.getAmount())/100;
		User user = findUserById(findOrder.getUserId());
		user.setPoint(user.getPoint()-point);
		findProduct.setStock(findProduct.getStock()+1);
		
		orders.remove(findOrder);
		System.out.println("�ֹ��� ��ҵǾ����ϴ�.");
		
	}
	
	
	//�α��� ���θ� ��ȯ�ϴ� �޼ҵ�
	public boolean isLogined() {
		return loginUsers != null;
	}
	
	
	private User findUserById(String userId) {
		for (User user : users) {
			if (user.getUserId().equals(userId)) {
				return user;
			}
		}
		return null;
	}
	
}
