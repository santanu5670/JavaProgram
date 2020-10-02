import java.util.*;
class Array
{
String w[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
int i,x,flag=0;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the position for display the day=");
x=sc.nextInt();
for(i=0;i<w.length;i++)
{
if(i==x)
{
flag=1;
break;
}
else
{
flag=0;
}
}
if(flag==1)
{
System.out.println("The day The day is"+w[i]);
}
else
{
System.out.println("Invalid choice");
}
}
}
class Week1
{
public static void main(String args[])
{
Array obj=new Array();
obj.input();
}
}