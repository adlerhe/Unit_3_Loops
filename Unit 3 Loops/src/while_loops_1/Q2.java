package while_loops_1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("enter a number");
		double m=input1.nextInt();
		
		@SuppressWarnings("resource")
		Scanner input2 = new Scanner(System.in);
		System.out.println("enter a number");
		double n=input2.nextInt();
		
		double S = m;
		
				int x = 0;
				while (x <= 5) {
					S*=m;
					x++;
					
				double K = (S/m)/m*n;
		System.out.println(K);
		if (x > 5) {
			break;
		}
		}
		
				}
	}


