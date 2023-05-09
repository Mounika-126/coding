package exceptions;

public class Throw {  //throw keyword is used to throw an custom exception

	public static void main(String[] args)  {
	String accountnumber="1234567";
		  
	    if( accountnumber.length()!=10) {
	    	try {
	    	throw new MyException("Account number should not be more than 10 digits");
	    	
	    }catch (MyException e) {
			System.out.println(e);
		}
		}

	}

}
