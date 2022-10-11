package com.gl.lab2.question1;

import java.util.Scanner;

public class CheckTargetAmount {
	public void checkTargetAmount( int noOfTargets, int arr[]) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<noOfTargets; i++) {
			System.out.println("Enter the value of target");
			int target=sc.nextInt();
			long sum=0;
			boolean targetAchieved=false;
			for(int j=0; j<arr.length;j++) {
				sum+=arr[j];
				if(sum>target) {
					targetAchieved=true;
					System.out.println("Target achieved after "+(j+1)+" transactions"+"\n");
					break;
				}
			}
			if(!targetAchieved) {
				System.out.println("Given target is not achieved"+"\n");
			}
		}
		sc.close();
	}
}
