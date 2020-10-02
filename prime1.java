import java.util.*;

 // Compiler version JDK 11.0.2

 class Prime
 {
    public static void main(String args[])
   { 
       int n,i,j,temp;
       Scanner s=new Scanner(System.in);
       System.out.println("enter no=");
       n=s.nextInt();
       for(i=2;i<=n;i++)
       {
         if(n%i==0)
         {
           System.out.println("the prime factors are="+i);
         } 
      } 
 }
} 

 