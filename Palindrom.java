import java.util.*;
class Palindrom
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
if(n==rn)
System.out.println("The no is Palindrom no");
else
System.out.println("The no is not an Palindrom no");
}
}