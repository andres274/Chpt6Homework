/* 6.17 (Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using the following header:
 public static void printMatrix(int n)
 Each element is 0 or 1, which is generated randomly. Write a test program that prompts the user to enter n and displays an n-by-n matrix.
 */

import java.util.Scanner;

public class Matrix {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns for your matrix");
		int n = keyboard.nextInt();
		keyboard.close();
		printMatrix(n);
	}
	public static void printMatrix(int n) {
		for (int rows=0; rows<n; rows++) {
			for (int columns=0; columns<n; columns++) {
				System.out.printf("%1d",(int)(Math.random() * 2));
			}
			System.out.println("");
		}
	}
}
