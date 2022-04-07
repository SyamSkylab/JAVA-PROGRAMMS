import java.util.*;
class Complex
{
  int img;
  int real;
void display()
{
  System.out.println(img+"i+"+real);
}
}
class AddComplex
{ 
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  Complex c1=new Complex();
   Complex c2=new Complex();
  Complex c3=new Complex();
System.out.println("Enter the imaginary and realpart of fisrt complex number:");
  c1.img=sc.nextInt();
 c1.real=sc.nextInt();
System.out.println("Enter the imaginary and realpart of second complex number:");
  c2.img=sc.nextInt();
 c2.real=sc.nextInt();
c3.img=c1.img+c2.img;
c3.real=c1.real+c2.real;
System.out.println("The sum of the complex numbers="+c3.img+"i+"+c3.real);
}
}

