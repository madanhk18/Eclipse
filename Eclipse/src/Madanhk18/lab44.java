package Madanhk18;
class nanpoint
{
	int x,y;
	nanpoint()
	{
		x=y=0;
	}
	nanpoint(int a, int b)
	{
		x=a;
		y=b;
	}
	void setxy(int a, int b)
	{
		x=a;
		y=b;
	}
	int [] getxy()
	{
		return new int [] {x,y};
	}
	public String toString()
	{
		return ("x="+x+"y="+y);
	}
	double distance(int a,int b)
	{
		return Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
	}
	double distance(nanpoint another)
	{
		return (distance(another.x,another.y));
	}
	double distance()
	{
		return distance(0,0);
	}
}

public class lab44 {

	public static void main(String[] args) {
		nanpoint m=new nanpoint();
		m.setxy(1,2);
		System.out.println("X="+m.getxy()[0]+"Y="+m.getxy()[1]);
		
		nanpoint n=new nanpoint(7,8);
		System.out.println("m.object toString()"+m);
		System.out.println("n.object toString()"+n);
		System.out.println("m.distance(3,4)"+m.distance(3, 4));
		System.out.println("m.distance(n)"+m.distance(n));
		System.out.println("m.distance()"+m.distance());

	}

}
