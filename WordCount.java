package TASK;

import java.util.Scanner;

public class WordCount 
 {
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("TeleApps is a leading service and solutions provider that helps define and deliver a consistently wow experience along the entire width of the customer experience journey. Its products and services aim to resolve issues, monitor performance with operational and customer insights derived from analytics and empower businesses to grow and succeed.");
    	System.out.println();
    	System.out.println("Enter What Count You Want??");
    String s1 ="TeleApps is a leading service and solutions provider that helps define and deliver a consistently wow experience along the entire width of the customer experience journey. Its products and services aim to resolve issues, monitor performance with operational and customer insights derived from analytics and empower businesses to grow and succeed.";
    String [] d=s1.split(sc.nextLine());
    int count=0;
    for (String str : d) 
    {
        count++;
    }
    System.out.println("count :"+(count));
}
}