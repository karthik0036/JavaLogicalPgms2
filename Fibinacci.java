package com.bridge;

public class Fibinacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 8,num1=0,num2=1;
		System.out.print("Fibonacci Series of "+count+" numbers:");
		for(int i = 0; i<count; i++) {
			/* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
			System.out.print(num1+" ");
			int sumOfPrevTwo = num1+num2;
			num1=num2;
			num2=sumOfPrevTwo;
		}

	}

}
