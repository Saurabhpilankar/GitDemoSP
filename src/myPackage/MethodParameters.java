package myPackage;

class MyData {

	void getName(String myName) {
		System.out.println("My name is: " + myName);
	}

	void myAge(int age) {
		System.out.println("My age is : " + age);
	}
}

public class MethodParameters {

	public static void main(String[] args) {
      MyData data =new MyData();
      data.getName("Saurabh");
      data.myAge(29);
      String name = "Albert" ;
      data.getName(name);

}
}
