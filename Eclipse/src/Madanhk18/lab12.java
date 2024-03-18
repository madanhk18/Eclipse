package Madanhk18;

public class lab12 extends Thread{
	lab12(String name)
	{
		super(name);
		start();
	}
	
public void run()
{
	for(int i=5;i>0;i--)
	{
		System.out.println("Child thread "+Thread.currentThread().getName()+ " "+i);
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
	}
	 }
	System.out.println("Child thread"+Thread.currentThread().getName()+" "+" returns");
}
	
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		new lab12("First");
		new lab12("Second");
		new lab12("Third");
		
		for(int i=5;i>0;i--)
		{
			System.out.println("Main thread "+ " "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
		}
		 }
		System.out.println("main thread returns");
	}
		
	}
