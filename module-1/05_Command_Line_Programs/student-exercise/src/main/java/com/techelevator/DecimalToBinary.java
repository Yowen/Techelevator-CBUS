package com.techelevator;
import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		/*
		Write a command line program which prompts the user for a series of decimal integer values s
		eparated by spaces. Each decimal integer is displayed along with its equivalent binary value.

		```
		Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

		460 in binary is 111001100
		8218 in binary is 10000000011010
		1 in binary is 1
		31313 in binary is 111101001010001
		987654321 in binary is 111010110111100110100010110001
		*/
		
		Scanner input = new Scanner(System.in);
		long[] array = new long[5];
		
		System.out.print("Please enter in 5 decimal values (separated by spaces): ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (long) input.nextLong();
			String binary = Integer.toBinaryString((int)array[i]);
			System.out.println(array[i] + " in binary is " + binary);
		}
	}
}
