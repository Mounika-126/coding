package collections;

import java.util.ArrayList;
import java.util.Collection;     //here we have collection as an interface we cannot initialize the interface so
import java.util.Iterator;
                                  //(Arraylist) is a class which is implemented the colllection interface 

public class Collect {

	public static void main(String[] args) {
		Collection<Integer> myfirst = new ArrayList<Integer>();    //Colection is interface
	  myfirst.add(12);
	  myfirst.add(34);
	   myfirst.add(56);
	   myfirst.add(23);
	   myfirst.add(12);
		  myfirst.add(34);
		   myfirst.add(56);
		   myfirst.add(23);
		   myfirst.add(12);
			  myfirst.add(34);
			  myfirst.add(34);
	  // System.out.println(myfirst);
//	Iterator<Integer> i = myfirst.iterator();
//	while(i.hasNext()) {
//		System.out.println(i.next());
//	}
			  for(int i:myfirst) {          //if i want to print one bhy one value then will use while or advanced for loop
				  System.out.println(i);
			  }
	}

}
               