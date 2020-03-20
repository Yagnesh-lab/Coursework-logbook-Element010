/* SuperClass */

package esh.taskfive;

public abstract class Animal {
	
	public boolean isAPet = true; 
	
	public String owner = "John";
	
	public void sleep() {
		
		System.out.println("Sleeping");
		
	}
	
	public void eat() {
		
		System.out.println("Eating");
	}
	
	public void sound() {
		
		System.out.println("The animal makes a sounds");
		
	}
	
	public abstract void move();
	
	public String getOwner() {
		
		return owner;
		
	}
	
	public void setOwner(String newOwner) {
		
		owner = newOwner;
	}

}
