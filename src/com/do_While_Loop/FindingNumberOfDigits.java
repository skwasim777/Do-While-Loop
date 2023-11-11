package com.do_While_Loop;

import java.util.Scanner;

public class FindingNumberOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :");
		int n = scanner.nextInt();
		int count = 0;
		do {
			count++;
			n = n / 10;
		} while (n != 0);
		System.out.println("Number of digits = " + count);
	}
}
