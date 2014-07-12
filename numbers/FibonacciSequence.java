import java.util.*;
public class FibonacciSequence {

	/**
	 * Fibonacci Sequence class is solution to problem from Karan projects:
	 * 
	 * https://github.com/karan/Projects
	 * 
	 * Fibonacci Sequence - Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number.
	 */
	public static void main(String[] args) 
	{

		int a = 0, b = 1, c = 0, count = 0;
		Scanner scan = new Scanner (System.in);
	
		System.out.println ("Enter nth number to calculate Fibonacci Sequence: ");
		int num = scan.nextInt();
		
		// Loop until nth number
		while (count < num)
		{
			c = a + b;
			a = b;
			b = c;
			count++;
			
				
		}
		
		System.out.println("Fibonacci at nth number is: " + c);
		
	}

}
