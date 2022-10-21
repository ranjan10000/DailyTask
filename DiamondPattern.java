package NewPackage;

import java.util.*;

public class DiamondPattern
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N value");

		int n = sc.nextInt();
		sc.close();
		int i,j;

		for(i=0;i<=n*2;i++)
		{
		for(j=0;j<=n*2;j++)
		{
		if(i+j<=n+1 || i+j>=3*n+1 || i-j<=-n || i-j>=n  )
		{
		System.out.print("  ");
		}
		else
		{
		System.out.print("* ");
		}
		}
		System.out.println( );
		}


		}

		}


