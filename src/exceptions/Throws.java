package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {//here we are calling the print method in throws2 class which has unhandled exception using by throws keyword we need to handle  
	//that exception by using try & catch block 
	public static void main(String[] args) {
		Throws2 t = new Throws2();
		try {
			t.print();
		} catch (FileNotFoundException e) {
			
			System.out.println("file not found");
		}  
}                    
}