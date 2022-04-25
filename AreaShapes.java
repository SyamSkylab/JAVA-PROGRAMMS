
import java.util.*;
class ShapeArea
{
   int a,l,b;
 float c,h;
 void area(int l1,int b1)
{
   this.l=l1;
   this.b=b1;
    int area1=l*b;
System.out.println("The Area Of The Rectangle:"+area1);
}
 void area(int a1)
{
   this.a=a1;
  int area2=(a*a);
System.out.println("The Area Of The Square:"+area2);
}
 void area(float b2,float h1)
{
   this.c=b2;
   this.h=h1;
 Double area3=0.5*(c*h);
System.out.println("The Area Of The Traingle:"+area3);
}
}
public class AreaShapes
{
 public static void main(String args[])
{

  Scanner c=new Scanner(System.in);
System.out.println("Enter The Length and Breadth of the Rectangle:");
 int l=c.nextInt();
 int b=c.nextInt();
ShapeArea rec=new ShapeArea();
rec.area(l,b);
System.out.println("Enter The length of a side of a square:");
 int a=c.nextInt();
ShapeArea square=new ShapeArea();
square.area(a);
System.out.println("Enter The hight and base of the Traingle:");
 float h=c.nextFloat();
 float b1=c.nextFloat();
ShapeArea Tra=new ShapeArea();
Tra.area(h,b1);
}
}