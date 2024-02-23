package Madanhk18;
//stack wala program//
class stk
{
	int size;
	int top;
	int s_array[];
	stk(int sz)
	{
		size=sz;
		top=-1;
	 s_array=new int[size];
	}
	
	void push(int ele)
	{
		if(top==size-1)
		{
			System.out.println("Stack overflow ");
		}
		else
			top++;
			System.out.println("Stack element added is "+s_array[ele]);
		s_array[top]=ele;
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow ");
		}
		else
		{
			System.out.println("the deleted element is ");
			System.out.println(s_array[top]);
			top--;
		}
	}
	void display()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow ");
		}
		else
		{
			System.out.println("The stack elements are ");
			for(int i=top;i>=0;i--)
			{
				System.out.println(s_array[i]);
			}
			
		}
	}
}
public class prog2 {

	public static void main(String[] args) {
		stk s=new stk(5);
		s.push(3);
		s.push(6);
		s.push(10);
		s.display();
		s.pop();
		s.display();
		s.pop();
		s.push(99);

	}

}
