/* Uses the different functions from different classes */

package esh.taskfour;

public class AnimalTest {
	
	public static void main (String[] args) {
		
		Dog dog = new Dog();
		Lion lion = new Lion();
		Cat cat = new Cat();
		
		// Animal noises.
		dog.bark();
		lion.roar();
		cat.meow();
		
		// Space
		System.out.println("");
		
		// Animal activity.
		dog.sleep();
		lion.eat();
		cat.sleep();
		
		System.out.println("");
		
		// Animal movement.
		dog.move();
		lion.move();
		cat.move();
				
	}

}

