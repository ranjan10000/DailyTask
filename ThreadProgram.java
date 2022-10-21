package NewPackage;

public class ThreadProgram
{



		public static void main(String[] args) {
		A a = new A();
		B b = new B();
		        D d = new D();
		Thread Td = new Thread(b);

		   
		System.out.print(a.isAlive());
		a.start();
	
		System.out.print(a.isAlive());

		       
		}

		}
		 class A extends Thread
		{
		public void run()
		{

		for(int i = 0;i<=5;i++)
		{

		System.out.print(" "+i);
		}
		System.out.println();
		}
		}
		 
		 class B implements Runnable
		 {
		public void run()
		{
		for(int k = 15;k>10;k--)
		{
		System.out.print(" "+k);

		    }
		System.out.println();
		}

		 }
		 class D extends Thread
		 {
		public void run()
		{
		for(int j = 10;j>=5;j--)
		{
		System.out.print(" "+j);
		}
		System.out.println();
		}
		 }



