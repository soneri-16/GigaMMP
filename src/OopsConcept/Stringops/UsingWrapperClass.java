package OopsConcept.Stringops;

public class UsingWrapperClass {

	public static void main(String[] args) {

//		//byte-Byte, short-Short etc
//	//	Integer j = 789;//Integer- is object - not data type
		
		
		
		int i =2;
		String myval;
		myval = Integer.toString(i);
	//	myval = String.valueOf(i);
		System.out.println("Myval : "+myval);		
		
		Float j = 5789.67f;//float j = 5789.67f will also work 
		String myfloat;
		myfloat = Float.toString(j);
	   //myfloat = String.valueOf(j);
		System.out.println("myfloat : " +myfloat);
		
		String intval ="876";
		int myint = Integer.valueOf(intval);
		System.out.println("myint : "+(myint +1));
		
		String fval = "98763.498434d";
		double mydouble = Double.valueOf(fval);
		System.out.println("mydouble :" +mydouble);
		
		
		
		String flong = "80458558445";
		long mylong = Long.valueOf(flong);
		System.out.println("mylong : " +mylong);
		
		
		
		int a = 1;
		Integer p = a;  //Auto boxing - compiler does it
		
		Integer k = 7;
		int f = k;      // Unboxing
		
	}

}
