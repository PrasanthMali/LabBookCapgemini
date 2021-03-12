package com.cg.tsw.ui;

import java.util.Scanner;

public class IdentityMatrix {

	public static void main(String[] args) {
		 int i,j;
		 boolean flag = true;      
		 System.out.println("Enter total rows and columns: ");
		 Scanner s = new Scanner(System.in);
		 int row = s.nextInt();
		 int column = s.nextInt();
		 int array[][] = new int[row][column];
		 System.out.println("Enter matrix:");
		 for(i = 0; i < row; i++){
			 for(j = 0; j < column; j++) {
				 array[i][j] = s.nextInt();
				 System.out.print(" ");
				 }
			 }    
		 if(row != column){    
			 System.out.println("Matrix should be a square matrix");    
			 }
		 else {       
			 for(int a = 0; a < row; a++){    
				 for(int b = 0; b < column; b++){    
					 if(a == b && array[a][b] != 1){    
						 flag = false;    
						 break;   
					 }    
					 if(a != b && array[a][b] != 0){    
						 flag = false;    
						 break;    
					 }    
				 }    
			 }     
			 if(flag)    
				 System.out.println("It  is an identity matrix");    
			 else    
				 System.out.println("It is not an identity matrix");    
		 }
		 s.close();
	}
}