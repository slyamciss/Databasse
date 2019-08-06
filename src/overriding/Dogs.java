package overriding;

public class Dogs extends Animals {

	public static void main(String[] args) {
		Dogs dog = new Dogs();
		dog.play();
//		dog.eatFood();

	}
	public void eatFood() {
		super.eatFood();
		System.out.println("dogs like dog food");
	}


}
