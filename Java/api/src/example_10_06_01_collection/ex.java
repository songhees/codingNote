package example_10_06_01_collection;

import java.util.HashSet;
import java.util.Set;

public class ex {
	public static void main(String[] args) {
		
		Set<String> a = new HashSet<>();
		
		a.add("");
		a.add("��");
		a.add("��");
		a.add("��");
		
		HashSet<String> data = new HashSet<>();
		
		data.add("ȫ");
		data.add("��");
		data.add("��");
		data.add("ȫ����");
		data.add("ȫ");
		
		System.out.println(data.size()); //4
		System.out.println(data.contains("��")); //true
		System.out.println(data.isEmpty()); //false
		data.remove("��");
		System.out.println(data.toString()); //
		
		
		data.addAll(a);
		System.out.println(data.toString()); //
		
		data.clear();
		System.out.println(data.toString()); //
		
		
		
	}
}
