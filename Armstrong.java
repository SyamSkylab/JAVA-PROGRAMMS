import java.util.*;
import java.lang.Math;
public class Armstrong
{
  static void isArmstrong(int n)
{
int temp,sum=0,r;
temp=n;
while(n>0)
{
  r=n%10;
 sum=sum+(r*r*r);
n=n/10;
}
if(sum==temp)
{
  System.out.println("The number "+temp+" is a amstrong number");
}
else
{
System.out.println("The number "+temp+" is not a prime number");
}
}
public static void main(String args[])
{
  int num;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
 num=sc.nextInt();
isArmstrong(num);
}
}