package com.cg.lb.ui;

import java.util.Scanner;

public class SumOfCubes {

	public static void main(String[] args) {
	    // int num1,num2,num3;
	    System.out.println("Enter a number to find cubes of each digit : ");
	    Scanner scan = new Scanner(System.in);
	    int number  = Integer.parseInt(scan.nextLine()); 
	    int counter = 0;
	    while(number>0){
	        int t= number%10;
	        System.out.println("Cube of the digit "+t +" is "+(t*t*t));
	        counter = counter+1;
	        number = number/10;
	    }scan.close();
	}
}