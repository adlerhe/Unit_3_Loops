package unsolved_questions;

import java.util.Scanner;

public class Pascal_triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int rows = input.nextInt();
		for (int i = 0; i < rows; i++) {
			int number = 1;
			System.out.format("%" + (rows - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.format("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

	}
