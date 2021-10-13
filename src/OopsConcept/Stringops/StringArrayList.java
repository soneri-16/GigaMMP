package OopsConcept.Stringops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class StringArrayList {

	public static void main(String[] args) {
		
		List<String> a1 = new ArrayList<String>();
		
		a1.add("Selenium");
		a1.add("automates");
		a1.add("browers");
		a1.add("what");
		a1.add("you");
		a1.add("do");
		a1.add("with");
		a1.add("that");
		a1.add("power");
		a1.add("is");
		a1.add("entirely");
		a1.add("up");
		a1.add("to");
		a1.add("you");
		
		System.out.println("length:" +a1);
		
		System.out.println("size :" +a1.size());
		System.out.println("Remove :" +a1.remove(0));
		System.out.println("Add :" + a1.set(0, "Webdriver"));
		
		a1.set(0, "Webdriver");
		printUsingIterator(a1);
		System.out.println();

		System.out.println("length:" +a1);
		
		System.out.println("Contains :" +a1.contains("you"));
		System.out.println("get :" +a1.get(2));
		System.out.println("Empty :" +a1.isEmpty());
		System.out.println("length:" +a1);
		
		
		
		Collections.sort(a1);
		System.out.println("Sorting :" +a1);

		Collections.reverse(a1);
		System.out.println("Reverse :" +a1);
		
		Collections.shuffle(a1, new Random(20));
		System.out.println("Shuffle :" +a1);
		
		System.out.println("Minium :" +Collections.min(a1));
		System.out.println("Maximum :" +Collections.max(a1));

		
		
			
	}

	private static void printUsingIterator(List<String> arlist)   {
		Iterator<String> it = arlist.iterator();
		System.out.println("Print Using Iterator :");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
