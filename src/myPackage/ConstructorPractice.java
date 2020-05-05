package myPackage;

class Animals {

	String name;

	public Animals() {
		
		this("Rabbit");
		System.out.println("Default Constructor running");
	}

	public Animals(String name) {
		//calling another constructor, constructor chaining
		this("Lion","Carnivorous");
		System.out.println("Parameterized constructor running");
	}
	
	public Animals(String name, String type) {
		System.out.println("Calling another contructor from one constructor");
		
	}
}

public class ConstructorPractice {

	public static void main(String[] args) {
		
		//Default constructor calling
		Animals animal1 = new Animals();
		
		//Parameterized Constructor calling
		Animals animmal2 = new Animals("Tiger");
	}

}
