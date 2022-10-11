package com.gl.lab2.question2;

public class CurrencyCounter {
	public void currencyCounter(int[] notes, int amount) {
		
		int[] noteCounter= new int[notes.length];
		int size=notes.length;
		int temp=amount;
			for (int i = 0; i < noteCounter.length; i++) {
				amount=temp;

				try {
					for (int j = i; j < size; j++) {
						if(amount>=notes[j]) {
							noteCounter[j]=amount/notes[j];
							amount = amount%notes[j];
						}
					}
					if(amount>0) {
						noteCounter=new int[notes.length];
					}
					if(amount==0) {
						break;
					}
				}catch(ArithmeticException e) {
					System.out.println(e + "notes of denomination 0 is invalid");
				}
			}
			if (amount>0) {
				System.out.println("Amount cannot be exactly paid with the available denominations");
			}
			if (amount==0) {
				System.out.println("\nYour payment approach will be as follow:");
				for (int i = 0; i < noteCounter.length; i++) {
					if(noteCounter[i] !=0) {
						System.out.println(notes[i] + ":" + noteCounter[i]);
					}
				}
			}
	}

}
