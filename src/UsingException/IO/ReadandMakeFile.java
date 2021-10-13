package UsingException.IO;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadandMakeFile {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream out = null;
		//System.out.println(System.getProperty("user.dir"));
	Scanner scan = new Scanner(System.in);
	
	try {
		String st ="";
		 out = new FileOutputStream("C:\\Seleniumm\\myfiles.txt");
		//Scanner scan = new Scanner(System.in);
		System.out.println("Enter content");
		
		while(!st.equalsIgnoreCase("end"))
		{
			
			st= scan.nextLine();
			out.write(st.getBytes());
			out.write("\n".getBytes());
		}	
		
	    }finally {
		
	     out.close();
	   
	    }	
	
	    scan.close();	
		System.out.println("File created");
				
	}
}


