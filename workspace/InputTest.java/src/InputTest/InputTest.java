package InputTest;

import java.util.Scanner;

/**
 * This program demonstrates console input.
 * @version 1.10 2016-10-27
 * @author chengqiang
 *
 */

public class InputTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// get first input
		System.out.print("What is your name?");
		String name = in.nextLine();
		
		// get second input
		System.out.print("How old are you?");
		int age = in.nextInt();
		
		// display output on console
		System.out.println("Hello, " + name + ".Next year, you'll be " + (age + 1));
	}

}
