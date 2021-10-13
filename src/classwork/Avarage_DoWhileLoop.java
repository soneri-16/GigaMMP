package classwork;

public class Avarage_DoWhileLoop {

	public static void main(String[] args) {
		
		
		int avg= 1;
		int in =0;
		int div =0;
		do {
			
			in = in+avg;
			System.out.println("In loop number : " +in);
			
			avg++;
			
	   }while(avg<=7);
		
		div= in/7;// float in /(i-1)
		System.out.println(div);
		
		
		
		
	}

}
