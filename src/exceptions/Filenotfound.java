package exceptions;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filenotfound {  //Checked Exception which we can predict 
			
			public static void main(String args[]) {
				
					try {
						FileReader reader = new FileReader("filename");//filereader is a predefined class in java that we can read the file 
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				
				
			}

		
	}


