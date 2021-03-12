package com.cg.tsw.ui;

import java.util.*;

public class MaxElementRecursiveFunction {
	static int maxElement(int num,int []arr) {
		if (num==1) {
			return arr[0];
		}
		return Math.max(arr[num-1], maxElement(num-1,arr));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int num=sc.nextInt();
		int []arr = new int [num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(maxElement(num,arr));
		sc.close();
	}
}