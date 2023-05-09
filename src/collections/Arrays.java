package collections;

public class Arrays {

	public static void main(String[] args) {  //arrays are fixed in size once we declare the size we canot change
		                                        //if we don't initialize it will store the default values memory will waste in order to slove 
		                                     // collections are introduced.
	int values[] = new int[2];
	values[0]=12;
	values[1]=10;
	for(int i=0; i<values.length;i++) {
		System.out.println(values[i]);
	}

	}

}
