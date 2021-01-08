package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	System.out.println("hello java");
//	System.out.print("hi");
        Scanner input = new Scanner(System.in);
//
//        //Getting firstname from user
//        System.out.println("What is your name?");
//        String firstName = input.nextLine();
//
//        // slide 21
//        System.out.printf("Hello %s!\n", firstName);
//
//        //Getting lastname from user
//        System.out.println("What is your last name?");
//        String lastName = input.nextLine();
//
//        System.out.printf("Your name is %s %s.", firstName, lastName);

//        System.out.println("Enter a name: ");
//        String name = input.nextLine();
//        System.out.println("Give me an adverb: ");
//        String adverb = input.nextLine();
//        System.out.println("Give me a adjective: ");
//        String adjective = input.nextLine();
//        System.out.println("Give me a verb: ");
//        String verb = input.nextLine();
//        System.out.println("Give me a noun two: ");
//        String nounTwo = input.nextLine();
//        System.out.println("Give me a number: ");
//        String number = input.nextLine();
//        System.out.println("Give me your name: ");
//        String yourName = input.nextLine();
//        System.out.printf("Here is your story: \n");
//        System.out.printf("\n Dear %s,", name);
//        System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, verb);
//        System.out.printf("\n I want to go to the %s with you in %s days.", nounTwo, number);
//        System.out.printf("\n Sincerely, %s \n", yourName);

    byte b = (byte)1234;

    double num = 5;
    double num2 = 10;

    double result = num %= num2;

        System.out.println(result);

        if(num < 13){
            System.out.println("hello");
        }

        //use in lab
//        int a = 4;
//        String b = "5";
//        int c = a + b; // gives an error, because cant add Strings as numbers
//        int d = a + (int)b; // works because now b is cast as an int
    }
}
