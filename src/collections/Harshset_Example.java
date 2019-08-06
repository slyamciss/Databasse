package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Harshset_Example {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("java");
		hs.add("selenium");
		hs.add("ruby");
		hs.add("python");
		hs.add("c#");
		
		hs.remove("ruby");
		System.out.println(hs.size());

		Iterator IT = hs.iterator();
		while (IT.hasNext()) {
			System.out.println(IT.next());
		}
		
	}

}
