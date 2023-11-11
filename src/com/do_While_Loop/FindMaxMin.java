package com.do_While_Loop;

import java.util.Scanner;

public class FindMaxMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = scanner.nextInt();
		int r, max = -9, min = 9;
		do {
			r = n % 10;
			if (max < r)
				max = r;
			if (min > r)
				min = r;
			n = n / 10;
		} while (n != 0);
		System.out.printf("Max = %d , Min = %d ", max, min);
	}
}
