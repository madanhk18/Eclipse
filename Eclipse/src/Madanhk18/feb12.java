package Madanhk18;

import java.util.Scanner;

//Java program to add two matrix//
public class feb12 {

	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("No input");
		}
		System.exit(0);

			int n=Integer.parseInt(args[0]);
			if(n<0)
			{
				System.out.println("Invalid input");
			}
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the matrix of A:");
			
			int i,j;
			int a[][]=new int[n][n];
			int b[][]=new int[n][n];
			int c[][]=new int[n][n];
			
			for(i=0;i<n;i++)
				for(j=0;j<n;j++)
					a[i][j]=s.nextInt();

			System.out.println("The elemets of matrix A are");
			
			for(i=0;i<n;i++) {
				for(j=0;j<n;j++) {
					System.out.printf("%3d",a[i][j]);
				}
				System.out.println();
			}
			
			System.out.println("Enter the matrix of B:");
			
			
			for(i=0;i<n;i++)
				for(j=0;j<n;j++)
					b[i][j]=s.nextInt();

			System.out.println("The elemets of matrix B are");
			
			for(i=0;i<n;i++) {
				for(j=0;j<n;j++) {
					System.out.printf("%3d",b[i][j]);
				}
				System.out.println();
			}
			
			
			for(i=0;i<n;i++) 
				for(j=0;j<n;j++)
					c[i][j]=a[i][j]+b[i][j];
			
			System.out.println("SUM=");
			for(i=0;i<n;i++) 
				for(j=0;j<n;j++)
					c[i][j]=a[i][j]+b[i][j];
			
			for(i=0;i<n;i++) {
				for(j=0;j<n;j++) {
					System.out.printf("%3d",c[i][j]);
				}
				System.out.println();
			}
				}
			

	}


