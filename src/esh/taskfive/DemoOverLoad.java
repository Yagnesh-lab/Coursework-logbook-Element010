package esh.taskfive;

public class DemoOverLoad {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 7;
		int n = 8;
		
		double h = 6.68;
		double o = 5.32;
		double m = 4.23;
		
		int z = sum(x, y, n); // sum for int
		double w = sum(h, o, m); // average for double
		
		int a = average(x, y, n); //average for int
		double b = average(h, o, m); // average for double
				
		int e = sqaure(x); // square for int
		double f = square(h); // square for double
		
		System.out.println("Sum int: " + z);
		System.out.println("Sum Double: " + w);
		
		System.out.println("Average Int: " + a);
		System.out.println("Average Double: " + b);
		
		System.out.println("Square Int: " + e);
		System.out.println("Square Double: " + f);
		
	}
	
	public static int sum(int x, int y, int n) { 
		
		return x + y +n; // returns results back to the main
		
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
