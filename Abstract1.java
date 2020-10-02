import java.util.*;
abstract class x
{
abstract void disp();
abstract void disp1();
void display()
{
System.out.println("Method for x class");
}
}
abstract class y extends x
{
void disp()
{
System.out.println("Method defined in y class");
}
}
class z extends y
{
void disp1()
{
System.out.println("Method defined in z class");
}
}
class Abstract1
{
public static void main(String args[])
{
z obj=new z();
obj.display();
obj.disp();
obj.disp1();
}
}