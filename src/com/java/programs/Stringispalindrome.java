package com.java.programs;

public class Stringispalindrome {

	public static void main(String[] args) {
		String s1="level";
		String s2="";
		String copy=s1;
		for (int i=s1.length()-1; i>=0; i--) {
			s2=s2+s1.charAt(i);
		}
		if(copy.equals(s2)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}	
	}

}
