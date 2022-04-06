import java.util.*;
public class Prime
{
public static void main(String args[])
{
  int num,i,count=0;
Scanner Scan=new Scanner(System.in);
System.out.print("enter a Number:");
num=Scan.nextInt();
 for(i=2;i<num;i++)
{
   if(num%i==0)
  {
    count++;
    break;
}
}
if( count==0)
{
  System.out.print("Number is prime");
}
else
{
 System.out.print("This is not a prime Number");
}
}
}
