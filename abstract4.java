import java.util.*;
abstract class x
{
void display1()
{
System.out.println("It is an abstract class");
}
}
class y extends x
{
}
class abstract4
{
public static void main(String args[])
{
y obj=new y();
obj.display1();
}
}