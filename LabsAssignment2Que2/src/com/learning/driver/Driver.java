package com.learning.driver;

import java.util.Scanner;

import com.learning.currency.Currency;
import com.learning.notescount.NotesCount;
import com.learning.sort.Sort;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of currency denominations");
		int numberofDenominations= sc.nextInt();
		
		int denominations[] = new int[numberofDenominations];
		System.out.println("Enter the currency denominations");
		for(int i=0;i<numberofDenominations;i++)
		{
			denominations[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		for(int i=0;i<numberofDenominations;i++)
		{
			System.out.println(denominations[i] +" ");
		}
		System.out.println();
		
		Currency currency = new Currency(denominations,numberofDenominations);
		//MergeSort.sort(currency.denominations,0,numberofDenominations);
		
		Sort.bubbleSort(currency.denominations);
		
		for(int i=0;i<numberofDenominations;i++)
		{
			System.out.println(currency.denominations[i] +" ");
		}
		System.out.println();
		
		NotesCount.numberofDenomination(currency.denominations, amount);
	}

}
