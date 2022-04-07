import java.util.*;
class Metrics
{
  int a[][]=new int[30][30];
}
public class Madd
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 Metrics m1=new Metrics();
Metrics m2=new Metrics();
Metrics m3=new Metrics();
System.out.println("Enter the number of rows and columns of both metrics:");
int m=sc.nextInt();
int n=sc.nextInt();
System.out.println("Enter The First Metrics:");
for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
{ 
   System.out.println("a["+i+"]["+j+"]=");
   m1.a[i][j]=sc.nextInt();
}
}
System.out.println("Enter The First Metrics:");
for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
{ 
   System.out.println("b["+i+"]["+j+"]=");
   m2.a[i][j]=sc.nextInt();
}
}
System.out.println("Enter The Second Metrics:");
for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
{ 
   m3.a[i][j]=m1.a[i][j]+m2.a[i][j];
}
}
System.out.println("Enter The Add Metrics:");
for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
{ 
  System.out.print(m3.a[i][j]+" ");
}
System.out.println("\n");
}
}
}