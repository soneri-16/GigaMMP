package OopsConcept;

public class SimpleOverloadContruct {
	int a,b,c,n;

	SimpleOverloadContruct(int a){
		
		this.a=a;
	}
	
	
      SimpleOverloadContruct(int a, int b){
		
	 this.n=a;
		this.b=b;
	}

      SimpleOverloadContruct(int a, int b,int c){
  		
  		this.a= a;
  		this.b=b;
  		this.c=c;
  	}

		
	public static void main(String[] args) {
		
		
		SimpleOverloadContruct obj = new SimpleOverloadContruct(89);
		System.out.println(obj.a);
		SimpleOverloadContruct obj2 = new SimpleOverloadContruct(68,7);
		System.out.println(obj2.n +"  "+obj2.b);
		SimpleOverloadContruct obj3 = new SimpleOverloadContruct(8,7,8);
		System.out.println(obj3.a +"  "+obj3.b +" " +obj3.c);

	}
		

}
