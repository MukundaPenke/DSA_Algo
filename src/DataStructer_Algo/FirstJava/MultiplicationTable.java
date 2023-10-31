package DataStructer_Algo.FirstJava;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input =  in.nextInt();
        
        System.out.println("Multiplication of table: "+input);
        for(int i=1; i<=10; i++)
        {
        	System.out.println(input +" x " +i + " = "+ (i*input));
        }
    }
}
