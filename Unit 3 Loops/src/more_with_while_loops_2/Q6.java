package more_with_while_loops_2;

import java.util.Scanner;

public class Q6 {

	// !!! Notice!
		// This is the THIRD question in Hard Level
		
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int m = input.nextInt();
		int i ;
		for(i = 2; i < m; i++) {
		if (m%i == 0) {
			System.out.println("it is not a prime");
			break;
		}
		if(m%i != 0) {
			if(i == m-1) {
			System.out.println("it is a prime");
			}
	}
		
		}
	}
}
