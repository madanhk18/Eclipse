package Madanhk18;

import java.util.Scanner;

public class matrixadd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,j;
		if (args.length != 1) {
			System.out.println("No input");
		}
		int n = Integer.parseInt(args[0]);
		
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		int[][] result_C = new int[n][n];
		
		System.out.println("Enter elements of the matrix A:");
		
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
		
		System.out.println("Enter elements of the matrix B:");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				b[i][j]=s.nextInt();
		
		System.out.println("The elemets of matrix A are");
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.printf("%3d",b[i][j]);
			}
			System.out.println();
		}

		for(i=0;i<n;i++) 
			for(j=0;j<n;j++)
				result_C[i][j]=a[i][j]+b[i][j];
		
		System.out.println("Sum of matrices are");
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.printf("%3d",result_C[i][j]);
			}
			System.out.println();
		}
		
}
}
