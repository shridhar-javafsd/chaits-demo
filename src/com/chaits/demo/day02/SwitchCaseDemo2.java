package com.chaits.demo.day02;

import java.util.Scanner;

//WAP to find adjectives based on a letter  

public class SwitchCaseDemo2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a letter:");

		
		String str = sc.next();


		System.out.println(str);
				
		switch (str) {
		case "A": {
			System.out.println("Attractive");
			break;
		}
		case "B": {
			System.out.println("Beautiful");
			break;
		}
		case "C": {
			System.out.println("Charming");
			break;
		}
		default:
			System.out.println("Other");
		}
		sc.close();
	}


}
