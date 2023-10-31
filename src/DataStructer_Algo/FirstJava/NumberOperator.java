package DataStructer_Algo.FirstJava;

import java.util.Scanner;


//Take in two numbers and an operator (+, -, *, /) 
//				and calculate the value. (Use if conditions)
public class NumberOperator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1 = in.nextDouble();
		System.out.println("Enter second number: ");
		double num2 = in.nextDouble();
		
		System.out.println("enter a operator(+,-,*,/): ");
		char operator = in.next().charAt(0);
		
		double result = 0.0;
		if(operator == '+')
		{
			 result = num1 + num2;
		}
		else if(operator == '-'){
			 result =num1 - num2;
		}
		else if(operator == '*'){
			 result = num1 * num2;
		}
		else if(operator == '/'){
			if(num2 != 0) {
			 result = num1 / num2;
			}
			else {
				System.out.println("cannot divide by zero");
				return;
			}
		} else {
				System.out.println("invalid Opeator");
			}
		
		System.out.println("Result: "+num1 +" " 
				+operator+ " "+num2+ " = " +result);
		}
	}
