package Madanhk18;
class stack
{
	int size;
	int top,stackarray[];
	
	stack(int size)
	{
		this.size=size;
		top=-1;
		stackarray=new int [size];
	}
	void push(int ele)
	{
		if(top==size-1)
		{
			System.out.println("Overflow \n");
		}
		else
		{
			top++;
			System.out.println("Element added is ="+ele);
			stackarray[top]=ele;
		}
	}
	void pop()
	{
		if(top==-1)
			System.out.println("Underflow \n");
		
		else
		{
		System.out.println("The deleted element is="+stackarray[top]);
		top--;
		}
	}
	void display()
	{
		int i;
		if(top==-1)
			System.out.println("Underflow \n");
		
		else
		{
			System.out.println("Stack elemets are ");
			for(i=top;i>=0;i--)
			{
				System.out.println(stackarray[i]);
			}
		}
	}
}

public class second {

	public static void main(String[] args) {
		stack s=new stack(4);
		s.push(3);
		s.push(7);
		s.push(10);
		s.push(55);
		s.display();
		s.pop();
		s.pop();
		s.display();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		
	}

}
