import java.util.*;

 // Compiler version JDK 11.0.2

 class Swap
 {
   int a,b;
   Scanner s=new Scanner(System.in);
   void input()
   {
   System.out.println("enter two no");
   a=s.nextInt();
   b=s.nextInt();  
  } 
  void calculation()
  {
    System.out.println("before Swapping="+a+" "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("after Swapping="+a+" "+b);
  }
 } 
 class Swapping
 {
   public static void main(String args[])
   {
    Swap A1=new Swap();
     A1.input();
     A1.calculation();
   }
 }