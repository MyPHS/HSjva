package interfacepkg.animalFarm;

public class Yard {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.speak();
		animal = new Dog();
		animal = new Hen();
		animal.speak();
		
	}
}
