import java.util.*;
interface A
{
int roll=21;
void dispa();
}
interface B
{
void dispb();
}
class c implements A,B
{
public void dispa()
{
System.out.println("It is in the  interface A and roll="+roll);
}
public void dispb()
{
System.out.println("It is in interface B");
}
}
class Interface
{
public static void main(String args[])
{
c obj=new c();
obj.dispa();
obj.dispb();
}
} 
