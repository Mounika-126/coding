package codpackage;

public class StringStringbuffer {

	public static void main(String[] args) {
	String S = new String("First Name");
	S.concat("LastName");
	System.out.println(S);
	
	StringBuffer sb = new StringBuffer("FirstName");
	sb.append("Last Name");
	System.out.println(sb);

	}

}
