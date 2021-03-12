package com.cg.tsw.ui;

import java.util.*;

public class OrthogonalMatrix {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int [][]identityMatrix= {{1,0,0},{0,1,0},{0,0,1}};
		System.out.print("Enter the elements of the matix : ");
		int [][]matrix=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int transpose[][] = new int [3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				transpose[i][j]=matrix[j][i];
			}
		}
		int [][] original=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				int multiplication=0;
		for(int k=0;k<3;k++) {
			multiplication +=transpose[i][k]*matrix[k][j];
		}
			original[i][j]=multiplication;
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(original[i][j]+"\t");
			}
			System.out.println();
		}
		boolean check=true;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(original[i][j]!=identityMatrix[i][j]) {
					check=false;
					break;
				}
			}
		}
		if(check) {
			System.out.println("The entered matris is an orthogonal matrix.");
		}else {
			System.out.println("The entered matris is not an orthogonal matrix.");
		}
		sc.close();
	}
}