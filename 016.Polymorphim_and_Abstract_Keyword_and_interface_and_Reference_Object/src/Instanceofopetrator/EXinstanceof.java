package Instanceofopetrator;

class Animal{}
class Dog extends Animal{}
class Cat extends Dog{}

public class EXinstanceof {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();

		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Dog);
		System.out.println(c instanceof Animal);
		
	}

}
