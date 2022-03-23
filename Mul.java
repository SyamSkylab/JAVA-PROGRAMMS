import java.util.*;
import java.io.*;
import java.lang.*;
class Mul
{
 public static void main(String args[])
{
  int n,i;
Scanner obj=new Scanner(System.in);
System.out.println("Enter The Number:");
n=obj.nextInt();
for(i=1;i<=10;i++)
{

  System.out.println(n+"*"+i+"="+(i*n));
}
}
}