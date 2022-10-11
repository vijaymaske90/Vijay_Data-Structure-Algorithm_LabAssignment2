package com.gl.lab2.question1;

import java.util.Scanner;

public class PayMoney {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//size of array
		System.out.println("Enter the size of transaction array");
		int sizeOfTransaction=sc.nextInt();
		int arr[]=new int[sizeOfTransaction]; //array creation with input size
		System.out.println("Enter the values of array");
		
			//storing input values in array 
			for(int i=0; i<arr.length; i++) {
					arr[i]=sc.nextInt();
				}
		//input numbers of targets
			System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTargets=sc.nextInt();
		CheckTargetAmount cta =new CheckTargetAmount();// object creation to check targets
		cta.checkTargetAmount(noOfTargets, arr);//checking the targets
		sc.close();

	}


}
