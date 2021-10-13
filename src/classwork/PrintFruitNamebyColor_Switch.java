package classwork;

import java.util.Scanner;

public class PrintFruitNamebyColor_Switch {

	public static void main(String[] args) {
		
		
		Scanner a = new Scanner(System.in);
		 System.out.println("Enter Fruit Name");
		 
	    String fruit = a.next();
		 
		 switch(fruit)
		 {
		 case "Banana":		 
			 System.out.println("It is Yellow");
			 break;
			 
		 case "Apple":
		 case "Strawberry":
		 case "Grapes":
		 case "Rasberry":
		 case "Pomagranate":
			 System.out.println("It is Red");
		 break;
		 
		 case "Orange":
			 System.out.println("It is Orange");
			 break;
			 
		 case "Blueberry":
			 System.out.println("It is Blue");
			 break;
			 
		 case "Coconut":
			 System.out.println("It is White");
			 break;
			 
		 }

	
	
	
	
	
	
	}

}
