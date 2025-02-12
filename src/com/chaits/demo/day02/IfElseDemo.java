//package com.chaits.demo.day02;
//
//import java.util.Scanner;
//
//// find if the given number is positive or negative 
//
//public class IfElseDemo {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Please enter an integer:");
//
//		int num = sc.nextInt(); // takes int input by user
//
//		System.out.println(num);
//
//		if (num > 0) {
//			System.out.println("Positive"); // 10
//		} else {
//			System.out.println("Negative"); // -10 
//		}
//		sc.close();
//	}
//}

package com.chaits.demo.day02;

import java.util.Scanner;

// find if the given number is positive or negative 

public class IfElseDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter an integer:");

		int num = sc.nextInt(); // takes int input by user

		System.out.println(num);

		if (num > 0)
			System.out.println("Positive"); // 10
		else
			System.out.println("Negative"); // -10
		sc.close();
	}
}
