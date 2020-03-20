/* Subclass */

package esh.taskfive;

public class Cat extends Animal {
	
	public Cat() {
		
		setOwner("Alice");
		
	}
		
	public void meow() {
			
		System.out.println("meooww");
			
	}
		
	public void move() {
		
		System.out.println("Jummping");
		
	}
	
	public void makeSound() {
		
		System.out.println("The cat does meow!");
		
	}

}

