package example_08_31_operator;

public class Sample2 {
	public static void main(String[] args) {
		/*
		 * + ������
		 * ���ڿ� ���ڿ� ���ؼ��� ���������� �����Ѵ�.
		 * ���ڿ��� �Բ� ���� ���� ������ �̾���̱�� �����Ѵ�.
		 * 
		 * ���� + ���� <- ���ϱ�
		 * ? + ���ڿ� <- �̾���̱�
		 * ���ڿ� + ? <- �̾���̱�
		 * ���ڿ� + ���ڿ� <- �̾���̱�
		 */
		
		System.out.println(1 + 3);					//4
		System.out.println(1 + "abc");				//1abc 
						// 1+ "abc" -> "1abc"
		System.out.println(1 + 3 + "abc");			//4abc 
						// 1 + 3 + "abc" -> 4 + "abc" -> "4abc"
		System.out.println("abc" + 1 + 3);			//abc13
						// "abc" + 1 + 3 -> "abc1" + 3 -> "abc13"
		System.out.println(1 + 3 + "abc" + 1 + 3);	//4abc13
						// 1 + 3 +"abc" + 1 + 3 -> 4 + "abc" + 1 + 3 -> "4abc" + 1 + 3 -> "4abc1" + 3 -> "4abc13"
		
		System.out.println(1 + 3 + "abc" + (1 + 3)); //4abc4
						// 1 + 3 + "abc" + (1 + 3) -> 1 + 3 + "abc" + 4 -> 4 + "abc" + 4 -> "4abc" + 4 -> "4abc4"
	}
}
