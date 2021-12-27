package input_and_scanners;
import java.util.Scanner; // We import like Python...
// java.util.Scanner seems similar to istream.

public class input_and_scanners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		// Scanner is a data type from java.util.Scanner
		// System.in just means type in line from user.
		String sca = sc.next();
		// We make a string variable, and initialize it with
		// sc.next(). sc.next() gets the thing you inputed. 
		
		System.out.println(sca);
		
		Scanner scab = new Scanner(System.in);
		int scb = scab.nextInt();
		System.out.println(scb);
		

	}

}
