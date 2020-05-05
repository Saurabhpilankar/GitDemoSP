package myPackage;


class Person{
	int age;
	String name;
	
	void personDetails() {
		System.out.println("Person nam is : " +name +" & age is  "+age);
	}
	
	int Retirement() {
		int remaining_srvc=60-age;
		return remaining_srvc;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
	
	
		
	}
public class GettersTutorial {
	
	public static void main(String[] args) {
		Person p1= new Person();
		
		p1.age=25;
		p1.name="roger";
		int PersonAge = p1.getAge();
		String PersonName = p1.getName();
		System.out.println(PersonAge + PersonName);
		System.out.println("Years left for retirement "+p1.Retirement());
		
	}

}
