package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter first no.");
			
			int fno = sc.nextInt();
			
			System.out.println("enter second no.");
			
			int sno = sc.nextInt();
			
			double division = fno/sno;
			
			System.out.println("division of given no is : " + division);
			
		}
		catch(Exception e){
			if(e instanceof ArithmeticException) {
				System.out.println("dont't enter zero as denominator");
			}
			else if(e instanceof InputMismatchException) {
				System.out.println("please pass only numeric value");
			}
		}
		finally {
			System.out.println("He Ha");
		}
		
		System.out.println("are are");
		System.out.println("kya haal");
		System.out.println("are nahi nahi");
	}
}
