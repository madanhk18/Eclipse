package Madanhk18;
class shape
{
	String name;
	shape(String n){
		name=n;
		}
	void draw()
	{
		System.out.println("Shape "+name+" is drawn");
	}
	void erase()
	{
		System.out.println("Shape "+name+" is erased");
	}
}
class circle extends shape
{
	double radius;
	circle(String n,double r)
	{
		super(n);
		radius=r;
	}
	void draw()
	{
		System.out.println("Shape "+name+" is drawn with radius"+radius);
	}
	void erase(String n)
	{
		System.out.println("Overloaded erase () shape "+n+" is erased ");
	}
	public void calculateArea() {
		// TODO Auto-generated method stub
		
	}
	
}
class triangle extends shape
{
	int s1,s2,s3;
	triangle(String n,int s1,int s2,int s3)
	{
		super(n);
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
	void draw()
	{
		System.out.println("Shape "+name+" is drawn with side "+s1+" , "+s2+" ,"+s3);
	}
	void erase(String n)
	{
		System.out.println("Overloaded erase () shape "+n+" is erased ");
	}
	
}
class square extends shape
{
	int sd1,sd2,sd3,sd4;
	square(String n,int s1,int s2, int s3,int s4)
	{
		super(n);
		sd1=s1;
		sd2=s2;
		sd3=s1;
		sd4=s4;
	}
	void draw()
	{
		System.out.println("Shape "+name+" is drawn with side "+sd1+" , "+sd2+" ,"+sd3+" ,"+sd4);
	}
	void erase(String n)
	{
		System.out.println("Overloaded erase () shape "+n+" is erased ");
		
	}	
}

public class mypoint {

	public static void main(String[] args) {
		circle c=new circle("Circle",12.5);
		c.draw();
		c.erase("CIRCLE");
		
		triangle t=new triangle("Triangle",7,8,9);
		t.draw();
		t.erase("TRIANGLE");
		
		square s=new square("Square",3,4,5,6);
		s.draw();
		s.erase("Square");
	}

}
