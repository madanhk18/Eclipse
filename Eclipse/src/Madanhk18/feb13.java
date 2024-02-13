package Madanhk18;

import java.util.Scanner;

public class feb13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		if(args.length==0) {
			System.out.println("No input");
		}
		System.exit(0);
		
		int n=Integer.parseInt(args[0]);
		
		if(n<0)
		{
			System.out.println("Inalid input");
		}
		
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];
		
		System.out.println("Enter the matrix of A:");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=s.nextInt();
		
		System.out.println("Matrix A Elements are \n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Enter the matrix of B:");
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				b[i][j]=s.nextInt();
		
		System.out.println("Matrix A Elements are \n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%3d",b[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) 
			for(int j=0;j<n;j++)
				c[i][j]=a[i][j]+b[i][j];
		
		System.out.println("SUM matrix is:");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%3d",c[i][j]);
			}
			System.out.println();
		}
			}
					
	}


