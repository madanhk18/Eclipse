package Madanhk18;
import java.util.*;
public class mat {

	public static void main(String[] args) {
		int i,j;
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(args[0]);
		
		System.out.println("Enter the elements matrix of A:");
		for(i=0;i<n;i++) 
			for(j=0;j<n;j++) 
				a[i][j]=s.nextInt();
	
		System.out.println("Elements of matrix A are :");
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Enter the elements of  matrix of B:");
		for(i=0;i<n;i++) 
			for(j=0;j<n;j++) 
				b[i][j]=s.nextInt();
		
		System.out.println("Elements of matrix B are :");
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.printf("%3d",b[i][j]);
			}
			System.out.println();
		}
		
		for(i=0;i<n;i++) 
			for(j=0;j<n;j++) 
				c[i][j]=a[i][j]+b[i][j];
		
		System.out.println("Sum=");
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.printf("%3d",c[i][j]);
			}
		}

	}

}
