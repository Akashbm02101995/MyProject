package com.java.programs;

public class Countofeven {
public static void main(String[] args) {
	int no=12235;
	int count=0;
	while(no!=0) {
		int rem=no%10;
		if(rem%2==0) {
			count=count+rem;
		}
		no=no/10;
	}
	System.out.println(count);
}
}
