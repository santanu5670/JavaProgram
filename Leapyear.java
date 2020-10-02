import java.util.*;
class Leapyear
{
public static void main(String args[])
{
int y;
Scanner s=new Scanner(System.in);
System.out.println("Enter the year");
y=s.nextInt();
if(y%400==0)
{
System.out.println("The year is Leapyear");
}
else if((y%4==0)&&(y%100!=0))
{
System.out.println("The year is Leapyear");
}
else
{
System.out.println("The year is not Leapyear");
}
}
}

