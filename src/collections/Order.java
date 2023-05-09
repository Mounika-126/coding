package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.*;
public class Order {

	public static void main(String[] args) {
		
List<Integer> z = new ArrayList<>();
z.add(12);
z.add(34);
z.add(56);
 z.add(23);
z.add(12);
 z.add(34);
z.add(0, 80);	   
z.add(7, 23);
Collections.sort(z);
Collections.reverse(z);
for(int a:z) {
	System.out.println(a);
}
	} 

}
