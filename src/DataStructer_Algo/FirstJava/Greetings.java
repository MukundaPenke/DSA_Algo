package DataStructer_Algo.FirstJava;

import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter Name: ");
		String name = in.nextLine();
		
		System.out.println("Hello "+name+ " Good Afternoon");
	}

}
