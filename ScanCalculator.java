package com.qa.day2.inputwithscanner;

import java.util.Scanner;

public class ScanCalculator {
	
	public static int addition(int num1, int num2) {
		
		return num1 + num2;
	}
	
	
	
	public static int subtraction(int num1, int num2) {
		
		return num1 - num2;
	}
	
	
	public static int multiplication(int num1, int num2) {
		
		return num1 * num2;
	}
	
    public static double division(double num1, double num2) {
		
		if(num1 < num2) {
			System.out.println("Is not divisible");
			
		} else {
			return num1 / num2;
			
		}
		return 0;
	}
	
	
	public void chooseMethod() {
		
		Scanner scan = new Scanner(System.in);
		
		
		
	
		System.out.println("Choose your calculation method - (+, -, *, / )");
		char operator = scan.nextLine().charAt(0);
		
		
		
	

		if (operator == '+') {
			System.out.println("Enter your first number:");
			int firstNum = scan.nextInt();
			System.out.println("Enter your second number:");
			int secondNum = scan.nextInt();
			int answer = ScanCalculator.addition(firstNum, secondNum);
			System.out.println(firstNum + " + " + secondNum + " = " + answer);
			
			
		} else if (operator == '-') {
			System.out.println("Enter your first number:");
			int firstNum = scan.nextInt();
			System.out.println("Enter your second number:");
			int secondNum = scan.nextInt();
			int answer = ScanCalculator.subtraction(firstNum, secondNum);
			System.out.println(firstNum + " - " + secondNum + " = " + answer);
			
			
			
		} else if (operator == '*') {
			System.out.println("Enter your first number:");
			int firstNum = scan.nextInt();
			System.out.println("Enter your second number:");
			int secondNum = scan.nextInt();
			int answer = ScanCalculator.multiplication(firstNum, secondNum);
			System.out.println(firstNum + " * " + secondNum + " = " + answer);
			
			
		} else if (operator == '/') {
			System.out.println("Enter your first number:");
			double firstNum = scan.nextInt();
			System.out.println("Enter your second number:");
			double secondNum = scan.nextInt();
			double answer = ScanCalculator.division(firstNum, secondNum);
			System.out.println(firstNum + " / " + secondNum + " = " + answer);
			
			
			
		} else {
			System.out.println("Please enter a valid operator");
			scan.close();
			
		}
		
		
			
		}
		
			
		
		}
		
		
		
		
		
		
		
		
	



