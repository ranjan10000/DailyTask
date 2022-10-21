package TASK;
import java.util.*;
public  class Atmprogram {
	static	Scanner sc = new Scanner(System.in);
	static int option;
	static int balance;
	static Map<Integer,Integer> m = new HashMap<>();
	static int pin;
	static boolean yes = true;
	public static void main(String[] args) throws PinMismatchException {

	

		
		m.put(1234, 5000);
		m.put(5678, 10000);
		m.put(3612, 15000);
		System.out.println("Enter your pin");
		 pin = sc.nextInt();
	
			
			while(yes)
			{
		
		if(m.containsKey(pin))
		{
			try {
			System.out.println("\nWhat would you like to do today?\n" +
                    "1. Check my balance\n" +
                    "2. Make a withdrawal\n" +
                    "3. Make a deposit\n"
                    +"4.Exit");
			  option = sc.nextInt();
			Bank.AtmBanking();
			}catch(InputMismatchException e)
			{
				System.out.println("Enter Vaild Data  !!!!");
				break;
			}
		}
		else
		{
			throw new PinMismatchException();
		}
		
		
	}
		
	
	}


	static class Bank
	{
		
		
		  static void AtmBanking()
		{
			  balance = m.get(pin);
			switch(Atmprogram.option)
			{
			case 1 : 
				
				System.out.println("Your current balance is "+balance );
            break;
				
			case 2 : 
				
				System.out.println("Enter your withdrawl amount");
			int withdrawl = sc.nextInt();
			
			if(withdrawl<balance)
			{
				int remainingbalance = balance-withdrawl; 
				System.out.println("your remaining balance is"+remainingbalance);
				break;
			}
			else
			{
				System.out.println("invalid amount");
				break;
			}
			
			case 3 : 
				
				System.out.println("Enter your deposite amount");
			int deposite = sc.nextInt();
			int depositeamt = balance+deposite;
			System.out.println("your balance is "+depositeamt);
				break;
				
			case 4 : 
				
				System.exit(0);
		
			}
			
		}
			
		}	
}

class  PinMismatchException extends Exception
{
	
}
