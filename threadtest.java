import java.io.*; 
 
class ThreadA extends Thread  
{  
public void run()   
{   
for(int i=1;i<5;i++)    
{    
System.out.println("Within thread a "+i);   
}   
}  
} 
class ThreadB extends Thread  
{  
public void run()   
{   
for(int j=1;j<5;j++)    
{    
System.out.println("Within thread b "+j);    
}   
}  
} 
class ThreadC extends Thread  
{  
public void run()   
{   
for(int k=1;k<5;k++)    
{    
System.out.println("Within thread c "+k);    
}   
}  
} 
class threadtest 
{  
public static void main(String args[])   
{   
ThreadA a=new ThreadA();   
ThreadB b=new ThreadB();   
ThreadC c=new ThreadC();   
a.start();   
b.start();   
c.start();   
}  
}   