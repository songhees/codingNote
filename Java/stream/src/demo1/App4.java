package demo1;

import java.util.List;

public class App4 {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student("이순신", 100, 90, 90),
				new Student("김유신", 90, 80, 80),
				new Student("강감찬", 100, 100, 95),
				new Student("류관순", 100, 70, 70),
				new Student("안중근", 100, 100, 100));
		// 1,2,3등 학생들의 이름을 출력하기
		// 스트림의 생성
		students.stream()
			// 스트림의 정렬	Stream<Student> 총점순으로 정렬된 것 반환
			.sorted((s1, s2) -> s2.getTotal() - s1.getTotal()) // sorted(Comparator comparator)
			// 빼서 양수면 앞에게 큰서 음수면 뒤에게 큰거 순서를 바꾸면 내림차순이 변경
			// 스트림의 제한	Stream<Student> 3개만 반환
			.limit(3)
			// 스트림의 변환	Stream<String> 반환
			.map(s -> s.name)
			// 스트림의 사용	
			.forEach(System.out::println);
		
	}
	
	static class Student {
		String name;
		int kor;
		int math;
		int eng;
		
		public Student(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		public int getTotal() {
			return kor + eng + math;
		}
		
	}
}
