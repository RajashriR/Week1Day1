package Selenium;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class ArmsrtongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int armnum=153;
    int num , original;
    int calculation=0;
    original = armnum;
    
    //Determining the last digit of the number
    
    while (armnum >0)
    {
    	//Calculating remainder
     num = armnum % 10  ;	
    calculation = calculation + ( num * num* num);
     
    //removes last digit 
    armnum= armnum/10;
                }
    System.out.println("The calculated Armstrong numnber is "+ calculation);
    
    //Comparing and printing output
    
    if (calculation == original)
		System.out.println("Yes,It is a Armstrong number");
	else
		System.out.println("No, It is not a Armstrong number");

    }
	}


