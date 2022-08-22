package practice;

import java.util.Scanner;

public class ScannerwithThreeVariables {

	public static void main(String[] args) throws InterruptedException {

		Scanner scan = new Scanner(System.in);

		

		System.out.println("Give me an integer");
		int i = scan.nextInt();

		System.out.println("give me a double");
		double d = scan.nextDouble();

		System.out.println("Give me a text");
		scan.nextLine();
		String s=scan.nextLine();

		System.out.println("String s:" + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		scan.close();
	}
}