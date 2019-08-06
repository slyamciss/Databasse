package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet_Example {
	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add("java");
		ts.add("football");
		ts.add("ruby");
		ts.add("python");
		ts.add("daddy");

		Iterator IT = ts.iterator();
		while (IT.hasNext()) {
			System.out.println(IT.next());
		}
	}
}