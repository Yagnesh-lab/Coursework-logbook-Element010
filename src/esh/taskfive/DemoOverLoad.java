/* Calculates a integer and double value of an sum, average and square. */

package esh.taskfive;

public class DemoOverload {

	public static void main(String[] args) {
		
		//Variables for integers.
		int x = 5;
		int y = 7;
		int n = 8;
		
		double h = 6.68;
		double o = 5.32;
		double m = 4.23;
		
		// sum for integer and double.
		int z = sum(x, y, n); 
		double w = sum(h, o, m);
		
		//average for integer and double.
		int a = average(x, y, n); 
		double b = average(h, o, m); 
		
		 // square for integer and double.
		int e = sqaure(x);
		double f = square(h);
		
		// Prints out value of sum, average and squares for doubles and integers. 
		System.out.println("Sum int: " + z);
		System.out.println("Sum Double: " + w);
		
		System.out.println("Average Int: " + a);
		System.out.println("Average Double: " + b);
		
		System.out.println("Square Int: " + e);
		System.out.println("Square Double: " + f);
		
	}
	
	public static int sum(int x, int y, int n) { 
		
		// returns results back to the main
		return x + y +n;
		
	}
	
	public static double sum(double h, double o, double m) {
		
		return h + o + m;
		
	}
	
	public static int average(int x, int y, int n) {
		
		return sum(x, y, n)/3;
		
	}
	
	public static double average(double h, double o, double m) {
		
		return sum(h, o, m);
		
	}
	
	public static int sqaure(int x) {
		
		return x*x;
	}
	
	public static double square(double h) {
		
		return h*h;
		
	}
		

}
