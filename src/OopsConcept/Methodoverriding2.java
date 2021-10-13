package OopsConcept;

public class Methodoverriding2 extends MethodOverriding{

	public void show() {
		
		System.out.println("Job");
	}
	
	public static void main(String[] args) {
		
		MethodOverriding obj = new MethodOverriding();
		
		obj.show();
		
       Methodoverriding2 obj2 =  new Methodoverriding2();
		
		obj2.show();
		
	}

}
