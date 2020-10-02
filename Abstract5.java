import java.util.*;
abstract class x
{
abstract void display();
void display1()
{
System.out.println("It is an abstract class");
}
}
class y extends x
{
void display()
{
System.out.println("It is an inherited class 1");
}
}
class z extends x
{
void display()
{
System.out.println("It is an inherited class 2");
}
}
class Abstract5
{
public static void main(String args[])
{
y obj1=new y();
z obj2=new z();
obj1.display();
obj1.display1();
obj2.display();
obj2.display1();
}
}