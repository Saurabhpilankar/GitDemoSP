package myPackage;

class Dogs{
	
	private String name;
	private String breed;
	private int age;
	
	public void setAge(int age) {
		this.age= age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public String getName() {
		return name;
	}
	
}


public class SettersTutorial { 

	public static void main(String[] args) {

		Dogs dog1 = new Dogs();
		dog1.setAge(10);
		dog1.setName("Tony");
		System.out.println("Dog age is " +dog1.getAge()); 
		System.out.println("Dog name is " +dog1.getName());
		
	}

}
