package com.cg.tsw.ui;

import java.util.*;

public class QuadracticEquation {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a: ");  
		double a = sc.nextDouble();  
		System.out.print("Enter the value of b: ");  
		double b = sc.nextDouble();  
		System.out.print("Enter the value of c: ");  
		double c = sc.nextDouble();  
		double discriminant= b * b - 4.0 * a * c; 
		if(discriminant>0.0) {
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);  
			double root2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);  
			System.out.println("The roots is real " + root1 + " and different " + root2);  
		}
		else if(discriminant==0.0) {
			double root1 = -b / (2.0 * a);  
			System.out.println("The root is real and only one solution: " + root1);  
		}
		else {
			System.out.println("The roots are not real.");
		}
		sc.close();
	}
}