package com.dm;

import java.util.Scanner;

public class SimpleCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String input;
        do {
            System.out.println("\t1: Add Numbers here");
            System.out.println("\t2: Subtract numbers here");
            System.out.println("\t3: Multiply numbers here");
            System.out.println("\t4: Divide numbers here");
            System.out.println("\t5: Exit Calculator");
            System.out.println("Command: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    addMethod();
                    break;
                case "2":
                    subtractMethod();
                    break;
                case "3":
                    multiplyMethod();
                    break;
                case "4":
                    divideMethod();
                    break;
                case "5":
                    System.out.println("Exiting Calculator....");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        } while (!input.equalsIgnoreCase("5"));

    }


    public static void addMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers you would like to add below");

        System.out.println("Number one: ");
        float num1 = scanner.nextFloat();

        System.out.println("Number Two: ");
        float num2 = scanner.nextFloat();

        float sum = num1 + num2;

        System.out.println("Your total is: " + sum);

    }

    public static void subtractMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers you would like to subtract below");

        System.out.println("Number One: ");
        float num1 = scanner.nextFloat();

        System.out.println("Number Two: ");
        float num2 = scanner.nextFloat();

        float sum = num1 - num2;

        System.out.println("Your total is: " + sum);

    }

    public static void multiplyMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers you would like to subtract below");

        System.out.println("Number One: ");
        float num1 = scanner.nextFloat();

        System.out.println("Number Two: ");
        float num2 = scanner.nextFloat();

        float sum = num1 * num2;

        System.out.println("Your total is: " + sum);

    }

    public static void divideMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers you would like to divide below");

        System.out.println("Number One: ");
        float num1 = scanner.nextFloat();

        System.out.println("Number Two: ");
        float num2 = scanner.nextFloat();

        float sum = num1 / num2;

        System.out.println("Your total is: " + sum);

    }



}