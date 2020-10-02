import java.util.*;
import java.lang.*;

 // Compiler version JDK 11.0.2
class Shape
{
  double area1;
int area(int r)
  {
    area1=3.14*r*r;
    System.out.println("the area is="+area1);
    return 0;
  }
  int area(int a,int b)
  {
    area1=(a*b);
    System.out.println("the area is="+area1);
    return 0;
  }
  int area(int a,int b,int c)
  {
    int s=(a+b+c)/2; 
   area1=Math.sqrt((s-a)*(s-b)*(s-c));
   System.out.println("the area is="+area1);
   return 0;
  }
}
class Calculate 
 {
   public static void main(String args[])
   { 
    Shape ob=new Shape();
    ob.area(2);
    ob.area(3,2);
    ob.area(4,5,3);
   }
   
 }
