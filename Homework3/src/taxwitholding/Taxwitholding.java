package taxwitholding;

import java.util.Scanner;

public class Taxwitholding {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		int income = sc.nextInt();
		System.out.println("Enter weekly income");
		double taxRate , total_tax;
		if(income < 500) 
		{
			taxRate = 0.10;
		}
		else if(income < 1500) 
		{
			taxRate = 0.15;
		}
		else if(income <2500) 
		{
			taxRate = 0.20;
		}
		else {
			taxRate = 0.30;
		}
		total_tax = income * taxRate;
		System.out.println("Weekly average tax witholding is: $" + total_tax);
		sc.close();
		}
	
		
	}
