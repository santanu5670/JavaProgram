 import java.util.*; 
 
class Error3  
{  public static void main(String args[]) 
  {   
float a,b,c;   
Scanner s=new Scanner(System.in); 
System.out.println("Enter the result"); 
 a=s.nextInt();  
 b=s.nextInt();   
try   
 {   
 c=a/b;    
System.out.println("Division is "+c);   
 }   
catch(ArithematicException e)    
{    
System.out.println("Divide by zero");  
  } 
  } 
 } 
  