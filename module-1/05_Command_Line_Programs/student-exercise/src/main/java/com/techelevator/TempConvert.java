package com.techelevator;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		/*
		The Fahrenheit to Celsius conversion formula is:

		    Tc = (Tf - 32) / 1.8

		where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit

		The Celsius to Fahrenheit conversion formula is:

		    Tf = Tc * 1.8 + 32

		Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit. Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.

		```
		Please enter the temperature: 58
		Is the temperature in (C)elcius, or (F)arenheit? F
		58F is 14C.
		```
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the temperature: ");
		int temp = input.nextInt();
		input.nextLine();
		
		System.out.print("Is the temperature in (C)elsius, or (F)arenheit? ");
		String measurement = input.nextLine();
		
		if (measurement.equalsIgnoreCase("C")) {
			float f = (temp * (float) 1.8) + 32;
			System.out.println(temp + "C is " + (int) f + "F");
		}
		else if (measurement.equalsIgnoreCase("F")){
			float c = (temp - 32) / (float) 1.8;
			System.out.println(temp + "F is " + (int) c + "C");
		}
	}
}
