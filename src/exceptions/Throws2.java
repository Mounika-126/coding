package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws2 {
	
	public void print() throws FileNotFoundException {   //this  method has a potential to throw an errror which is not handled here 
		                                                  //which is postponed  by using throws keyword.
		String fileName = "test";
		FileReader reader = new FileReader(fileName);
	}
	}
	
	


