/* The series is 1/x*i! */

class series{
    static double fact(double n)
    {
        double i,fact = 1;
        for(i=n;i>=1;i--)
        {
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]) {
        int i;
        double sum = 0,temp;
        for(i=1;i<=2;i++)
        {
                temp = i * 3;
                sum += (i / fact(temp));
        }
        System.out.print("Sum is : " + sum);
    }
    
}