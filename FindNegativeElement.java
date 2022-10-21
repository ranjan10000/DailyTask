package NewPackage;

public class FindNegativeElement
{
		public static void main(String[] args) {
		int a [] = {10,-20,30,40,-50,-60};
		int le = a.length-1;
		int count = 0;
		for(int i = 0;i<=le;i++)
		{
		if(a[i]<0)
		{
		count++;
		}

		}
		System.out.println(count);
		int [] b = new int [count];
		int j = 0;
		for(int i = 0;i<=le;i++)
		{
		if(a[i]<0)
		{
		b[j]=a[i];
		System.out.print(b[j]);

		if(j==count)
		break;
		j++;
		}



		}

		}

		}



