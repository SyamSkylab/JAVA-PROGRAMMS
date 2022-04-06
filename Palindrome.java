import java.util.*;
import java.lang.*;
public class Palindrome
{
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter a string:");
  String str=sc.nextLine();
    int size=str.length();
 boolean isPalindrome = true;
for(int i=0;i<size/2;i++)
{
if(str.charAt(i)==str.charAt(size-i-1))
 continue;
else
{
   isPalindrome=false;
break;
}
}
if(isPalindrome)
System.out.println( " The String"+str+"is a palindrome");
else
 System.out.println( "The String"+str+"is not a palindrome");
}