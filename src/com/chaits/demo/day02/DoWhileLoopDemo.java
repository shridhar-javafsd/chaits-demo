package com.chaits.demo.day02;

public class DoWhileLoopDemo { 

	public static void main(String[] args) {

		System.out.println("Start");

		int num = 1; // try 6

		do { // runs 1 or more times 
			System.out.println(num);
			num = num + 1;
		} while (num <= 5);

		System.out.println("End");

	}

}
