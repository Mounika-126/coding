package codpackage;

public class Employee {  //Static keyword:-he static keyword in Java is used for memory management mainly. 
	                     //We can apply static keyword with variables, methods, blocks and nested classes. 
	                       //The static keyword belongs to the class than an instance of the class.we can directly call with class name
	public String name;
	public int age;
	public static  String ceo;
	public static final double PI=3.14;
	public static void display() {
		System.out.println("test");
		System.out.println(ceo);
	}


}
