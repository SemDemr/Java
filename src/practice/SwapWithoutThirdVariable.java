package practice;

import java.util.Scanner;

public class SwapWithoutThirdVariable {

	public static void swap(int a, int b) {

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swap a: " + a + "\nAfter swap b: " + b);

	}
	
	public static void main1(String[] args) {

		int a = 5;
		int b = 8;

		swap(a, b);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number a: ");

		int a = scan.nextInt();
		System.out.println("Please enter another number b: ");
		int b = scan.nextInt();

		swap(a, b);

	}

	

}
