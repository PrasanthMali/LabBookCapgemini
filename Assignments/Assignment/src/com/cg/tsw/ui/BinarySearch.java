package com.cg.tsw.ui;

import java.util.*;

public class BinarySearch {
	static int binarySearchComputation(int arr[] , int target){
		int left=0,right=arr.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of elements : ");
		int num=sc.nextInt();
		int arr[]=new int [num];
		System.out.println("Enter the elements: ");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target element: ");
		int target=sc.nextInt();
		int result=binarySearchComputation(arr,target);
		if(result==-1) {
			System.out.println("Element was not found!");
		}else {
			System.out.println("Element found at "+result+" position");
		}
		sc.close();
	}
}