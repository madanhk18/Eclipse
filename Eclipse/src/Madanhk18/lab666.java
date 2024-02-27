package Madanhk18;
//SUBMIT ON FEB 19//
class shp
{
	String name;
	shp(String name)
	{
		this.name=name;
	}
	void draw()
	{
		System.out.println("Shape"+name+"is drawn");
	}
	void erase()
	{
		System.out.println("overloaded erase() Shape"+name+"is erased");
	}
}
class circleee extends shp
{
	double radius;
	circleee(String name,double r)
	{
		super(name);
		radius=r;
	}
	void draw()
	{
		System.out.println("shape"+name+"is drawn with the radius"+radius);
	}
	void erase(String name)
	{
		System.out.println(" overloaded erase() Shape"+name +"is erased");
	}
}
class trin extends shp
{
	double sd1,sd2,sd3;
	trin(String name,double s1,double s2,double s3)
	{
		super(name);
		sd1=s1;
		sd2=s2;
		sd3=s3;
	}
	void drawn()
	{
		System.out.println("Shape"+name+"is drawn with sides "+sd1+" "+sd2+" "+sd3);
	}
	void erase(String name) {
		System.out.println("Overloaded erase() shape"+name+"is erased");
	}
}
class sqqur extends shp
{
	double sd1,sd2,sd3,sd4;
	sqqur(String name,double s1,double s2,double s3,double s4)
	{
		super(name);
		sd1=s1;
		sd2=s2;
		sd3=s3;
		sd4=s4;
	}
	void draw()
	{
		System.out.println("Shape"+name+" is drawn with sides "+sd1+" "+sd2+" "+sd3+" "+sd4);
	}
	void erase(String name) {
		System.out.println("Overloaded erase() Shape"+name+"is erased ");
	}
}

public class lab666 {

	public static void main(String[] args) {
		circleee c=new circleee("CIRCLE",6);
		c.draw();
		c.erase("CIRCLE");
		
		trin t=new trin("TRIANGLE",6,7,8);
		t.drawn();
		t.erase("TRANGLE");
		
		sqqur s=new sqqur("SQUARE",1,2,3,4);
		s.draw();
		s.erase("SQUARE");
	
	}

}

