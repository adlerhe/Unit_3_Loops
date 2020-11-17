package friday_warm_up;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int n = input.nextInt();
		for(int i = 1;i <= n; i++) {
			for(int k = 1;k <= i; k++) {
				if(i%k == 0) {
					System.out.print(k);
				}
			}
			System.out.println();
		}
	}

}
