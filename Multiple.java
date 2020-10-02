import java.util.*;
class Student
{
int m1,m2;
void getmarks(int x,int y)
{
m1=x;
m2=y;
}
void putmarks()
{
System.out.println("First="+m1);
System.out.println("Second="+m2);
}
}
interface Sports
{
int sp=6;
void spmarks();
}
class Result extends Student implements Sports
{
public void spmarks()
{
System.out.println("Sports marks="+sp);
}
void disp()
{
putmarks();
spmarks();
int total=m1+m2+sp;
System.out.println("Total="+total);
}
}
class Multiple
{
public static void main(String args[])
{
Result obj=new Result();
obj.getmarks(10,20);
obj.disp();
}
}