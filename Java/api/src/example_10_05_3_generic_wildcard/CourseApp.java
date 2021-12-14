package example_10_05_3_generic_wildcard;

public class CourseApp {
	public static void main(String[] args) {
		Course<Student> c1 = new Course<>("�������� ���ʽ���");
		Course<PostGraduatedStudent> c2 = new Course<>("����� �ۼ���");
		Course<Worker> c3 = new Course<>("�������� ���� ��������");
		Course<Person> c4 = new Course<>("���� ��Ʃ���� �� �� �ִ�.");
		
		Academy academy = new Academy();
		
		// ���������(Course<?> course) - <?> ���� ����
		// Course<T>���� T�� Ÿ���� �������� ���� 
		academy.���������(c1);
		academy.���������(c2);
		academy.���������(c3);
		academy.���������(c4);
		
		// �����������(Course<? extends Student> course) - <? extends Student> ���� ����
		// Course<T>���� T�� Ÿ���� Student�� Student�� ������ ���
		academy.�����������(c1);
		academy.�����������(c2);
//		academy.�����������(c3);
//		academy.�����������(c4);
		
		// ���п��������(Course<? extends PostGraduatedStudent> course) - <? extends PostGraduatedStudent> ��������
		// Course<T>���� T�� Ÿ���� PostGraduatedStudent�� PostGraduatedStudent�� ������ ���
//		academy.���п��������(c1);
		academy.���п��������(c2);
//		academy.���п��������(c3);
//		academy.���п��������(c4);
		
		//T�� Ÿ�Կ� ���� �з�
		// �����ι��Ϲ��ΰ������(Course<? super Worker> course) - <? super Worker> ���� ���� 
		// Course<T>���� T�� Ÿ���� Worker�� Worker�� ������ ���
//		academy.�����ι��Ϲ��ΰ������(c1);
//		academy.�����ι��Ϲ��ΰ������(c2);
		academy.�����ι��Ϲ��ΰ������(c3);
		academy.�����ι��Ϲ��ΰ������(c4);
		
	}
}
