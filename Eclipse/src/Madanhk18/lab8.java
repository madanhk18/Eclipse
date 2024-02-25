package Madanhk18;
///Commit on feb 25//
interface resizable
{
	void resizewidth(int width);
	void resizeheight(int height);
}

public class lab8 implements resizable
{
	int h , w;
	lab8(int height , int width)
	{
		h=height;
		w=width;
	}
	public void resizewidth(int width)
	{
		w=width;
	}
	public void resizeheight(int height)
	{
		h=height;
	}
	void display()
	{
		System.out.println("Rectangle height ="+h+" "+"Rectangle width ="+w);
	}
	
public static void main (String args[]) {
	lab8 l=new lab8(5,6);
	System.out.println("Before the reziable function call");
	l.display();
	l.resizeheight(8);
	l.resizewidth(9);
	System.out.println("After the reziable function call");
	l.display();
	}
}
