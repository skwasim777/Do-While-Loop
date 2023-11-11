package com.do_While_Loop;

import java.util.Scanner;

public class FindingNumberofzeroEvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scanner.nextInt();
		int r, z = 0, en = 0, on = 0;
		do {
			r = n % 10;
			if (r == 0)
				z++;
			else if (n % 2 == 0)
				en++;
			else
				on++;
			n = n / 10;
		} while (n != 0);
		System.out.printf("Even Number = %d , Odd Number = %d , Zero = %d ", en, on, z);
	}
}
