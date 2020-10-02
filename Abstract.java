import java.util.*;
abstract class x
{
abstract void disp();
void display()
{
System.out.println("Method for x class");
}
}
class y extends x
{
void disp()
{
System.out.println("Method defined in y class");
}
}
class Abstract
{
public static void main(String args[])
{
y obj=new y();
obj.display();
obj.disp();
}
}