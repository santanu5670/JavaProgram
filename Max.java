import java.util.*;
class Maximum
{
int a,b,c,d;
void input()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter four no=");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
d=s.nextInt();
}
void calculation()
{
if(a>b && a>c && a>d)
System.out.println("The biggest no is="+a);
if(b>a && b>c && b>d)
System.out.println("The biggest no is="+b);
if(c>a && c>b && c>d)
System.out.println("The biggest no is="+c);
if(d>a && d>b && d>c)
System.out.println("The biggest no is="+d);
}
}
class Max
{
public static void main(String args[])
{
Maximum m=new Maximum();
m.input();
m.calculation();
}
}





