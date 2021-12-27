package conditions_and_booleans;

public class conditions_and_booleans 
{
	public static void main(String[] args)
	{
		int x = 6;
		int y = 7;
		int z = 10;
		String s = "hello";
		String S = "Hello";
		boolean compare = x != y;
		// Our booleans are ==, <,>,<=,>=, !=
		boolean Compare = x>y && z<y;
		boolean COMPARE = (x<y || z<y);
		// && is and, || is or.
		
		System.out.println(compare);
		System.out.println(Compare);
		System.out.println(COMPARE);
		System.out.println(S.equals(s));
	}

}
