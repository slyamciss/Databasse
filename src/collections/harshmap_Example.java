package collections;

import java.util.HashMap;

public class harshmap_Example {

	public static void main(String[] args) {
		HashMap HM = new HashMap(); 
		HM.put(1, "Jan");
		HM.put(2, "June");
		HM.put(3, "Mars");
		HM.put(4, "april");
		HM.put(5, "April");
       
		for (int i = 1; i < HM.size(); i++) {
			System.out.println(HM.get(i));
			
		}
	}

}
