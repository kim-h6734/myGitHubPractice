/**
 *  CSIS 3275-001 Software Engineering - Summer 2020
 */
package myJavaProject;

import java.util.Scanner;

/**
 * @author Hyeonju Kim
 *
 */
public class MyAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number for calculating factorial");
		int num = sc.nextInt();
		System.out.println(num + "! = " + getFactorial(num));
	}

	public static int getFactorial(int n) {
		int result = 0;
		if (n == 0)
			result = 1;
		else {
			result = n * getFactorial(n - 1);
		}
		return result;

	}

}
