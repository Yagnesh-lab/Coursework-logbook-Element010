/* Subclass */

package esh.taskfive;

public class Lion extends Animal {
	
	public Lion() { 
		
		setOwner("Peter");
		
	}
	
	public void roar() {
		
		System.out.println("Roooaar!");
		
	}

	public void move() {
		
		System.out.println("Sitting");
		
	}
	
	public void makeSound() {
		
		System.out.println("The Lion roars!");
		
	}
	
}
