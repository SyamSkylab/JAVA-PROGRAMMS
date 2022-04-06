import java.util.*;
class FiboRecurse
{
 public static void main(String args[])
{
   int max=10;
System.out.println("Fibonacci series of"+max+"numbers:");
 for(int i=0;i<max;i++)
{
System.out.print(fibonacciRecursion(i)+" ");

}
}
public static int fibonacciRecursion(int n)
{
    if(n==0)
{
   return 0;
}
if(n==1||n==2)
{
   return 1;
}
return fibonacciRecursion(n-2)+fibonacciRecursion(n-1);
}
}