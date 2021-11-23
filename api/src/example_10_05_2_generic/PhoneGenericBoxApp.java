package example_10_05_2_generic;


public class PhoneGenericBoxApp {
	public static void main(String[] args) {
		
		/*
		 * public class PhoneGenericBox<T extends Phone>
		 * 		PhoneGenericBox�� Ÿ���Ķ���Ϳ� �����ϴ� Ÿ���� �����Ѵ�.
		 * 		<T extends Phone>�� T�� �ڸ��� Phone, SmartPhone, FeaturePhone�� ������ �� �ִ�.	 
		 */
		PhoneGenericBox<Phone> box1 = new PhoneGenericBox<>();
		PhoneGenericBox<SmartPhone> box2 = new PhoneGenericBox<>();
		PhoneGenericBox<FeaturePhone> box3 = new PhoneGenericBox<>();
		
		// box1�� PhoneŸ�� ��ü�� ���޹޴´�.
		box1.setItem(new SmartPhone());			// void setItem(Phone item)
		box1.setItem(new FeaturePhone());
		// box1���� ��ü�� �������� PhoneŸ���� ��ü�� ��ȯ�Ѵ�. 
		Phone phone1 = box1.getItem();			// Phone getItem()
		phone1.call("010-1234-4567");
		
		// box2�� SmartPhoneŸ�� ��ü�� ���޹޴´�.
		box2.setItem(new SmartPhone());				// void setItem(SmartPhone item)
//		box2.setItem(new FeaturePhone()); // ���� �߻�, FeaturePhone�� SmartPhone�� �ƴϴ�.
		// box2���� ��ü�� �������� SmartPhoneŸ���� ��ü�� ��ȯ�Ѵ�.
		SmartPhone phone2 = box2.getItem();			// SmartPhone getItem()
		phone2.call("010-1234-4567");
		phone2.sms("010-1111-2222", "���� ����");
		phone2.internet();
		
		// box3�� FeaturePhoneŸ�� ��ü�� ���޹޴´�.
//		box3.setItem(new SmartPhone());	  // ���� �߻�, SmartPhone�� FeaturePhone�� �ƴϴ�.
		box3.setItem(new FeaturePhone());			// void setItem(FeaturePhone item)
		// box3���� ��ü�� �������� FeaturePhoneŸ�� ��ü�� ��ȯ�Ѵ�.
		FeaturePhone phone3 = box3.getItem();		// FeaturePhone getItem()
		phone3.call("010-8888-7777");
		phone3.sms("010-8888-7777", "���� �Ծ���");
		
		/*
		 * �Ʒ� ���๮�� ���� ������ �߻��Ѵ�.
		 * String, Food, Contact�� Phone�� ����Ÿ���� �ƴϴ�.
		 */
//		PhoneGenericBox<String> box4 = new PhoneGenericBox<>();		// ���� �߻�
//		PhoneGenericBox<Food> box5 = new PhoneGenericBox<>();		// ���� �߻�
//		PhoneGenericBox<Contact> box6 = new PhoneGenericBox<>();	// ���� �߻�
		
		
	}
}
