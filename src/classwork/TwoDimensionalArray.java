package classwork;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] array ={{11, 12, 13, 1},
		               {21, 22, 23, 24},
			           { 31, 32, 33, 34},
				       { 51, 52, 53, 54}};
		int c=0,d=0;
		for(int i =0; i<array.length;i++) {
			
	     	for(int j= 0; j< array[i].length;j++) {
	     		
	     		
	     		System.out.print(array[i][j]+"\t");
	     		 c= c+array[i][j];
	     		System.out.println(c);
	     	}
	     	
	         d= d+c;
		}
	    	System.out.println(d);
	    

	}

}