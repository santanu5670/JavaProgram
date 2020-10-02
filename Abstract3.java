import java.util.*;
abstract class x
{
abstract void disp();
}
abstract class y extends x
{
abstract void disp1();
}
class z extends y
{
void disp()
{
System.out.println("Method defined in z class for disp()");
}
void disp1()
{
System.out.println("Method defined in z class for disp1()");
}
}
class Abstract3
{
public static void main(String args[])
{
z obj=new z();
obj.disp();
obj.disp1();
}
}