import java.util.*;
class Temperature
{
int f,c,ch;
void input()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your choice:\n 1 for celcius to fahrenheit \n 2 for fahrenhiet to celcius");
ch=s.nextInt();
}
void calculation()
{
switch(ch)
{
case 1:
	Scanner cel=new Scanner(System.in);
	System.out.println("Enter the celcius value");
	c=cel.nextInt();
	f=((9*c)/5)+32;
	System.out.println("The Fahrenhiet value is="+f);
	break;
case 2:
	Scanner fah=new Scanner(System.in);
	System.out.println("Enter the fahrenhiet value");
	f=fah.nextInt();
	c=((f-32)*5)/9;
	System.out.println("The Celcius value is="+c);
	break;
default:
	System.out.println("Invalid choice");
}
}
}
class Temp
{
public static void main(String args[])
{
Temperature a=new Temperature();
a.input();
a.calculation();
}
}	