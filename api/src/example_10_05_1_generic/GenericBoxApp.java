package example_10_05_1_generic;

public class GenericBoxApp {
	public static void main(String[] args) {
		// ���׸��� �����Ǵ� Box��ü �����ϱ�
		// ��ü�� ������ �� Generic<T>�� T�� ��ü���� Ÿ������ �����Ѵ�.
		GenericBox<Food> foodBox = new GenericBox<>(); // �տ��� ��� �ȴ�.
		
		Food food1 = new Food("�丶��", 5000);
		Food food2 = new Food("����", 12000);
		Food food3 = new Food("ġŲ", 20000);
		
		// public void addItem(T item){...}��
		// public void addItem(Food item){...}���� ����ȴ�.
		foodBox.addItems(food1); /// T -> Food
		foodBox.addItems(food2); /// T -> Food
		foodBox.addItems(food3); /// T -> Food
		
		// Ÿ���Ķ���Ϳ� ������ Ÿ�Ը� ����ȴ�. Ÿ�Ծ������� �����
//		Contact contact = new Contact("ȫ�浿", "010-1111-2222", "�Ｚ����");
//		foodBox.addItems(contact); // ���� �߻�
		
		// ����� ���� ������ �� ����ȯ �����ڸ� ����� �ʿ䰡 ����.
		// T getItem(int index) {...}��
		// Food getItem(int index) {...}�� ����ȴ�.
		Food savedFood1 = foodBox.getItem(0);
		Food savedFood2 = foodBox.getItem(1);
		Food savedFood3 = foodBox.getItem(2);
		
		System.out.println(savedFood1.getName() + ", " + savedFood1.getPrice());
		System.out.println(savedFood2.getName() + ", " + savedFood2.getPrice());
		System.out.println(savedFood3.getName() + ", " + savedFood3.getPrice());
	}
}
