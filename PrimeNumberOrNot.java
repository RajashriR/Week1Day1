package Selenium;

public class PrimeNumberOrNot {
	// Declare an int Input and assign a value 13
	public static void main(String[] args) {
	int p =13;
			// Declare a boolean variable flag as false
	boolean flag = false;    	
			// Iterate from 2 to half of the input

	for ( int i =2; i <= p/2 ; i++)	
	{

				// Divide the input with each for loop variable and check the remainder
if (p/2 == 0)
{			

				// Set the flag as true when there is no remainder
 flag = true;
					// break the iterator
 break;
}
	}
			// Check the flag (Provide a condition)

			if(!flag)
			
				System.out.println(p + " is a prime number");
			else
				System.out.println(p + " is not a prime number");

				// Print 'Prime' when the condition matches

	}				// Print 'Not a Prime' when the condition doesn't match 
}
