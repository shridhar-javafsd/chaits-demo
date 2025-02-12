package com.chaits.demo.day02;

import java.util.Scanner;

//WAP to convert numbers from digits to words 

public class SwitchCaseDemo {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter an integer:");

		int num = sc.nextInt();  // 1

		System.out.println(num);
				
		switch (num) {
		case 1: {
			System.out.println("One");
			break;
		}
		case 2: {
			System.out.println("Two");
			break;
		}
		case 3: {
			System.out.println("Three");
			break;
		}
		default:
			System.out.println("Other");
		}
		sc.close();
	}


}
