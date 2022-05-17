import java.util.*;
import java.lang.*;
class Employee
{
int eno=0;
String eName;
int eSalary=0;
void store  (int a,String en,int sal)
{
this.eno=a;
this.eName=en;
this.eSalary=sal;
} 
void display()
{

  System.out.println("Employee Number:"+eno);
  System.out.println("Employee Name:"+eName);
  System.out.println("Employee Salary:"+eSalary);
}
}
public class Emp
{
  public static void main(String args[])
{  

 Scanner c=new Scanner(System.in);
 System.out.println("Enter The Number Of Employee:");
int  n=c.nextInt();

   int no,sl,empno;
String enm;
   Employee[] obj=new Employee[n];
for(int i=0;i<n;i++)
{
  System.out.println("Enter The Employee Number Of"+(i+1)+"th Employee :");
   no=c.nextInt();
  System.out.println("Enter The Employee Name Of"+(i+1)+"th Employee :");
    enm=c.next();
   System.out.println("Enter The Salary  Of"+(i+1)+"th Employee :");
    sl=c.nextInt();
  obj[i].store(no,enm,sl);
}
System.out.println("Enter The Employee Number To Find  The Details:");
empno=c.nextInt();
for(int i=0;i<n;i++)
{
  if(obj[i].eno==empno)
 {

  obj[i].display();
}
}
}
}
