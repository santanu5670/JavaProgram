import java.util.*;

 // Compiler version JDK 11.0.2
 class Arr
 {
   int n,x,i;
   Scanner s=new Scanner(System.in);
   void input()
   {
     System.out.println("enter the no of elements in an array");
     n=s.nextInt();
     int a[]=new int[n];
     System.out.println("enter the number");
     for(i=0;i<n;i++)
     {
      a[i]=s.nextInt();
     }
     System.out.println("enter the number for search") ;
     x=s.nextInt();
     for(i=0;i<n;i++)
     {
     if(a[i]==x)
     {
     System.out.println("the elements found in location="+(i+1));
    }
    }  
   }
} 
 class Array
 {
   public static void main(String args[])
   {
    Arr A1= new Arr();
    A1.input();
   }
 }