package example_10_07_1_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSample4 {
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
		
		// �帣�� ������ �𸦶�
//		int �Ҽ�å���� = 0;
//		int �ܱ���å���� = 0;
//		int ��ǻ��å���� = 0; �Ұ���
		
		// Key�� �帣��, Value�� �帣�� ���������� �ϴ� Map��ü�� �����Ѵ�.
		Map<String, Integer> genreSummary = new HashMap<>();
		
		for(Book book: books) {	
			//�帣���� ��ȸ
			String genre = book.getGenre();
			// Map��ü�� ��ȸ�� �帣���� ���ԵǾ� �ִ��� üũ
			if (genreSummary.containsKey(genre)) {
				// Map��ü�� �帣���� �����ϴ� ���
				// �ش� �帣������ ����� ���� ������ ��ȸ
				int count = genreSummary.get(genre);
				// Map��ü�� �ش� �帣��� 1������ ���������� �ٽ� �����Ѵ�.
				genreSummary.put(genre, count+1);
				
			} else {								
				// Map��ü�� �帣���� �������� �ʴ� ���
				// �ش� �帣�� key, 1�� value�� Map�� ����
				genreSummary.put(genre, 1);
			}
		}
		System.out.println(genreSummary);
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
		
	}
	
	
	
	
}
