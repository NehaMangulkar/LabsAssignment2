package com.learning;

import java.util.Scanner;

import com.learning.paymoney.PayMoney;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days ");
		int n = sc.nextInt();

		int transactions[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter transaction for the day: " + (i + 1));
			transactions[i] = sc.nextInt();
		}
		displayTransaction(transactions);
		
		

		int noOftarget;
		System.out.println("Enter the total no of targets that needs to be achieved");
		noOftarget = sc.nextInt();

		PayMoney p = new PayMoney();
		int target = 0;
		int res=0;
		for (int i = 0; i < noOftarget; i++) {
			System.out.println("Enter the value of target");
			target = sc.nextInt();
			 res= p.numberOfDayTransaction(transactions, target);

		
		
		
		 if(res==-1)
		 {
			 System.out.println("The target " + target + "is not achieved");
		 }
		 else
		 {
			 System.out.println("The target " +target+ " is achieved in "+ res +" number of days");
		 }
		}
	}

	private static void displayTransaction(int[] transactions) {
		for(int i=0;i<transactions.length;i++)
		{
			System.out.println(transactions[i]);
		}
		
	}

}
