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
public class Main
{
 public static void main(String args[])
{
  Product obj1=new Product(1,"Pencil",50);
   Product obj2=new Product(2,"Pen",70);
   Product obj3=new Product(3,"book",40);
if(obj1.price>obj2.price && obj1.price>obj3.price)
{
System.out.println("The Highest Priced Product Is:"+obj1.p_name);
}
else if(obj2.price>obj1.price && obj2.price>obj3.price)
{

 System.out.println("The Highest Priced Product Is:"+obj2.p_name);
}
else
{

  System.out.println("The Highest Priced Product Is:"+obj3.p_name);
}
}
}
