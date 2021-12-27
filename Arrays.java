package Arrays;
import java.util.Scanner;

public class Arrays 
{

	public static void main(String[] args)
	{
		int[] newArr = new int[5];
		String[] newstr = new String[5];
		// {"hello", "hi", "tim","bill","joe"};
		Scanner sc = new Scanner(System.in);
		
		String x = newstr[4];
		
		for(int i = 0; i<3; i++)
		{
			String s = sc.nextLine();
			newstr[i] = s;
			System.out.println(newstr[i]);
		}
		
	}
}
