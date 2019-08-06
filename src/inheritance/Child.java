package inheritance;

public class Child extends Parent {

	public String city = "Philadelphia";

	public static void main(String[] args) {
		Child cd = new Child();
		cd.printfirstName();
		cd.printssn();
		cd.display_City();
	}

	public void display_City() {
		System.out.println("the city is " +city);
	}
}
