package ReadFile;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\slyam\\Desktop\\Live Project\\homework1.txt");
		if (file.delete()) {
			System.out.println("file has been deleted");
			
		} else {
			System.out.println("file has been deleted or not found");

		}

	}

}
