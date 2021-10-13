package classwork;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter number");
		 
		 int num = s.nextInt();
		 
		  if (num % 2 == 0)
			  System.out.println("It is Even number");
		  else 
			  System.out.println("It is Odd Number");
		 
	}

}
