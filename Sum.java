import java.util.*;
import java.io.*;
class Sum
{
  public static void main(String args[])
 {
   int sum;
  Scanner obj=new Scanner(System.in);
System.out.print("Enter your First number:");
int a=obj.nextInt();
Scanner obj1=new Scanner(System.in);
System.out.println("Enter your second number:");
int b=obj1.nextInt();
sum=a+b;
System.out.println("Sum="+sum);


}
}