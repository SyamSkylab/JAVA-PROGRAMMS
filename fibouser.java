import java.util.*;
class Fibouser
{
 public static void main(String args[])
{
   int max,first=0,second=1;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the limit:");
max=obj.nextInt();
System.out.println("Fibonacci series of"+max+"number");
 for(int i=1;i<max;i++)
{
   System.out.println(first+" ");
  int Sum=first+second;
  first=second;
 second=Sum;
}
}
}