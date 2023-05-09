package exceptions;

public class Nullpointer { //nullpointer exception(unchecked exception) we cannot predict this upfront during the runtime only we know the exception

			public static void main(String[] args) {
				
				//String filename = "test";   if we give null
				//filename.length();  result will be 4
				try {
				String filename = null;  //it won"t throw any error untill we run it shows null point exception then will use try catch block to give a meaningful msg
				filename.length();
				}
				catch (NullPointerException e) {
					System.out.println("make sure file name is not null");
					System.out.println(e.getMessage());
					
				}
			}

		

	}


