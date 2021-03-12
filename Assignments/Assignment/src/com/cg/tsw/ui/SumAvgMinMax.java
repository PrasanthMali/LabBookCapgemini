package com.cg.tsw.ui;

import java.util.Scanner;

public class SumAvgMinMax {
	
	static void sum(int []arr, int num) {
		int s=0;
		for(int i=0;i<num;i++) {
			s+=arr[i];
		}
		System.out.println("Sum is: "+s);
	}
	static void average(int []arr, int num) {
		int s=0;
		for(int i=0;i<num;i++) {
			s+=arr[i];
		}
		System.out.println("Average is: "+s/(double)num);
	}
	static void minimum(int []arr, int num) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<num;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum is: "+min);
	}
	static void maximum(int []arr, int num) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<num;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum is: "+max);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of values to be passed : ");
		int num = sc.nextInt();
		System.out.println("Enter the "+num +" elements : ");
		int arr[] = new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		sum(arr,num);
		average(arr,num);
		minimum(arr,num);
		maximum(arr,num);
		sc.close();
	}
}