package com.gl.lab2.question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the size of the currency denominations array");
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		int[] notes= new int[size];
		System.out.println("Enter the currency denominations in unordered format");
		for (int i = 0; i < notes.length; i++) {
			notes[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount= sc.nextInt();
		MergeSort ms= new MergeSort();
		ms.mergeSort(notes, 0, size-1);
		//System.out.println("Printing Denominations after sorting in descending order:");
		//ms.display(notes);
		CurrencyCounter cc= new CurrencyCounter();
		cc.currencyCounter(notes, amount);
		sc.close();

	}

}
