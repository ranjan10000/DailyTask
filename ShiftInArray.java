package NewPackage;

public class ShiftInArray {

public static void main(String[] args) {

int a []= {100,200,300,400,500};
int le = a.length-1;
int i=0;
int temp1 = a[i];
int temp2 = a[i+1];

for(i=0;i<le-1;i++)
{
a[i]=a[i+2];
}
a[i]=temp1;
a[i+1]= temp2;
for(int b : a)
{
System.out.print(b+" ");
}
       
}

}

