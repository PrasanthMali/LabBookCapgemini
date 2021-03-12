package com.cg.tsw.ui;

import java.util.Scanner;

public class MultiplicationMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of the first matrix : ");
		int [][]firstMatrix=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				firstMatrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of the second matrix : ");
		int [][]secondMatrix=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				secondMatrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				int multiplication=0;
				for(int k=0;k<3;k++) {	
					multiplication+=firstMatrix[i][k]*secondMatrix[k][j];
				}
				System.out.print(multiplication+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}