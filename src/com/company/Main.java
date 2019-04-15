package com.company;
import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
/*
Project: Lab 13
Purpose Details:
Course: IST 242
Author: JiaJia Liu
Date Developed: 4/11/19
Last Date Changed: 4/14/19
Revision:
*/
public class Main {

	public static void testInt() {
		Scanner scnr = new Scanner(System.in);
		String input;
		int number;

		try {
			System.out.print("\nInteger");
			System.out.print("\nEnter an integer: ");
			input = scnr.nextLine();
			number = Integer.parseInt(input);
			System.out.println("This is an integer: " + number);
		}
		catch (NumberFormatException notAnInt) {
			System.out.print("This is not an integer!");
			testInt();
		}
		//Prompt user to continue/quit
		//System.out.print("\nEnter any key ('q' to quit): ");
		//quit = scnr.next().charAt(0);
	}

	public static void testFloat() {
		Scanner scnr = new Scanner(System.in);
		String input;
		float number;

		try {
			System.out.println("\nFloat");
			System.out.println("Enter a float number: ");
			input = scnr.nextLine();
			number = Float.parseFloat(input);
			System.out.println("This is an Float Number: " + number);
		}
		catch (NumberFormatException notAnFlo) {
			System.out.print("This is not an Float Number!");
			testFloat();
		}
	}
/*
	public static void testString() {
		Scanner scnr = new Scanner(System.in);
		String input;

		try {
			System.out.println("\nString");
			System.out.println("Enter a String: ");
			input = scnr.nextLine();
			if (scnr.hasNextInt()) {
				throw new Exception("Entered input is integer, Please enter a String.");

			}
			else if (scnr.hasNextFloat()) {
				throw new Exception("Entered input is float, Please enter a String.");
			}
			else {
				System.out.println("This is String: " + input);
			}
		}

		catch (Exception string) {
			System.out.print(string.getMessage());
			//System.out.print("This is not an Float Number!");
			testString();
		}

	}
*/
	public static void testString() {
		Scanner scnr = new Scanner(System.in);

		try {
			System.out.print("Enter a String: ");
			if (scnr.hasNextInt()) {
				throw new Exception("Entered input is an integer");
			}
			if (scnr.hasNext()){
				String string = scnr.nextLine();
				if(string.length()>1){
					System.out.println("Entered input is String");
				}
				else {
					throw new Exception("Entered input is not a String");
				}

			}
		}
		catch (Exception notString) {
			System.out.println(notString.getMessage());
			testString();
		}
	}

	public static void testArray() {
			Scanner scnr = new Scanner(System.in);

			try {
				System.out.println("ArrayList");
				System.out.print("Enter an ArrayList of 3 integers(Separate by a comma(,)): ");
				String str = scnr.nextLine();
				String[] array = str.split(",");

				for (String a : array) {
					Integer num = Integer.parseInt(a);
					System.out.println(a);
				}
				if (array.length > 3) {
					throw new ArrayIndexOutOfBoundsException("More than 3.");
				}
			}
				catch (ArrayIndexOutOfBoundsException moreThan3) {
					System.out.println("Invalid input, be sure to not enter more than 3 integers or a alpha character. Please try again.");
					testArray();
		}
			catch (NumberFormatException notAnInt) {
			System.out.print("Invalid input, be sure to not enter more than 3 integers or a alpha character. Please try again.");
			testArray();
	}
		}

	public static void testFileName() {
		Scanner scnr = new Scanner(System.in);
		FileWriter fileW = null;


		try {
			System.out.print("Enter File Name: ");
			String name = scnr.nextLine();
			File file = new File(name);
			file.createNewFile();

			// fix
			throw new IOException();
		} catch (IOException e) {

			testFileName();
		}
	}

		/*

			//file = new Scanner(new File(fileName));
			//File file = new File(fileName);
		/*
			try {
				System.out.println("FileName");
				System.out.print("Enter File Name: ");
				fileName = scnr.nextLine();
				fileW = new FileWriter(fileName);
				if() {

				}
				FileInputStream file = new FileInputStream(fileName);
				throw new FileNotFoundException("Invalid flie name, please try again.");
			}
			catch (FileNotFoundException f) {
				System.out.println(f.getMessage());
				testFileName();
			}
			//File file = new File(fileName);
					//System.out.println(file.nextLine());
			//throw new IOException();
		}

				catch (IOException e) {
					System.out.println("Invalid flie name, please try again.");
					testFileName();
				}
*/



    public static void main(String[] args) {
		//testInt();
		//testFloat();
		//testString();
		//testArray();
		testFileName();

    }
}

