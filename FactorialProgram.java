package NewPackage;

public class FactorialProgram
{

		public static void main(String[] args) 
		{
		int n = 145;
		int fact = 1;
		int sum = 0;
		while(n>0)
		{
		int n2 = n%10;

		while(n2>0)
		{
		fact = fact*n2;

		n2--;
		}
		sum = fact+sum;
		n=n/10;
		}

		System.out.print(sum);


		}
		}


