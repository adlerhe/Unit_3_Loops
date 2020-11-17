package friday_warm_up;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int m = input.nextInt();
		for(int i = 10;i < Integer.MAX_VALUE;i *= 10) {
			if(i != 10) {
			int a = m%i;
			int b = i/10;
			int c = m%b;
			int d = a-c;
			int e = d/b;
			System.out.println(e);
			}
			else {
				System.out.println(m%10);
			}
			if(i>m) {
				break;
			}
			
		}
	}

}
