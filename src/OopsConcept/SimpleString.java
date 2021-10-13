package OopsConcept;

public class SimpleString {
	
	String username;
	String password;
    String login;
    
    public void uname() {// no return no parameter
    	
        login = username + password;
        System.out.println("No return and No parameter: " +login);
    }	
	
    
    public void uname(String usern, String password) { // no return with parameter
    	
       login = usern + password;
         System.out.println("No retrun with Parameter: " +login);
    }
    
    public String usern() { //  return no parameter
    	
    	login = username + password;
    	return login;
    	
    }
    
    public String userpassword(String a, String b) {
    	
    	
    	if(a.equals("admin")) {
    		
    		return "loging successful for user";
    	}else {
    		return "Try again";		
    	}	
    	
    }
	

	public static void main(String[] args) {

		SimpleString obj = new SimpleString();
		obj.username = "Hello";
		obj.password = "World";
		String a = "admin";
		String b ="Successful";
		
		obj.uname();
		
		obj.uname("Wel","Come");
		
		System.out.println("Return without parameter: " + obj.usern());
	
		obj.userpassword("admin","Successful");    //main important point
		
		System.out.println("return with parameter: " +obj.userpassword(a, b));
		
		
	}

}
