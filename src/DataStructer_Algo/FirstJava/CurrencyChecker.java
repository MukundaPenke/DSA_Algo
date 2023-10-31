package DataStructer_Algo.FirstJava;

import java.util.Scanner;


//Input currency in rupees and output in USD.

public class CurrencyChecker {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("enter currency in Indian Rupees: ");
		double input = in.nextDouble();
		
		//assuming 1 USD = 75 INR
		double num = 75.0;
		double dollar = (input / num); 
		
		System.out.println("The value of "+input+ " INR is "+dollar+ " U.S Dollars");
	
	}
		
	}
