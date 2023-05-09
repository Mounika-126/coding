package collections;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {

java.util.Set<Integer> rec =new HashSet<Integer>();
rec.add(12);
rec.add(34);
rec.add(56);
 rec.add(23);
rec.add(12);
 rec.add(34);
 rec.add(12);
 for(int a: rec) {
	 System.out.println(a);
 }
	}

}
