package inheritance;

public class grand_Child extends Child {
	
	public String state = "Pa";

	public static void main(String[] args) {
		grand_Child gc = new grand_Child();
		gc.printfirstName();
		gc.printssn();
		gc.display_City();
		gc.display_State();

	}
	public void display_State() {
		System.out.println("the city is " +state);
	}

}
