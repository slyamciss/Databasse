package collections;

import java.util.LinkedList;

public class LinkedList_Example {

	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.add("ajax");
		LL.add("barca");
		LL.add("real");
		LL.add("psg");
		
		System.out.println(LL.get(0));
		LL.remove(1);
		LL.remove("psg");
		for (int i = 0; i < LL.size(); i++) {
			System.out.println(LL.get(i));
			
		}

	}

}
