package com.do_While_Loop;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scanner.nextInt();
		int r, rev = 0;
		do {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		} while (n != 0);
		System.out.println("Reverse Number is = " + rev);
	}
}
