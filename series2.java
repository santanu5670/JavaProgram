import java.util.*;

 // Compiler version JDK 11.0.2

 class Series
 {
   public static void main(String args[])
   { 
     int n,k=-1,i,p=0;
     Scanner s=new Scanner(System.in);
     System.out.println("enter the value of n=");
     n=s.nextInt();
     for(i=1;i<=n;i=i+2)
     {
       k=k*(-1);
       p=p+(k*i);
     }
     System.out.println("the result is="+p);
   }
 }
