package com.chaits.demo.day02;

import java.util.Scanner;

// > >= < <= == != 

// WAP to convert numbers from digits to words 

public class ElseIfDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter an integer:");

		int num = sc.nextInt(); // takes int input by user == 2

		System.out.println(num);

		if (num == 1) {
			System.out.println("One");
		} else if (num == 2) {
			System.out.println("Two");
		} else if (num == 3) {
			System.out.println("Three");
		} else {
			System.out.println("Other");
		}
		sc.close();
	}
}
