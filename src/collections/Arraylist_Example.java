package collections;

import java.util.ArrayList;

public class Arraylist_Example {

	public static void main(String[] args) {
		ArrayList AL = new ArrayList();
		AL.add("selenium");
		AL.add("uft");
		AL.add("java");
		AL.add("ruby");
		AL.add("python");
//		System.out.println(AL.get(0));
		System.out.println(AL.get(1));
		System.out.println(AL.size());
		AL.remove(0);
		AL.remove("uft");
		
		for (int i = 0; i < AL.size() ; i++) {
			System.out.println(AL.get(i));			
		}
		
	}

}
