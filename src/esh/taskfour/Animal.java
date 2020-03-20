/* Superclass */

package esh.taskfour;

public abstract class Animal {
	
	public boolean isAPet = true;
	
	public String owner ="John";
	
	public void sleep() {
		
		System.out.println("Sleeping");
	}
	
	public void eat() {
		
		System.out.println("Eating");
	}
	
	public abstract void move();
	
}
