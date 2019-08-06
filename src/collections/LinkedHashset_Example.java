package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset_Example {

	public static void main(String[] args) {
		LinkedHashSet LHS = new LinkedHashSet();
		LHS.add("java");
		LHS.add("ruby");
		LHS.add("VB");
		LHS.add("python");
		
		LHS.remove("java");
		
		Iterator IT = LHS.iterator();
	    while (IT.hasNext()) {
	    	System.out.println(IT.next());
	    }

	}

}
