package example_09_09_constructor;

public class Sample2 {
	
	 // ����(int number)�� ���޹޾Ƽ� ¦��(number%2 == 0)�� true, Ȧ���� false�� ��ȯ(boolean)�ϴ� �޼ҵ�
	boolean isEvenNumber(int number) {
		boolean result = false;
		
		if (number%2 == 0) {
			result = true;
		} 
		return result;
		//return (number%2 == 0)? true : false;
		//return number%2 == 0;
	}
	
	
	 // �����迭��ü(int[] numbers)�� ���޹޾Ƽ� �迭�� ����� ���� ����(int)�� ��ȯ�ϴ� �޼ҵ�
	int getTotal(int[] numbers) {
		int total = 0;
		for (int num : numbers) {
			total += num;
		}
		return total;
	}
	
	
	 // �����迭��ü(int[] numbers)�� ���޹޾Ƽ� �迭�� ����� �� �߿��� ���� ū ��(int)�� ��ȯ�ϴ� �޼ҵ�
	int getMaxNumber(int[] numbers) {
		
		int max = numbers[0];
		
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
	
	
	
	 // �����迭��ü(int[] numbers)�� ����(int)�� ���޹޾Ƽ�
	 //�迭�� �� ���ڰ� ���ԵǾ� ������ true, ������ false�� ��ȯ(boolean)�ϴ� �޼ҵ�
	 boolean isExist(int[] numbers, int num) {
		 boolean result = false;
		 
		 for (int number : numbers) {
			 if(number == num) {
				 result = true;
				 break;
			 }
		 }
		 return result;
	 }
	
	
	
	 // ����(int num)�� ���޹޾Ƽ� �� ���ڿ� �ش��ϴ� �������� ǥ���ϴ� �޼ҵ�
	 void printGugudan(int num) {
		 
		 for (int i = 0; i<9; i++) {
			 System.out.printf("%d * %d = %d\n", num, i+1, num*(i+1));
		 }
	 }
	 
	 // ����, ����, ���� ������(int kor, int eng, int math) ���޹޾Ƽ� ����� 60�̻��̸� true, �ƴϸ� false�� ��ȯ(boolean)�ϴ� �޼ҵ�
	 boolean averageScore(int kor, int eng, int math) {
		 boolean result = false;
		 int total = kor + eng + math;
		 double average = total/3.0;
		 if (average >= 60) {
			 result = true;
		 }
		 return result;
	 }
	 
	 
	 
	
	 // ����(int num)�� ���޹޾Ƽ� �� ������ ��� ����� ȭ�鿡 ǥ���ϴ� �޼ҵ�
	 void printNumber(int num) {
		 
		 for (int i=1; i<=num; i++) {
			 if (num%i == 0 ) {
				 System.out.print(i + " " + -i + " ");
			 }
		 }	 
	 }
	
	
	

}
