package java_Pratice_25Oct2024;


//पितृ वर्ग
class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

//उपवर्ग Cat
class Cat extends Animal {
	void sound() {
		System.out.println("Cat meows");
	}
}

//उपवर्ग Dog
class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks");
	}
}

//उपवर्ग Parrot
class Parrot extends Animal {
	void sound() {
		System.out.println("Parrot chirps");
	}
}

//मुख्य वर्ग
public class Interface {
	public static void main(String[] args) {
		Animal myCat = new Cat();
		Animal myDog = new Dog();
		Animal myParrot = new Parrot();

		myCat.sound();   // "Cat meows" 
		myDog.sound();   // "Dog barks"
		myParrot.sound(); // "Parrot chirps"
	}
}

