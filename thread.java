import java.util.*; 
class ThreadA extends Thread  
{
public void run()
{
int n,q,r,s=0;  
Scanner b=new Scanner(System.in);
System.out.println("Enter the no");
n=b.nextInt();
q=n;
while(q>0)
{
r=q%10;
s=s+r*r*r;
q=q/10;
}
if(n==s)
System.out.println("The no is amstrong no"); 
else 
System.out.println("The no is not an amstrong no");     
}
}  
class thread 
{  
public static void main(String args[])   
{   
ThreadA a=new ThreadA();      
a.start();      
}  
}   