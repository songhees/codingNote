package exam;

import java.util.Scanner;

public class for09 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<i+1;j++) {
				System.out.print("*");
			}
		System.out.println("");
		}	
		scan.close();
	}
}
