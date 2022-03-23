import java.util.*;
import java.io.*;
import java.lang.*;
class Sdigit
{
  public static void main(String args[])
 {
   int r,s=0;
  Scanner obj=new Scanner(System.in);
System.out.print("Enter The Number:");
int n=obj.nextInt();
while(n>0)
{
  r=n%10;
  s=s+r;
  n=n/10;
}
System.out.println("Sum Of Digit= "+s);
}
}