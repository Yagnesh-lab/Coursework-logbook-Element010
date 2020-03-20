/* Subclass */

package esh.taskfive;

// inherits from Animal class
public class Dog extends Animal {
	
	public Dog() {
		
		setOwner("Mike");
	}
	
	 // print out dog bark
	public void bark () { 
		
		System.out.println("Woof");
		
	}
	
	public void move() {
		
		System.out.println("Running");
		
	}
	
	public void makeSound() {
		
		System.out.println("The dog barks!");
		
	}

}
