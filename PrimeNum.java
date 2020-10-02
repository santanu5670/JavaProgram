import java.util.*;

 // Compiler version JDK 11.0.2

 class PrimeNum
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
           temp=1;
           for(j=2;j<=i/2;j++)
           {
           if(i%j==0)
           {
           temp=0;
           break;
          } 
         } 
          if(temp==1)
           System.out.println("The prime factors are"+i);
         }
        } 
       
 }
} 