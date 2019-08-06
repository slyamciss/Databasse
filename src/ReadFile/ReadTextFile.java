package ReadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		
		try {
			File file = new File ("C:\\Users\\slyam\\Desktop\\Java file\\homework.txt");
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String st;
			while ((st = bf.readLine()) != null) {
				System.out.println(st);			
			}			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
