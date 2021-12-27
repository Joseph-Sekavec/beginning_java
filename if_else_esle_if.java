package if_else_esle_if;
import java.util.Scanner;

public class if_else_esle_if 
{
	private String name;
	
	public void set_name(String n)
	{
		name = n;
	}
	
	public String get_name()
	{
		return name;
	}
	
	public static void main(String[] args)
	{
		/*Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if (s.equals("tim"))
		{
			System.out.println("You typed \"tim\".");
		}
		else if (s.equals("hello"))
		{
			System.out.println("Hi!");
		}
		else
		{
			System.out.println("You did not type \"tim\" or hello.");
		}
		System.out.println("Print");*/
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//System.out.println(s);
		int age = Integer.parseInt(s);
		//double Age = Double.parseDouble(s);
		
		if (age >= 18)
		{
			System.out.println("You are an adult.");
			System.out.println("What is your fav food: ");
			String food = sc.nextLine();
			if (food.equals("pizza"))
			{
				System.out.println("Mine too");
			}
			else
			{
				System.out.println("Thou art a heretic");
			}
		}
		else if (age >= 13)
		{
			System.out.println("You are a teenager.");
		}
		else
		{
			System.out.println("You are a child.");
		}
		
	}
	
	
		
}
