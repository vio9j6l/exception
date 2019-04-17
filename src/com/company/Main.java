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
        } catch (NumberFormatException notAnInt) {
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
        } catch (NumberFormatException notAnFlo) {
            System.out.print("This is not an Float Number!");
            testFloat();
        }
    }

    public static void testString() {
        Scanner scnr = new Scanner(System.in);

        try {
            System.out.print("Enter a String: ");
            if (scnr.hasNextInt()) {
                throw new Exception("Entered input is an integer");
            }
            if (scnr.hasNext()) {
                String string = scnr.nextLine();
                if (string.length() > 1) {
                    System.out.println("Entered input is String");
                } else {
                    throw new Exception("Entered input is not a String");
                }

            }
        } catch (Exception notString) {
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
        } catch (ArrayIndexOutOfBoundsException moreThan3) {
            System.out.println("Invalid input, be sure to not enter more than 3 integers or a alpha character. Please try again.");
            testArray();
        } catch (NumberFormatException notAnInt) {
            System.out.print("Invalid input, be sure to not enter more than 3 integers or a alpha character. Please try again.");
            testArray();
        }
    }/*
    public static void testFileName() {
        Scanner scnr = new Scanner(System.in);
	    File file = new File(scnr.nextLine());
	    try {
            if {

            }
        }

    }
*/

    public static void testFileName() {
        Scanner scnr = new Scanner(System.in);

        try { 
            //System.out.print("Enter File Name: ");
            //File f1 = new File("T:\\" + scnr.nextLine());
            //f1.createNewFile();
            FileWriter file = new FileWriter(scnr.nextLine());
            file.write(System.getProperty(scnr.toString()));
            } catch (IOException ioe) {
            System.out.println("Try again:");
        } catch (NullPointerException n) {
            System.out.println("File not found. Try again:");
        }
    }





        public static void main (String[]args){
            //testInt();
            //testFloat();
            //testString();
            //testArray();
            testFileName();

        }

}


