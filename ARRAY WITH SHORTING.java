import java.util.*;
 class Arr
 {
   int n,x,i,j,temp,flag=0;
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
     for(i=0;i<n;i++)
     {
       for(j=i+1;j<n;j++)
       {
       if(a[i]>a[j])
       {
       temp=a[i];
       a[i]=a[j];
       a[j]=temp;
      } 
     }
    } 
    System.out.println("Assending oeder=");
    for(i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
     System.out.println("enter the number for search") ;
     x=s.nextInt();
     for(i=0;i<n;i++)
     {
     if(a[i]==x)
     {
     flag=1;
     break;
    }
    else
    {
      flag=0;
    }
    }
    if(flag==1)
     System.out.println("the elements found in location="+(i+1));
   else
   System.out.println("the elements found not found");
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