import java.util.*;
class Rectangle
{

   int l;
  int b;
Rectangle(int x,int y)
{

   l=x;
   b=y;
}
void area()
{

   int ar=l*b;
System.out.println("Area="+ar);
}
}
class Traingle
{ 
  int b;
  int h;
Traingle(int x,int y)
{
  b=x;
 h=y;
}
void area()
{

    double ar=(0.5*b*h);
 System.out.println("Area of traingle="+ar);
}
}
class Circle
{ 
  double r;
Circle(double x)
{
  r=x;
}
void area()
{

    double ar=(3.14*r*r);
 System.out.println("Area of traingle="+ar);
}
}
public class Shapes
{
  public static void main(String args[])
{   

    double r;
int l,b,ba,h;
      Scanner sc=new Scanner(System.in);
  System.out.println("Enter the value of length and breadth of rectangle:");
     l=sc.nextInt();
     b=sc.nextInt();
  Rectangle rec=new Rectangle(l,b);
  rec.area();
    
 System.out.println("Enter the value of height and breadth of traingle:");
 h=sc.nextInt();
 ba=sc.nextInt();
  Traingle tra=new Traingle(h,ba);
  tra.area();
  System.out.println("Enter the value of radius	");
 r=sc.nextInt();
  Circle cir=new Circle(r);
  cir.area();
    }
}
  