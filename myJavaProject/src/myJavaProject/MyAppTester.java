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
		/*
		 * Git now is on branch b1
		 * From now on until switching out of branch b1
		 * any changes occur here will be tracked in branch b1
		 * and will not be reflected in any other branch unless b1
		 * is merged later with that branch
		 * */
	}
	
	//This is a method to get Factorial
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
