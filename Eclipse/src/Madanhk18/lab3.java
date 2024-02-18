package Madanhk18;
//PUSH THIS TO GITHUB ON 18 of FEB//
import java.util.*;
class employe
{
	private String name;
	private int id;
	private double salary;
	
	employe(String name,int id, double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void printdata()
	{
		System.out.println("Name="+name);
		System.out.println("ID="+id);
		System.out.println("Salary="+salary);
	}
	
	void hiked_salary(float per)
	{
		salary=salary+salary*per/100.0;
		
	}
}
public class lab3 {
	public static void main(String[] args) {
		int n;
		String name;
		int id;
		double salary;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of employe");
		n=s.nextInt();
		employe e[]=new employe[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name , id , salary");
			name=s.next();
			id=s.nextInt();
			salary=s.nextDouble();
			e[i]=new employe(name,id,salary);
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Before hike :");
			e[i].printdata();
			e[i].hiked_salary(10);
			System.out.println("After the hike");
			e[i].printdata();
		}

	}

}
