package com.bridge;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		 	Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        
	        int num = sc.nextInt();
	        int rev = 0;

	        while(num!=0){
	            int rem = num%10;
	            rev = rev*10 +rem;
	            num = num/10;
	        }
	        System.out.println("Reverse number is " + rev);
	        sc.close();
		

	}

}
