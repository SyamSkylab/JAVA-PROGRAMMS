import java.util.*;
import java.io.*;
import java.lang.*;
class Circle
{
  public static void main(String args[])
 {
   int p;
  Scanner obj=new Scanner(System.in);
System.out.print("Enter radius of circle:");
int r=obj.nextInt();
System.out.println("Area of circle "+(Math.PI*r*r));
System.out.println("Perimeter of circle "+(2*Math.PI*r));

}
}