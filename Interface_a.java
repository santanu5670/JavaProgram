import java.util.*;
interface inter1
{
int roll=21;
void dispa();
}
interface inter2
{
void dispb();
}
interface inter12 extends inter1,inter2
{
void display();
}
class inter implements inter12
{
void display()
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
}
class Interface_a
{
public static void main(String args[])
{
inter obj=new  inter();
obj.dispa();
obj.dispb();
}
} 