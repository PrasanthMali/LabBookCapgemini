package com.cg.tsw.ui;
import java.util.*;

public class AmicableNumber {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers : ");
		int firstNumber=sc.nextInt();
		int secondNumber=sc.nextInt();
		int sum1=0,sum2=0;
		for(int i=1;i<firstNumber;i++) {
			if(firstNumber % i == 0) {
				sum1+=i;
			}
		}
		for(int i=1;i<secondNumber;i++) {
			if(secondNumber % i == 0) {
				sum2+=i;
			}
		}
		if(firstNumber==sum2 && secondNumber==sum1) {
			System.out.println("The numbers are amicable numbes.");
		}
		else {
			System.out.println("The numbers are not amicable numbers.");
		}
		sc.close();
	}
}