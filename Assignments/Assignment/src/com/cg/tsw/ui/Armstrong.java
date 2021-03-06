package com.cg.tsw.ui;
import java.util.*;

public class Armstrong {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		int temp=number;
		int armstrong=0;
		while(temp!=0) {
			int rem=temp%10;
			armstrong+=rem*rem*rem;
			temp/=10;
		}
		if(armstrong==number) {
			System.out.println("The entered number is an Armstrong Number.");
		}else {
			System.out.println("The entered number is not an Armstrong Number.");
		}
		sc.close();
	}
}