package DataStructer_Algo.FirstJava;

import java.util.Scanner;


//Take 2 numbers as input and print the largest number

public class LargestNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the first number: ");
		long num1 = in.nextLong();
		System.out.println("enter the second number: ");
		long num2 = in.nextLong();
		
		if(num1 > num2)
		{
			System.out.println(num1+ " is the largest number.");
		}
		else {
			System.out.println(num2 +" is the largest number.");
		}
		
	}

}
