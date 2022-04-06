import java.util.*;
public class PrimeRange
{
public static void main(String args[])
{
  int i,count;
 System.out.print("Enter 2 limits:");
 Scanner sc=new Scanner(System.in);
   int m=sc.nextInt();
   int n=sc.nextInt();
System.out.println("Prime numbers between"+m+"to"+n+"are");
   for(int j=m;j<=n;j++)
  {
      count=0;
     for(i=1;i<=j;i++)
  {
       if(j%i==0)
    { 
     count++;
  }
}
if(count==2)
{ 
System.out.print(j+" ");
}
}
}
}
