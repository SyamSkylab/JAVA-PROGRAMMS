import java.util.*;
public class Main{
public static void main(String [] args){
String test="Aa........";
count(test);
}
public static void count(String x)
{
 char [] ch=x.toCharArray();
 int letter=0;
 int Space=0;
  int num=0;
int other=0;
for(int i=0;i<x.length();i++)
{
if(Character.isLetter(ch[i]))
{
letter++;
}
else if(Character.isDigit(ch[i]))
{
num++;
}
else if(Character.isSpaceChar(ch[i]))
{
Space++;
}
else
{
other++;
}
}
System.out.println("The String is:.......");
System.out.println("letter:"+letter);
System.out.println("number:"+num);
System.out.println("Other:"+other);
}
}
