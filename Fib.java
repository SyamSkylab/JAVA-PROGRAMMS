import java.util.*;
class Fib
{
 public static void main(String args[])
{
   int max=10,first=0,second=1,i=1;
System.out.println("Fibonacci series of"+max+"number:");
while(i<=max)
{
   System.out.println(first+" ");
 int Sum=first+second;
first=second;
second=Sum;
i++;
}
}
}