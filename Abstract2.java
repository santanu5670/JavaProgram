import java.util.*;
abstract class x
{
abstract void Disp();
void Display()
{
System.out.println("Method for x class");
}
}
abstract class y extends x
{
abstract void disp1();
void Disp()
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
class Abstract2
{
public static void main(String args[])
{
z obj=new z();
obj.Display();
obj.Disp();
obj.disp1();
}
}