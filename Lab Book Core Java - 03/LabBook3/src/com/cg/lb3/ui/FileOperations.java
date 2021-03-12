package com.cg.lb3.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String fileName=sc.next();
		try {
		FileInputStream fis = new FileInputStream(fileName);
		int totalCharacter = 0,totalLine=1,totalWord=0;
		char ch;
		while(totalCharacter>0) {
			ch=(char)fis.read();
			if(ch=='\n') {
				totalLine+=1;
			}else if(ch==' ') {
				totalWord+=1;
			}

			System.out.println("Total character: "+totalCharacter);
			System.out.println("Total word: "+totalWord);
			System.out.println("Total line: "+totalLine);
		}
		}catch(FileNotFoundException e) {
			System.out.println("Kindly check the file name. !FILE NOT FOUND!");
		}
	}

}