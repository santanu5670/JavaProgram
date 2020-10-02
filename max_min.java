import java.util.*;

 // Compiler version JDK 11.0.2

 class test
 {
   Scanner s=new Scanner(System.in);
   int x,y,z;
   void getdata()
   {
     System.out.println("Enter three no.:");
     x=s.nextInt();
     y=s.nextInt();
     z=s.nextInt();
   }
   void max()
   {
     int max;
     if(x>y&&x>z)
     {
       max=x;
     }
     else if(y>x&&y>z)
     {
       max=y;
     }
     else
     {
       max=z;
     }
     System.out.println("The maximum is:"+max);
   }
   void min()
   {
     int min;
     if(x<y&&x<z)
     {
       min=x;
     }
     else if(y<x&&y<z)
     {
       min=y;
     }
     else
     {
       min=z;
     }
     System.out.println("The minimum is:"+min);
   }
   void avg()
   {
     float av;
     int sum=x+y+z;
     av=(x+y+z)/(float)3;
     System.out.println("The average of the numbers:"+av);
     System.out.println("The sum of the number is:"+sum);
     
     int temp=0;
     while(sum>0)
     { 
       int r;
       r=sum%10;
       temp=temp*10+r;
       sum=sum/10;
     }
     System.out.println("The reverse number of the sum is:"+temp);
   }
   
 }
 class max_min
 {
   public static void main(String args[])
   {
     test a1=new test();
     a1.getdata();
     a1.max();
     a1.min();
     a1.avg();
   }
 }