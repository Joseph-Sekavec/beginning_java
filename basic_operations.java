package basic_operations;

public class basic_operations {
	
	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		double g = 7;
		int z = 57;
		int sum = x + y + z;
		int u = z/y;
		double w = z/y;
		double h = z/g;
		double d = Math.pow(x, y);
		// Java is very object oriented, ergo we go
		// Math.power(base, power) as Math is a class/package.
		// Java, like c++ has trouble converting double to int.
		
		System.out.println(sum);
		
		System.out.println(x+y+z);
		System.out.println((-1)*sum);
		System.out.println("Truncated: " + u);
		System.out.println(w); // Obviously incorrect.
		// In order to get a double, at least one of our numbers
		// being multiplied or divided must be a double.
		System.out.println(h);
		// We can do type cast
		
		double i = x/(double)y;
		// Note that we don't say static_cast<double>(var)
		// Nor do we do double(y) like in c++ and Python.
	
		int q = 56 % 5; // See, mod is the same.
		System.out.println(q);
		
		
	}


}
