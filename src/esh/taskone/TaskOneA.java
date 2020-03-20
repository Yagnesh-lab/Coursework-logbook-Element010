/* Calculator adding two integers together that has been imputed by the user. */

package esh.taskone;

import java.util.*;

public class TaskOneA {
	
	// Stores integers user has imputed.
	private static int first = 0;
	private static int second = 0;
	private static int sum = 0;
	private static Scanner myInput;
	
	public static void main(String[] args) {
		
		// Scans for the user input.
		myInput = new Scanner(System.in);
		
		
		first = myInput.nextInt();
		
		// Prints out first integer inputed.
		System.out.println("The entered first interger is:" + first);
		
		second = myInput.nextInt();
		
		System.out.println("The entered second interger is:" + second);
		
		// Creates the value of the sum.
		sum = first + second;
		
		// Prints out the sum.
		System.out.println("The entered sum interger is:" + sum);
		
	}
}

