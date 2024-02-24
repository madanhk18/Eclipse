package Madanhk18;
//outer class and inner class //
//commit feb 24//
class outer 
{
	void display()
	{
		System.out.println("This is an outer class ");
	}
	class inner
	{
		void display()
		{
			System.out.println("This is an inner classs");
		}
	}
}
public class lab7 {
	public static void main( String s[])
	{
		outer o=new outer();
		o.display();
		
		outer.inner i=o.new inner();
		i.display();
	}
}
