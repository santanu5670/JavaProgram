import java.util.*;
class Teacher
{
String[] tname=new String[20];
String[] sub=new String[20];
int tid[]=new int[20];
int i,n;
void input()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of Teachers");
n=s.nextInt();
for(i=1;i<=n;i++)
{
Scanner a=new Scanner(System.in);
System.out.println("Enter the teacher name");
tname[i]=a.nextLine();
System.out.println("Enter the teacher subject");
sub[i]=a.nextLine();
System.out.println("Enter the teacher id");
tid[i]=a.nextInt();
}
}
}
class Student extends Teacher
{
String[] sname=new String[20];
String[] address=new String[20];
int sid[]=new int[20];
int n1;
void input1()
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter the number of students");
n1=s1.nextInt();
for(i=1;i<=n1;i++)
{
Scanner b=new Scanner(System.in);
System.out.println("Enter the student name");
sname[i]=b.nextLine();
System.out.println("Enter the student address");
address[i]=b.nextLine();
System.out.println("Enter the student id");
sid[i]=b.nextInt();
}
}
}
class Display extends Student
{
void display()
{
for(i=1;i<=n;i++)
{
System.out.println("Teacher name="+tname[i]);
System.out.println("Subject of Teacher="+sub[i]);
System.out.println("Teacher id="+tid[i]);
}
}
void display1()
{
for(i=1;i<=n1;i++)
{
System.out.println("Student name="+sname[i]);
System.out.println("Student address="+address[i]);
System.out.println("Student id="+sid[i]);
}
}
}
class inherit
{
public static void main(String args[])
{
Display obj=new Display();
obj.input();
obj.input1();
obj.display();
obj.display1();
}
}
