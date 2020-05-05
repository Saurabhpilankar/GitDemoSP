package myPackage;



class Things{
	public String name;
	public static String last_name;
	
	public static void show() {
		System.out.println(last_name);
		
	}
}
public class StaticKeywordTutorial {

	public static void main(String[] args) {

		Things.last_name= "This is my last name";
		Things.show();
		
	}

}
