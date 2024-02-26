package Madanhk18;
///feb 26//
public class lab11 implements Runnable{
	Thread t;
	lab11(String name)
	{
		t=new Thread(this,name);
		t.start();
	}
	
	public void run()
	{
		for(int i=5;i>0;i--)
		{
			System.out.println("Child thread  "+t.getName()+" "+i);
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}
			System.out.println("Child thread "+t.getName()+"	returns ");
		
	}

	public static void main(String[] args) {
		Thread o=Thread.currentThread();
		System.out.println("Main thread "+o);
		new lab11("First");
		new lab11("Second");
		new lab11("Third");
		
		for(int i=5;i>0;i--)
		{
			System.out.println("Main thread "+" "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
			System.out.println("Main thread returns");
			System.out.println(" ");
		}
	}

