package com.demo;
import java.util.Scanner;
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a[][]  = new int[3][5];
		
		for(int i = 0;i<3;i++) {
			
			for(int j=0;j<5;j++) {
				System.out.println(" Enter marks of class " + i + " student" +  j);
				a[i][j]= sc.nextInt();
			}
			
		}
		
		
		for(int i=0;i<3;i++) {
			for(int j = 0;j<5;j++) {
			System.out.print(a[i][j] + " ");
		}
		System.out.println();
		
		}
	
	}
	
	 

}
