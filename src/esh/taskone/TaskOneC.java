/* calculator that add two integers together that has been inputed by the 
 * user. However it allows the user to add another number that will be added
 * to the previous second integer. */

package esh.taskone;

import java.util.Scanner;

public class TaskOneC {
	
	private static int first = 0;
	private static int second = 0;
	private static int sum = 0;
	private static Scanner myInput;
	
	public static void main(String[] args) {
		
		myInput = new Scanner(System.in);
		
		first = myInput.nextInt();
		System.out.println("The entered first interger is: " + first);
		
		// Loop to add another number to the second integer by the user.
		while (true) {
			
			second = myInput.nextInt();
			System.out.println("The entered second interger is: " + second);
			
			sum = first + second;
			System.out.println("The entered sum interger is: " +sum);
			
			// Gives the value of second variable to first variable.
			first = second;
		}
	}

}

