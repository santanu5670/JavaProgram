import java.util.*;
class arraysum
{
  public static void main(String args[])
  {
    int i,sum=0;
    int a[]=new int[5];
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number=");
    for(i=0;i<5;i++)
    {
      a[i]=s.nextInt();
    }
    for(i=0;i<5;i++)
    System.out.println("the numbers are"+a[i]);
    for(i=0;i<5;i++)
    {
      sum=sum+a[i];
      }
      System.out.println("The result is"+sum);
  }
  
}
