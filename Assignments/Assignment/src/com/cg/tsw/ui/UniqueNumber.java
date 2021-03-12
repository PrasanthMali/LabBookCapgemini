package com.cg.tsw.ui;
import java.util.*;

public class UniqueNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		int temp=number;
		int rem=temp%10;
		int tempResult=rem*temp;
		int rev=0;
		while(tempResult!=0) {
			int remainder=tempResult%10;
			rev=rev*10+remainder;
			tempResult/=10;
		}
		if(number==rev) {
			System.out.println("The entered number is a unique number.");
		}else {
			System.out.println("The entered number is a not unique number.");
		}
		sc.close();
	}
}