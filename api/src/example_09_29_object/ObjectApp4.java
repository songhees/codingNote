package example_09_29_object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ObjectApp4 {

	public static void main(String[] args) {
		Student student = new Student(100, "ȫ�浿", "��ǻ�Ͱ��а�", 3);
		
		// Object�� Class<?> getClass()�� ��ü�� ���赵����(Ŭ��������)�� ���Ե� Class��ü�� ��ȯ�Ѵ�.
		
		// student ���������� �����ϴ� ��ü�� ���� ���赵 ������ ���Ե� Class��ü�� ȹ���Ѵ�.
		Class<?> claz = student.getClass();
		
		// ȹ��� ��ü���� ��� �ʵ������� ��ȸ�Ѵ�.
		Field[] fields = claz.getDeclaredFields();
		for (Field field : fields) {
			// ��������� ��ȸ�ϱ�
			String fieldName = field.getName();
			// �غ����� Ÿ�� ��ȸ�ϱ�
			String fieldType = field.getType().getName();
			System.out.println(fieldType + ", " + fieldName);
		}
		
		// ȹ��� ��ü���� ��� �޼ҵ������� ��ȸ�Ѵ�.
		Method[] methods = claz.getDeclaredMethods();
		for (Method method : methods) {
			String methodDescription = "";
			
			String returnType = method.getReturnType().getName();
			String name =  method.getName();
			
			methodDescription += returnType + "\t" + name;
			
			if (method.getParameterCount() > 0) {
				Parameter parameter =  method.getParameters()[0];
				String parameterType = parameter.getType().getName();
				String parameterName = parameter.getName();

				methodDescription += "(" + parameterType + " " + parameterName +")";
				
			} else {
				methodDescription += "( )";
			}
			System.out.println(methodDescription);
		}
		
	}
}

