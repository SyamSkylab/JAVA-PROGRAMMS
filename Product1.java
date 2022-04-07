import java.util.*;
 class Product
{ int p_code,price;
  String p_name;
  Product(int x,String str,int p)
 {
     p_code=x;
 p_name=str;
   price=p;
}
}
public class Product1
{
 public static void main(String args[])
{   
Scanner sc=new Scanner(System.in);
System.out.print("Enter the p_code,p_name,price of 1st product:");
  int pc1=sc.nextInt();
  String pn1=sc.next();
  int Price1=sc.nextInt();

System.out.print("Enter the p_code,p_name,price of 2nd product:");
  int pc2=sc.nextInt();
  String pn2=sc.next();
  int Price2=sc.nextInt();
System.out.print("Enter the p_code,p_name,price of 3rd product:");
  int pc3=sc.nextInt();
  String pn3=sc.next();
  int Price3=sc.nextInt();
  Product obj1=new Product(pc1,pn1,Price1);
   Product obj2=new Product(pc2,pn2,Price2);
   Product obj3=new Product(pc3,pn3,Price3);
if(obj1.price<obj2.price && obj1.price<obj3.price)
{
System.out.println("The lawest Priced Product Is:"+obj1.p_name);
}
else if(obj2.price<obj1.price && obj2.price<obj3.price)
{

 System.out.println("The lawest Priced Product Is:"+obj2.p_name);
}
else
{

  System.out.println("The lawest Priced Product Is:"+obj3.p_name);
}
}
}
