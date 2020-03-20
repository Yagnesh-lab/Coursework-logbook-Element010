/* Calculator that shows the average of three integers added together 
 * that has been inputed by the user. */

package esh.taskone;

import java.util.*;

public class TaskOneB {
	
	private static int first = 0;	
	private static int second = 0;
	private static int third = 0;
	// Temporary number.
	private static int temp = 0;
	
	private static int sum = 0;
	private static Scanner myInput;

	public static void main(String[] args) {
		
		myInput = new Scanner(System.in);
		
		first = myInput.nextInt();
		System.out.println("The entered first interger is:" + first);
		
		second = myInput.nextInt();
		System.out.println("The entered second interger is:" + second);
		
		third = myInput.nextInt();
		System.out.println("The entered third interger is:" + third);
		
		// The operation to create the value of sum
		sum = (first + second +third)/3;
		System.out.println("The entered sum interger is:" + sum);
		
		// Rearranges the integer from the smallest to biggest number.
		if (first > second) {
			temp = first;
			first = second;
			second = temp;
		}
		
		if (second > third) {
			temp = third;
			third  = second;
			second = temp;
		}
		
		System.out.println("The entered sum interger is: = " + first + ", " + second +", " + third +" = " + sum);
		
	}

}
