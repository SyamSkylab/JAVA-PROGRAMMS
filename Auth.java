import java.util.*;
import java.io.*;
class Check
{
   String username;
   String password;
   int count=0;
 int flag=0;
  Check(String x,String y)
 {
   
    username=x;
    password=y;
}
int checking()
{
  if(username.length()>=8)
  {
    System.out.println("Username is Strong");

   }
else
 {
  System.out.println("Username is not secure please change");
  flag++;
 }
 if(password.length()>8)
{
  for(int i=0;i<password.length();i++)
 {
    if(password.charAt(i)=='@'||password.charAt(i)=='$'||password.charAt(i)=='#')
   {
  count++;    
  }
}
 if(count==0)
{
System.out.println("Password should contain atleast 8 characters");
flag++;
}
}
else
{

System.out.println("password should contain atleast 8 characters");
flag++;
}
return flag;
}
}
public class Auth
{
  public static void main(String args[])
{
String username,password;
int ret;
Scanner c=new Scanner(System.in);
username=c.next();
password=c.next();
Check ch=new Check(username,password);
ret=ch.checking();
if(ret==2)
{
System.out.println("Enter username:");
username=c.next();
System.out.println("Enter username:");
username=c.next();
}
else if(ret==0)
{
System.out.println("Enter username:");
username=c.next();
}
else if(ret==2)
{
System.out.println("Enter username:");
username=c.next();
}
}
}
