package outputTest.java;

/**
 * This program is test output
 * @author chengqiang
 * @version 1.0
 */

public class outputTest {

	public static void main(String[] args) {
		int x = 10000 / 3;
		System.out.println(x);
		
		double y = 10000.0 / 3.0;
		System.out.print(y);
		System.out.println("");
		System.out.printf("%8.2f", y);
		System.out.println("");
		System.out.printf("%,.2f", y);
		System.out.println("");
		System.out.printf("%,.2f", y);
		System.out.println("");
		System.out.printf("%+.2f", y);
		System.out.println("");
		System.out.printf("% .2f", y);
		System.out.println("");
		System.out.printf("%-2f", y);
	}

}
