/*Develop a JAVA program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement
the respective methods to calculate the area and perimeter of each shape.*/


package Madanhk18;


abstract class shaa
{
	abstract double calculateArea();
	abstract double calculatePerimeter();

class cir extends shaa
{
	double radius;
	cir(double r)
	{
		radius=r;
	}
	double calculateArea()
	{
		return Math.PI*radius*radius;
	}
	double calculatePerimeter()
	{
		return 2*Math.PI*radius;
	}	
}
class tri extends shaa
{
	double len,bre,hei;
	tri(double length, double breadth, double height)
	{
		len=length;
		bre=breadth;
		hei=height;
	}
	double calculateArea()
	{
		 double s;
		 s=(len+bre+hei)/2;
		 return Math.sqrt(s*(s-len)*(s-bre)*(s-hei));
	}
	double calculatePerimeter()
	{
		return len*bre*hei;
	}
}
}
public class alab6 {

	public static void main(String[] args) {
	cir c=new cir(5);
	
		
		
	}

}
