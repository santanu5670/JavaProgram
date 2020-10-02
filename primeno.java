import java.util.*; 
class ThreadA extends Thread  
{
public void run()
{
int n,i,flag=0,temp;  
Scanner b=new Scanner(System.in);
System.out.println("Enter the no");
n=b.nextInt();
for(i=2;i<=n/2;i++)
{
temp=n%i;
if(temp!= 0)
flag=1;
break;
}
if(flag==1)
System.out.println("The no is prime no"); 
else 
System.out.println("The no is not an prime no");     
}
}  
class primeno
{  
public static void main(String args[])   
{   
ThreadA a=new ThreadA();      
a.start();      
}  
}   