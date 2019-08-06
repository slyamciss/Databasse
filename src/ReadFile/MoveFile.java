package ReadFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFile {

	public static void main(String[] args) throws IOException {
	Path temp = Files.move(Paths.get("C:\\Users\\slyam\\Desktop\\Java file\\homework1.txt"),
			Paths.get("C:\\Users\\slyam\\Desktop\\Live Project\\homework1.txt"));
	
	if (temp != null) {
		System.out.println("Move is successfull");
		
	} else {
		System.out.println("Move is not successfull");
	}

	}

}
