package com.do_While_Loop;

import java.util.Scanner;

public class FindingPalindromNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scanner.nextInt();
		int m, r, rev = 0;
		m = n;
		do {
			r = m % 10;
			rev = rev * 10 + r;
			m = m / 10;
		} while (m != 0);
		if (n == rev)
			System.out.println("Palindrom Number..");
		else
			System.out.println("is not palindrom number..");
	}
}
