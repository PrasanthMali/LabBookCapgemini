package com.cg.tsw.ui;

import java.util.Scanner;

public class NoOfVowelConstant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int vowel=0,consonant=0,digit=0,lowerCase=0,upperCase=0,space=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o'
					||str.charAt(i)=='u'||str.charAt(i)=='A' ||str.charAt(i)=='E' 
					||str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U') {
				vowel++;
			}if(str.charAt(i)=='9' ||str.charAt(i)=='8' ||str.charAt(i)=='7' ||
					str.charAt(i)=='4' ||str.charAt(i)=='5' ||str.charAt(i)=='6' ||
					str.charAt(i)=='3' ||str.charAt(i)=='2' ||str.charAt(i)=='1' ||str.charAt(i)=='0') {
				digit++;
			}if(Character.isUpperCase(str.charAt(i))){
				upperCase++;
			}if(Character.isLowerCase(str.charAt(i))){
				lowerCase++;
			}if(str.charAt(i)==' ') {
				space++;
			}else {
				consonant++;
			}
		}
		System.out.println("Vowels is: "+vowel +"\n"+"Consonants: "+consonant+"\nDigits: "+digit+"\nUpper case: "+upperCase+"\nLower case"+lowerCase+"\nSpace: "+space);
		sc.close();
	}

}