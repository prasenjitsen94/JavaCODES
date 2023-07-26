package smriti_practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList a1= new ArrayList();

		//ArrayList <String> a1= new ArrayList <String>();

		a1.add(100);
		a1.add("Welcome");
		a1.add(15.5);
		a1.add('A');
		a1.add(true);
		System.out.println(a1);

		System.out.println(a1.size());
		a1.remove(2);
		System.out.println("After remove element:" + a1);
		System.out.println("After remove elements size of the arralist: " + a1.size());
		a1.add(2,"smriti");
		System.out.println("After adding a new element: " + a1);
		a1.set(3,"Cat");
		System.out.println("After replace index 3:" + a1);
		System.out.println(a1.get(2));
		System.out.println(a1.contains("Cat"));
		System.out.println(a1.contains("Cow"));
		System.out.println("Arraylist is empty:" + a1.isEmpty());

		System.out.println("Reading elements using for each loop........");

		for(Object e: a1)
		{
			System.out.println(e);
		}

		System.out.println("Reading elements using iterator........");

		Iterator it= a1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		ArrayList a1dup= new ArrayList();
		a1dup.addAll(a1);
		System.out.println("Adding duplicate value: " + a1dup);

		a1dup.removeAll(a1dup);
		System.out.println("After removing elements from :" + a1dup);

		a1dup.addAll(a1);
		System.out.println(a1dup);

		a1.removeAll(a1);
		System.out.println("After remove elements:" + a1);

		a1.add("X");
		a1.add("B");
		a1.add("Y");
		a1.add("A");
		a1.add("C");
		a1.add("Z");
		a1.add("D");

		System.out.println(a1);

		Collections.sort(a1);
		System.out.println("After sorting the value: " + a1);
		Collections.sort(a1,Collections.reverseOrder());
		System.out.println("After sorting in reverse order: " +a1);

		Collections.shuffle(a1);
		System.out.println("After shuffle the elements: " + a1);

		int a[]= {1,2,3,4,5};

		ArrayList c= new ArrayList();

		for(int value: a)
		{
			//ArrayList b= new ArrayList(Arrays.asList(value));
			c.add(value);
			//System.out.println(b);
		}

		System.out.println(c);

		




	}

}
