import java.util.*;
public class Addition {

	public static void main(String args[]){
	
	Scanner input = new Scanner(System.in);
	
	int number1;
	int number2;
	int sum;
	
	System.out.print("Enter First Number: ");
	number1 = input.nextInt();
	
	System.out.println("Enter Second Number: ");
	number2 = input.nextInt();
	
	sum = number1 + number2;
	
	System.out.println("The Sum of " + number1 + " and " + number2 + ": " + sum);
	}
}