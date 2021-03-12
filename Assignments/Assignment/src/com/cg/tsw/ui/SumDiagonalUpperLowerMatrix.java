package com.cg.tsw.ui;

import java.util.Scanner;

public class SumDiagonalUpperLowerMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]matrix=new int[3][3];
		System.out.println("Enter the elements of matrix :");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		int upperMatrix=0,lowerMatrix=0,diagonalSum=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					diagonalSum+=matrix[i][j];
				}
				if(i<=j) {
					upperMatrix+=matrix[i][j];
				}
				if(i>=j) {
					lowerMatrix+=matrix[i][j];
				}
			}
		}
		System.out.print("The upper triangular matrix sum : "+upperMatrix +"\nThe lower triangular matrix sum : "+lowerMatrix +"\nThe principle diagonal sum : "+diagonalSum);
		sc.close();
	}
}