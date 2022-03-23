import java.util.*;
import java.io.*;
class Enumber
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.print("Enter The 3  numbers:");
int a=obj.nextInt();
int b=obj.nextInt();
int c=obj.nextInt();
System.out.println("The result is"+Sumoftwo(a,b,c));
}
public static boolean Sumoftwo(int p,int q,int r)
{
   
  return((p+q)==r||(q+r)==p||(r+p)==q);
}
}
