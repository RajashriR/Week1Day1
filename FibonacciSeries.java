package Selenium;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			/*
			 * Goal: To find Fibonacci Series for a given range
			 * 
			 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
			 * 
			 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
			 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
			 * enter
			 * 
			 * What are my learnings from this code? 1) 2) 3)
			 * 
			 */

				// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
                int range =8 ,firstnum = 0, secnum =1 , sum;
				// Print first number
				System.out.println(firstnum);
				// Iterate from 1 to the range
				for ( int i= 1 ; i <= range ; i++) {
				// add first and second number assign to sum
                sum = firstnum + secnum ;
                
				// Assign second number to the first number
              System.out.println(sum);
            		   firstnum=secnum;
				// Assign sum to the second number
            		   firstnum = secnum;
            		   secnum=sum;
				// print sum

			}

		}
	}


