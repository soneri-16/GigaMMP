package classwork;

import java.util.Scanner;

public class TranslateNumberIntoWord {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int n = scan.nextInt();
		//System.out.println("number is :" +n);
		
		
	
		if (n==1) {
			System.out.println("You have entered number One");
	}
		else if (n==2){
			System.out.println("You have entered number Two");
		}
		else if (n==3){
			System.out.println("You have entered number Three");
		}
		else if (n==4){
			System.out.println("You have entered number Four");
		}
		else if (n==5){
			System.out.println("You have entered number Five");
		}
		else if (n==6){
			System.out.println("You have entered number Six");
		}
		else if (n==7){
			System.out.println("You have entered number Seven");
		}
		else if (n==8){
			System.out.println("You have entered number Eight");
		}
		else if (n==9){
			System.out.println("You have entered number Nine");
		}
		else if (n==10){
			System.out.println("You have entered number Ten");	
		}
		
		else
		{
			System.out.println("Invalid Value");
		}
		
   }
}