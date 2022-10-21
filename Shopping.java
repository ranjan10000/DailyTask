package TASK;
import java.util.*;
public class Shopping {
	static int productlist;
	static int availableCount;
	static  Vector<String> product = new Vector<>();
	static  Vector<Integer> stack  =new Vector<>();
	static Scanner sc=new Scanner(System.in);
	 public static void main(String []args)
	 {
		 
	
      product.add("phone");
      product.add("watch");
      product.add("headphone");
      product.add("backcover");
     
    
      stack.add(5);
      stack.add(3);
	  stack.add(4);
	  stack.add(20);
     
     Shopping s=new Shopping();
 while(true)    {
	 System.out.println("1.Buy\n2.Sell");
		int UserOption=sc.nextInt(); 
	
		try
		{
	
	switch(UserOption)
	{
	case 1:
	{
		s. Buy();
		 break;
	}
		
	case 2:
	{
		 s.Sell();
			 break;
	}
	
		
		
	default :  System.err.println("Sorry Invaild Option \nEnter valid Option ");
	
		break;
	}
		}
 
	
		
	catch(Exception e)
		{
			System.out.println("Sorry Wrong Product!!!");
		}
 }
	}
	 public void Buy()
	 {
		 System.out.println("Enter your Products");
		 System.out.println("0.phone\n1.watch\n2.headphones\n3.backcover");
		 
		  productlist=sc.nextInt();
 int AvailableStack = stack.get(productlist);
	
System.out.println("Available Stack is : "+AvailableStack);
 System.out.println("Enter your product count");
 int count=sc.nextInt();
 availableCount =AvailableStack+count;
 System.out.println("Current Available Stack is "+ availableCount);
 System.out.println("Buying is completed");
	 }
	
	 public void Sell()
	 {
		 try
			{
		 System.out.println("Enter your Products");
		 System.out.println("0.phone\n1.watch\n2.headphones\n3.backcover");
		 
		  productlist=sc.nextInt();
 int AvailableStack = stack.get(productlist);
	
System.out.println("Available Stack is : "+AvailableStack);
 System.out.println("Enter your product count");
 int count=sc.nextInt();
 
	 availableCount =AvailableStack-count;
	 if(availableCount>0)
	 {
		System.out.println("Current Available Stack is "+availableCount);
		System.out.println("Selling is completed");
		 }
		 else
		 {
			 System.out.println("Stack not Available");
		 }
		 
			}
 catch(Exception e)
{
 System.out.println("Sorry");
}

 }

	 
	 
	 
	 }
