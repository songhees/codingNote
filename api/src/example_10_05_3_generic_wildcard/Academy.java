package example_10_05_3_generic_wildcard;

public class Academy {
	
	// ������ ����ϱ�
	// Course<?>��
	// 		Course<T>�� T�� �����̵� �������.
	public void ���������(Course<?> course) {
		
	}
	
	// ������������ϱ�
	// ���������� Course<Student>, Course<PostGraduatedStudent> ��ü��.
	// Course<? extends Student>��
	//		Course<T>�� T�� Student, PostGraduatedStudent
	public void �����������(Course<? extends Student> course) {
		
	}
	
	// ���п����� ����ϱ�
	// ���п������� Course<PostGraduatedStudent> ��ü��.
	// Course<? extends Student> ��
	//		Course<T>�� T�� PostGraduatedStudent�� ������ ��ü�� ����Ѵ�.
	public void ���п��������(Course<? extends PostGraduatedStudent> course) {
		
	}
	
	// ������ �� �Ϲ��ΰ��� ����ϱ�
	// ������ �� �Ϲ��ΰ����� Course<Person>, Course<Worker> ��ü��.
	// Course<? super Worker>��
	// 		Course<T>�� T�� Worker, Person���� ������ ��ü�� ����Ѵ�.
	public void �����ι��Ϲ��ΰ������(Course<? super Worker> course) {

	}
	
}
