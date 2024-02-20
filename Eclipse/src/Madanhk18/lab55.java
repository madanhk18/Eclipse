package Madanhk18;
abstract class chape
{
	abstract double calculateArea();
	abstract double calculatePerimeter();
	
}
class cirrcle extends chape
{
	double radius;
	cirrcle(double r)
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
class tringlee extends chape
{
	double len,bre,hei;
	tringlee(double l,double b,double h)
	{
		len=l;
		bre=b;
		hei=h;
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
public class lab55 {
	public static void main(String args[]) {
		cirrcle c=new cirrcle(7.5);
		System.out.println("area of circle="+c.calculateArea());
		System.out.println("perimeter of circle="+c.calculatePerimeter());

			tringlee t=new tringlee(4.5,5.5,6.5);
			System.out.println("area of triangle="+t.calculateArea());
			System.out.println("perimeter of triangle="+t.calculatePerimeter());
		
	}

}
