package com.acts;

import java.util.Scanner;

public class GiveSum {

	public static void main(String[] args) {
		System.out.println("Enter First Number:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		int num2 = sc.nextInt();
		int sum =num1+num2;
		System.out.println("Sum of two numbers is : " + sum);
	}

}
