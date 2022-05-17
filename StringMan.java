import java.util.*;
import java.lang.*;
public class StringMan
{
  public static void main(String args[])
 {
   
  Scanner sc=new Scanner(System.in);
 System.out.println("Enter The String:");
 String str1=sc.next();
  int ln=str1.length();
 System.out.println("The length of the string:"+ln);
System.out.println("Enter The new String:");
  String str2=sc.next();
  String c=str1.concat(str2);
System.out.println("The concatenated String will be:"+c);
System.out.println("Enter a String3 in lower case:");
String str3=sc.next();
String x=str3.toUpperCase();
System.out.println("The upperCase form of String3 is:"+x);
System.out.println("Compare string2 and string3="+str2.compareTo(str3)); 
String str4=String.valueOf(str3);
System.out.println("str4="+str4);
}
}

