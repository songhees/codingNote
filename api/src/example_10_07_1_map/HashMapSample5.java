package example_10_07_1_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSample5 {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("�Ҽ�", "���ѻ꼺"));
		books.add(new Book("�Ҽ�", "Į�� �뷡"));
		books.add(new Book("��ǻ��", "�̰��� �ڹٴ�"));
		books.add(new Book("�ܱ���", "���� ��ī"));
		books.add(new Book("�Ҽ�", "������ ����"));
		books.add(new Book("��ǻ��", "�ڹ��� ����"));
		books.add(new Book("�ܱ���", "���� ���⹮��"));
		books.add(new Book("��ǻ��", "������ �ǹ�"));
		books.add(new Book("��ǻ��", "�ӽŷ��� ���̵�"));
		books.add(new Book("���", "��ӵ��� �Ǽ� ����"));
		books.add(new Book("���輭", "2022 ����ó��"));
		books.add(new Book("���б���", "��������"));
		books.add(new Book("���б���", "���ڱ���"));
		books.add(new Book("�ι�", "����ö���� ����"));
		books.add(new Book("�ι�", "�ѱ� �����빮��"));
		
		// ������ �帣���� �����ؼ� �����ϴ� Map��ü �����ϱ�
		Map<String, List<Book>> bookMap = new HashMap<>();
		
		for (Book book : books) {
			String genre = book.genre;
			if(bookMap.containsKey(genre)) {
				List<Book> list = bookMap.get(genre);
				list.add(book);
			} else {
				List<Book> list = new ArrayList<>();
				list.add(book);
				bookMap.put(genre, list);
			}
		}
		System.out.println("### ���� ��� ������ ����غ���");
		System.out.println(bookMap);
		
		// ��ǻ�� ������ ����ϱ�
		List<Book> computerBooks = bookMap.get("��ǻ��");
		for (Book book : computerBooks) {
			System.out.println(book.getGenre() + " : " + book.getTitle());
		}
		
	}
	
	static class Book {
		private String genre;
		private String title;
		
		public Book(String genre, String title) {
			super();
			this.genre = genre;
			this.title = title;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("[");
			builder.append(genre);
			builder.append(": ");
			builder.append(title);
			builder.append("]");
			return builder.toString();
		}
		
		
	}
}
