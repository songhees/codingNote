package example_10_01_system;

import java.util.Properties;
import java.util.Set;

public class SystemApp4 {
	public static void main(String[] args) {
		// �ý����� ������ ��ȸ�� �� �ֵ�.
		// �ý����� �ü��, �ý����� ��Ű��ó, ��ġ�� �ڹٿ� ���� ������ �����Ѵ�.
		Properties prop = System.getProperties();
		
		Set<Object>keys = prop.keySet();
		for (Object key : keys) {
			String name = (String)key;
			String value = prop.getProperty(name);
			System.out.println("["+ name + "]" + value);
		}
		
	}
}
