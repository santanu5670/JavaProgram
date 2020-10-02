import java.util.*;
class fact
{
public static void main(String args[])
{
int i,f=1,n;
Scanner s=new Scanner(System.in);
System.out.println("enter no=");
n=s.nextInt();
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("The result is="+f);
}
}
