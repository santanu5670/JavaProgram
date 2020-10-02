import java.util.*;

 // Compiler version JDK 11.0.2

 class Min
 {
   public static void main(String args[])
   { 
     double a,b,c,max,min;
     double avg;
     Scanner s=new Scanner(System.in);
     System.out.println("enter three number");
     a=s.nextInt();
     b=s.nextInt();
     c=s.nextInt();
     max=Math.max(Math.max(a,b),c);
     min=Math.min(Math.min(a,b),c);
   avg=(a+b+c)/3;
   System.out.println("the maximum is"+max);
   System.out.println("the miniimum is"+min);
   System.out.println("the average is="+avg);
   }
 }
