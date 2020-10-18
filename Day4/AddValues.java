package com.Assignment3;

import java.util.Scanner;

public class AddValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter value"+i+":");
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
			
		}
		System.out.println("Sum of all values is: "+sum);
	}

}
