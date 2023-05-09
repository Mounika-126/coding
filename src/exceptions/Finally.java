package exceptions;

public class Finally { //The "finally" block is used to execute the necessary code of the program. 
	                       //It is executed whether an exception is handled or not.
	public void test() {
		int a = 1;
		int b = 0;
		
		try {
		int c =a/b;
		}catch (ArithmeticException e) {
			System.out.println("inside catch");
		}
		finally {
			System.out.println("i have excuted");
		}
	}

}
