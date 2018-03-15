package mywork;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		GreatestNumberTest test=new GreatestNumberTest();
		
		System.out.println("Enter first number:");
		int a=scan.nextInt();
		System.out.println("Enter second number:");
		int b=scan.nextInt();
	   System.out.println("Enter third number: ");
	   int c=scan.nextInt();
	   
	   test.getGreatestNumber(a,b,c);
		
	    

	}

}
