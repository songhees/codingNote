package example_09_28_anonymous;

public class ClickApp {
	public static void main(String[] args) {
		
		Click homeButtonClick = new Click() {
			public void actionPerformed() {
				System.out.println("Ȩ�������� ǥ���մϴ�.");
			}
		};
		
		Click preButtonClick = new Click() {
			public void actionPerformed() {
				System.out.println("���� �������� ǥ���մϴ�.");
			}
		};
		
		Click nextButtonClick = new Click() {
			public void actionPerformed() {
				System.out.println("���� �������� ǥ���մϴ�.");
			}
		};
		
		Click ne = new Click() {
			public void actionPerformed() {
				System.out.println("ȣ");
			}
		};

	}
}
