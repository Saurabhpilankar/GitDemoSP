package myPackage;

public class StringBuildTutotorial {

	public static void main(String[] args) {
		
		//inefficient coding
		String myInfo = " ";
		myInfo += "My Name is ";
		myInfo += "Kevin";
		System.out.println(myInfo);
		
		//Using StringBuilder
		
		StringBuilder strbuild = new StringBuilder();
		strbuild.append("");
		strbuild.append("My name is ");
		strbuild.append("Johnson");
		System.out.println(strbuild.toString());
		
		//using chaining
		StringBuilder sb = new StringBuilder();
		sb.append("").append("My Name is").append(" Robert");
		System.out.println(sb);

		
		//String Formatting
		System.out.printf("My name is %s","saurabh");
		
		System.out.printf("My age is %-5d , my salary is %.2f", 25,100000.567);
	}

}
