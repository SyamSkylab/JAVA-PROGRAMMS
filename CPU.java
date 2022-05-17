import java.util.*;
public class CPU
{
  int price;
class Processor
{
   int num_cores;
   String manufacturer;
}
static class Ram
{
 static String Memory;
static String Manufacturer;
}
public static void main(String args[])
{
   Scanner sc=new Scanner(system.in);
 CPU obj1=new CPU();
System.out.println("Enter the price of CPU");
CPU.price=sc.nextInt();
Processor p1=new Processor();
System.out.println("Enter the Number of cores and manufacturer");
p1.num_cores=sc.nextInt();
p1.Manufacturer=sc.next();
System.out.println("Enter the Ram size and its Manufacturer:");
Ram.Memory=sc.next();
Ram.Mnaufacturer=sc.next();
System.out.println("CPU price:"+obj1.price+"Processor size and Manufacturer:"+p1.num_cores+" "+p1.Manufacturer+"\nRam Size and its Manufacturer"+Ram.Memory+" "+Ram.Manufacturer);
}
}
