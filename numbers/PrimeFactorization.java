 
import java.util.*;
/**
 * 
 * Solution for Numbers / Prime Factorization problem on Karan projects - Github: https://github.com/karan/Projects.
 * 
 * Prime Factorization - Have the user enter a number and find all Prime Factors (if there are any) and display them. 
 * 
 * 
 * @author Hedgehog01
 * @version 14.07.2014
 *
 */
public class PrimeFactorization {
	/**
	 * Method that returns the prime factors of a number
	 * @param num the number to find prime factors for
	 * @return int array with the prime factors found for the number
	 */
	public static int[] findPrimeFactor (int num)
	{
		//array that will keep the prime factorizations
		int [] factors= new int [num/2];
		int prime = 2; // first prime to try
		int index = 0; //array index
		while (num !=1)
		{
			if (num % prime == 0)
			{
				num = num / prime;
 				factors[index] = prime; //save the fac
				index++;
			}
			else
				prime = getNextPrime (prime, num);

		}
	
		return factors;
	}
	
	/*
	 * private method that return the next prime number to try.
	 */
	private static int getNextPrime (int prime, int num)
	{
		if (isPrime(num)) //check if the current number is already a prime - if so return it.
			prime = num;
		else //find next best prime
		{
			prime++;
			while (!isPrime(prime) && prime < num)
			{
				prime++;
			}
		}
		return prime;
	}
	
	/*
	 * private method that checks if a number is a prime number.
	 */
	private static boolean isPrime(int num)
	{
		boolean bool = true;
		for (int i=2; i<num && bool;i++)
		{
			if (num%i==0)
				bool = false;
		}
		return bool;
		
	}
	
	/*
	 * private method to print an array
	 */
	private static void printArr (int [] arr,int num)
	{
		for(int i=0; i<arr.length;i++)
		{
			if (arr[i] != 0) 
				System.out.print(arr[i] + " X ");
			
		}
		System.out.print("1 = " + num);
		System.out.println();
	}
	
	
	/*
	 * class driver
	 */
	public static void main(String[] args) 
	{
		int num = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Please enter number to find Prime factors of: ");

		num = scan.nextInt();
		
		printArr (findPrimeFactor (num),num);
		

	}

}
