package main;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class Main {

	public static void main(String[] args) {
		System.out.println("Dog = new Dog");
		Dog no1 = new Dog("Pochi", 5, 80);
		System.out.println("\nCat = new Cat");
		Cat no2 = new Cat("Tama", 3, 50);
		
		System.out.println("\nDog = Dog:Attack");
		no1.attack();
		System.out.println("\nCat = Cat:Attack");
		no2.attack();
		
		System.out.println("\nAnimal = new Dog");
		Animal no5AD = new Dog("Tarou",1,120);
		no5AD.display();
		System.out.println("\nDog = new Animal");
		//Dog no6DA = new Animal("Hana",3);
		
		Dog a1 = no1;
		Animal animal = a1;
		//animal.display();
		Dog b2 = (Dog)animal;
		b2.display();
		
	}

}
