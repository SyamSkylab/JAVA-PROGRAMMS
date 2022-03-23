import java.util.*;
class Name
{
  public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
System.out.print("Enter your First name:");
String fname=obj.next();
Scanner obj1=new Scanner(System.in);
System.out.println("Enter your second name:");
String ename=obj1.next();

System.out.println("Hello "+fname+" "+ename);

}
}