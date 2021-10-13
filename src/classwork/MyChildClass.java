package classwork;

class MyChildClass extends MyParentClass {

		   MyChildClass() {
			   //super();
			System.out.println("MyChildClass Constructor");
			
		   }
		   
		   public static void main(String args[]) {
			//MyParentClass obj = new MyChildClass();
			   MyChildClass obj =  new MyChildClass();//you can also write only ( new MyChildClass())
		   }

}
