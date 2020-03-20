package esh.taskfive;

public class AnimalTest {

	public static void main(String[] args) {

		Dog dog = new Dog();  
		Lion lion = new Lion();
		Cat cat = new Cat();		
		
		// Animal noises 
		dog.bark();
		lion.roar();
		cat .meow();
		
		 // Space
		System.out.println("");
		
		// Animal activity 
		dog.sleep();
		lion.eat();
		cat .sleep();
		
		System.out.println(""); 
		
		// Animal movement 
		dog.move();
		lion.move();
		cat.move();
		
		System.out.println(""); 
		
		// Animal sounds
		dog.makeSound();
		lion.makeSound();
		cat.makeSound();
		
		System.out.println(""); 
		
		System.out.println(dog.getOwner());
		System.out.println(lion.getOwner());
		System.out.println(cat.getOwner());
	}

}

