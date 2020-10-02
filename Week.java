import java.util.*;
class Array
{
String w[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
String x;
Scanner sc=new Scanner(System.in);
int i,flag=0;
void input()
{
System.out.println("Enter the day to print index value : ");
x=sc.nextLine();
for(i=0;i<w.length;i++)
{
    if(w[i].equalsIgnoreCase(x)) 
    {
    /* 
    Despite case of 2 strings has mismatched , This method is used to compare 2 string are equal or not  */
     flag=1;
     break;
     }
     else
    {
     flag=0;
     }
}
if(flag==1)
System.out.print("The position of given string is : " + i);
else 
System.out.println("Invalid choice");
}
}
class Week
{
public static void main(String args[]) throws ArrayIndexOutOfBoundsException,ArithmeticException
{
Array obj=new Array();
obj.input();
}
}