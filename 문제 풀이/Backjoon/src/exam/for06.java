package exam;

import java.util.Scanner;

public class for06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for (int i=0;i<N;i++) {
			System.out.println(N-i);
		}
		scan.close();
	}
}
