package example_10_01_system;


public class SystemApp3 {
	public static void main(String[] args) {
		// System�� �ý��۰� ���õ� ȯ�漳�� ������ �����Ѵ�.
		// ��ǻ���� �����ȯ�溯�� ������ �ý��� ȯ�溯�� ������ �����Ѵ�.
		
		// �� ��ǻ���� JDK��ġ ������ ��ȸ�ϱ�
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);
		
		// �� ��ǻ���� ����� �̸��� ��ȸ�ϱ�
		String userName = System.getenv("USERNAME");
		System.out.println(userName);

		
//		Map<String, String> env = System.getenv();
//		Set<Map.Entry<String, String>> entries = env.entrySet();
//		
//		
//		for (Map.Entry<String, String> entry : entries) {
//			System.out.println("[" + entry.getKey() + "]" + entry.getValue());
//		}
//		
		
	}
}
