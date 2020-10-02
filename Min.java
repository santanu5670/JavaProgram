import java.util.*;

 // Compiler version JDK 11.0.2

 class Min
 {
   public static void main(String args[])
   { 
     int a,b,c,max;
     float avg;
     Scanner s=new Scanner(System.in);
     System.out.println("enter three number");
     a=s.nextInt();
     b=s.nextInt();
     c=s.nextInt();
   if(a>b&&a>c)
   max=a;
   else if(b>a&&b>c)
   max=b;
   else 
   max=c;
   avg=(a+b+c)/3;
   System.out.println("the maximum is"+max);
   System.out.println("the average is="+avg);
   }
 }
