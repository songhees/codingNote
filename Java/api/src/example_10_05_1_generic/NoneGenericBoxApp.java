package example_10_05_1_generic;

public class NoneGenericBoxApp {
	public static void main(String[] args) {
		// Food��ü�� ������ �����ϴ� NoneGenericBox ��ü ����
		NoneGenericBox foodBox = new NoneGenericBox();
		
		// ������ NoneGenericBox��ü�� Food��ü �����ϱ�
		Food food1 = new Food("�丶��", 5000);
		Food food2 = new Food("����", 12000);
		Food food3 = new Food("ġŲ", 20000);
		
		foodBox.addItem(food1); // ����� �� Object Ÿ������ Ŭ���� ����ȯ�� �ȴ�.
		foodBox.addItem(food2);	// ����� �� Object Ÿ������ Ŭ���� ����ȯ�� �ȴ�.
		foodBox.addItem(food3);	// ����� �� Object Ÿ������ Ŭ���� ����ȯ�� �ȴ�.
		
		Contact contact = new Contact("ȫ�浿", "010-1111-2222", "�Ｚ����");
		foodBox.addItem(contact); // ������ Box��ü�� Food��ü�� �ٸ� ��ü�� �����ص� ������ �߻��ϱ� �ʴ´�.(Ÿ�� �������� ������� ����.)
								  // ������ ���� �Ǵµ� ������ ���� ���� // ��������, Food��ü�� �ƴ� ��ü�� ������ �ȴ�.
		// NoneGenericBox ��ü�� ����� Food��ü ��������
		// Object ��ü�� �ּҰ��� ��ȯ��
		// Object getItem(int index) {...}�� �����
		Object obj1 = foodBox.getItem(0);
		Object obj2 = foodBox.getItem(1);
		Object obj3 = foodBox.getItem(2);
		
		// Food Ÿ������ ���� ����ȯ�Ѵ�. ����ȯ�����ڸ� �� ����ؾ� �Ѵ�.
		Food saveFood1 = (Food)obj1;
		Food saveFood2 = (Food)obj2;
		Food saveFood3 = (Food)obj3;
		
		System.out.println(saveFood1.getName() + ", " + saveFood1.getPrice());
		System.out.println(saveFood2.getName() + ", " + saveFood2.getPrice());
		System.out.println(saveFood3.getName() + ", " + saveFood3.getPrice());
	}
}
