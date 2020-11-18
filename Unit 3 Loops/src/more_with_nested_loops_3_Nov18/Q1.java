package more_with_nested_loops_3_Nov18;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int x = input.nextInt();
		for(int i = 0;i < x; i++) {
			for(int k = 1+i;k <= x+i; k++) {
				if(k > x) {
					System.out.print(k-x);
				}
				else {
					System.out.print(k);
				}
			}
			System.out.println(" ");
		}
	}

}
