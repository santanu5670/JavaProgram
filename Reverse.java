import java.util.*;
class Reverse
{
public static void main(String args[])
{
int n,q,r,rn;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no");
n=s.nextInt();
q=n;
rn=0;
while(q>0)
{
r=q%10;
rn=rn*10+r;
q=q/10;
}
System.out.println("The Reverse no is="+rn);
}
}