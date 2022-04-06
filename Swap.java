import java.util.*;
public class Swap
{
 public static void main(String[] args)
{
   Scanner input=new Scanner(System.in);
 System.out.print("input a number for A:");
 int a=input.nextInt();
System.out.print("input a number for B:");
 int b=input.nextInt();
  int c=a;
      a=b;
      b=c;
System.out.println("Number in A:"+a);
System.out.println("Number in B:"+b);
 System.out.print("input a number for C:");
 int C=input.nextInt();
 System.out.print("input a number for D:");
 int d=input.nextInt();
   C=C+d;
    d=C-d;
   C=C-d;
System.out.println("Number in C:"+C);
System.out.println("Number in D:"+d);
}
}