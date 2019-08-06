package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap_Example {

	public static void main(String[] args) {
		LinkedHashMap LM = new LinkedHashMap();
		LM.put(1, "Jan");
		LM.put(5, "Feb");
		LM.put(3, "Dec");
		LM.put(2, "Nov");
		LM.put(4, "Daddy");

		Set keys = LM.keySet();
		Iterator IT = keys.iterator();
		while (IT.hasNext()) {			
		System.out.println(LM.get(IT.next()));
	}
	}
}
