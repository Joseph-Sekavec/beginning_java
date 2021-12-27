package sets_and_lists;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class sets_and_lists 
{
	public static void main(String[] args)
	{
		Set<Integer> t = new HashSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(5);
		t.add(9);
		System.out.println(t);
		boolean x = t.contains(5);

		// Remove elements:

		t.remove(9);
		System.out.println(t);
		t.clear();
		System.out.println(t);
		
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1); // Like push_back or append.
		l.get(0); // Return element at index 0.
		l.add(2);
		l.set(1,5); // Set element at index 1 to 5.
		l.subList(1,2); // Means we go from elements 1 to 3.
		l.add(1);
		l.add(4);
		l.add(7);
		System.out.println("Here we begin the list section: \n");
		System.out.println(l);
		l.remove(1); // Removes element at index, not element itself.
		System.out.println(l);
		
		// System.out.println(l.subList(1, 4));
	}
}
