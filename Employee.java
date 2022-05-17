import java.util.*;
class Employee
{
int eno;
String eName;
int eSalary;
  eno=a;
 eName=n;
eSalary=sal;
}
void display()
{

  System.out.println("Employee Number:"+eno);
  System.out.println("Employee Name:"+n);
  System.out.println("Employee Salary:"+eSalary);
}
}
public class Emp
{
  public static void main(String args[])
{
   Employee obj[]=new Employee();
 System.out.println("Enter The Number Of Employee:");
 Scannner c=new Scannner(System.in);
 int  n=c.nextInt();
for(int i=0;i<n;i++)
{
  System.out.println("Enter The Employee Number Of (i+1)th Employee :");
    obj[i].eno=c.nextInt();
  System.out.println("Enter The Employee Name Of (i+1)th Employee :");
    obj[i].eName=c.next();
   System.out.println("Enter The Salary  Of (i+1)th Employee :");
    obj[i].eSalary=c.nextInt();
   System.out.println("\n");
}
System.out.println("Enter The Employee Number To Find  The Details:");
int empno=c.nextInt();
for(i=0;i<n;i++)
{
  if(obj[i].eno==empno)
 {

  obj[i].display();
}
}
}

