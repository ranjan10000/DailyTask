package NewPackage;


import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class VendingMachine {

public static void main(String[] args) {

int balance=0;
System.out.println("all the items...");
Map<String,Integer> mp=new LinkedHashMap();
mp.put("Fanta",10);
mp.put("7up",10);
mp.put("Soda",10);
mp.put("cream biscuit",10);
mp.put("chocolate",20);
mp.put("orange",20);
mp.put("mango",20);
mp.put("Green Pea Masala",20);
mp.put("Masala vada",30);
mp.put("Ragi Murukku",30);
mp.put("Peanut Cake",30);
mp.put("Rava Laddu",30);
System.out.println(mp);

Scanner s= new Scanner(System.in);

System.out.println("enter a amount : ");
int amount=s.nextInt();
if(amount<10) {
System.out.println("amount is not sufficien :");
}

else {
System.out.println("product under your amount :");
Set<Entry<String,Integer>> entrySet =mp.entrySet();
for (Entry<String,Integer> entry : entrySet) {
if (entry.getValue()<=amount) {                                     
System.out.println(entry);
}

}
try {
System.out.println("enter a product to buy :");
String prod=s.next();
for(Entry<String,Integer> entry : entrySet) {
if (entry.getKey().equalsIgnoreCase(prod)) {
System.out.println(entry.getKey()+ "is purchased product ");
balance=amount-mp.get( prod);
System.out.println("your balance is "+balance);
}}}catch(Exception e)
{
	System.out.println(e);
}

}

}}





