package UsingException.IO;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		try {
		
		File file = new File("C:\\newfile.txt");
	
	boolean fvar = file.createNewFile();
	
        	if (fvar) {
	         	System.out.println("New file created successfully");
		
	          }
	
	        else {
			
			System.out.println("File not created");
		}
	
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}
		
			
}


