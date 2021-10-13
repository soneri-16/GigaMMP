package UsingException;

public class Trycatchprogram {
	
	int a =0;
	int b=2;
	int c;
	
	public void simple(){
		try {
	  c=b/a;
		System.out.println("divide by is allowed");

		}catch (ArithmeticException e) {
	System.out.print("divide by zero not allowed");
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		
		Trycatchprogram obj = new Trycatchprogram();	
		
		obj.simple();
		
		
		
		int[] myArr = { 34, 9, 7, 9};
	      System.out.println(myArr[0]);
	      System.out.println(myArr[2]); 
	     // System.out.println(myArr[5]);
	      
	      try {
			Thread.sleep(5000);// it is forcing user to handle the exception - in 2 ways - try catch or throws
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
	      System.out.println("After Sleep");
	      
	     
	}
}
