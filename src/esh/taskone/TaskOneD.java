package esh.taskone;

import java.util.Scanner;

public class TaskOneD {
		
		private static int first = 0;	
		private static int second = 0;
		private static int third = 0;
		private static int temp = 0;
		private static int sum = 0;
		private static int average = 0;
		private static Scanner myInput;

		public static void main(String[] args) {
			
			myInput = new Scanner(System.in);
			
			first = myInput.nextInt();
			System.out.println("The entered first interger is:" + first);
			
			second = myInput.nextInt();
			System.out.println("The entered second interger is:" + second);
			
			third = myInput.nextInt();
			System.out.println("The entered third interger is:" + third);
			
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
			
			if (first > second) {
				temp = first;
				first = second;
				second = temp;
			}
			
			sum = (first + second + third);
			// Creates the value of average.
			average = (sum/3);
			System.out.println("The entered sum interger is: " + "(" + first + "+" + second + "+" + third + ")=" + sum + "/3= " + average + ",");
			
		}

	}

