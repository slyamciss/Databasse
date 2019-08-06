package ReadFile;

import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\slyam\\Desktop\\Java file\\homework1.txt");
		fw.write("this is writting assignment1");
		fw.write("\r\n");
		fw.write("this is writting assignment2");
		fw.write("\r\n");
		fw.write("this is writting assignment3");
		fw.write("\r\n");
		fw.write("this is writting assignment4");
		fw.close();
		

	}

}
