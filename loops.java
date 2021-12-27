package loops;
import java.util.Scanner;

public class loops 
{
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		
		// 
		
		for (int i=0; i<arr.length; i++)
		{
			// arr.length, not arr.length()
			if(arr[i] == 5)
				System.out.println(arr[i]);
		}
		
		String[] names = new String[5];
		
		for (int i : arr)
		{
			System.out.println(i);
		}
		
		
		// while loops
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
//		  while(x != 10) 
//		  { 
//		  System.out.println("Type 10..");
//		  System.out.print("Type a number: "); 
//		  x = sc.nextInt();
//		  
//		  }
		 
		do
		{
			System.out.print("type a number: ");
			x = sc.nextInt();
		}
		while(x != 10);
		
		
		
	} // End of main
	


} 
