package classwork;

public class Fibbonacci_forloop {

	public static void main(String[] args) {
		
    int a;
    int b = 0;
    int n= 1;
 
    
    for(a=1;a<15; a++)
    {
   
    	System.out.println(a);
    	
    	int sum =b+n;
    	b=n;
    	n=sum;
    	System.out.println("It is Fibbonacci value : " +b);
    	
    	
    }

    
    
    
    
    
    
    
	}

}
