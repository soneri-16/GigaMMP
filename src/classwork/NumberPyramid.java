package classwork;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number between 0 and 100 (non-inclusive): ");
		
		int level = s.nextInt();
			
		for(int i = 1; i <= level ; i++) {
			
			// Initial spacing if level < 10
			if (level < 10) {
				for (int k = 1; k <= level - i; k++) {
					 System.out.print(" ");
				}
			}

			// Initial spacing if level > 10 and < 99
			else {
				for (int k = 1; k <= level - i; k++) {
					 System.out.print("  ");
				}
			}
			
			// In-between spacing
			for (int j = 1; j <= i; j++) {
				if (i >= 10) {
					System.out.print(i + "  ");
				} else {
					System.out.print(i + "   ");
				}
			}
			
			// New line
			System.out.println();
			
		}
	}
}
