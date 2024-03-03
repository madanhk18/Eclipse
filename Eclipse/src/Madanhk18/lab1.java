package Madanhk18;
class employee
{
	private String name;
	private int id;
	private double salary;
	
	employee(String name,int ID,double salary)
	{
		this.name=name;
		this.id=ID;
		this.salary=salary;
	}
	void printdata()
	{
		System.out.println("Name="+name);
		System.out.println("ID="+id);
		System.out.println("salary="+salary);
		
	}
	void hike(double percent)
	{
		salary=salary+(salary*percent)/100.0;
	}
}
public class lab1 {
	public static void main(String args[])
	{
		employee e=new employee("Madan",75,10000);
		System.out.println("Before hike");
		e.printdata();
		
		e.hike(10);
		System.out.println("AFter hike");
		e.printdata();
	}
}
