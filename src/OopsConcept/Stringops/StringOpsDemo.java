package OopsConcept.Stringops;

public class StringOpsDemo {

	public static void main(String[] args) {
		
		char[] myname = {'p','a','t'} ;
		String mynam = "pat";
		
		String my = " Selenium automates browsers. That's it! ";
		
		System.out.println("my : " +  my);
		System.out.println("mylength :" + my.length());
		my  = my.trim();
		System.out.println("aftet trim : "+my.length());
		//--------------------------------------
		
		String my1 = "abc";
		String my2 ="wow";
				
		System.out.println("equals : "+my1.equals(my2));
		System.out.println("equals : "+my1.equals("abc"));
		System.out.println("equals : "+my1.equals("ABC"));
		System.out.println("equals ignore : "+my1.equalsIgnoreCase("ABc"));
		
		//-----------------------------------------
		String mmy = my.substring(9);
	 System.out.println("Substring :" +mmy);	
	
	 
	        mmy = my.substring(9, 17);
	 System.out.println("Substring :" +mmy);	
		
	 //-----------------------------------------------
	System.out.println(my.replace("Selenium", "Webdriver"));
	System.out.println(my.replace("!", "?"));
	System.out.println(my.replaceFirst("Selenium", "Java"));
	//-----------------------------------------------
	System.out.println("Find Char length :" + my.charAt(15));
	
	//-------------------------------------------
	
		String[] mystr = my.split(" ");
		System.out.println("Delimeter  before :" +mystr.length);
		for(String ele :mystr) {
			System.out.println("Delimeter after :" +ele);
			
		}
		
				
		
	}

}
