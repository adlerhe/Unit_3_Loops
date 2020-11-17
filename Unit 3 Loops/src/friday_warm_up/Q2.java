package friday_warm_up;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter x");
		int x = input.nextInt();
		System.out.println("enter y");
		int y = input.nextInt();
		
		for(int i = 0;i < y;i++) {
			for(int k = 0; k < x; k++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}

}
