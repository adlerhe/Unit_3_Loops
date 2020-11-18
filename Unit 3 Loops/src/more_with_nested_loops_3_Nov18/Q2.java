package more_with_nested_loops_3_Nov18;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int m = input.nextInt();
		for(int i = 1;i <= m;i++) {
			for(int k = 1;k <= i;k++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}

}
