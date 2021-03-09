import java.awt.*;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    static BigInteger factorial(int N)
    {
        // Initialize result
        BigInteger f
                = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }
    public static void main(String[] args) {
        System.out.println("Welcome!! \nEnter \n 1 for Square root \n 2 for Factorial \n 3 for Natural logarithm \n 4 for Power function \n");
        int x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        if(x==1)
        {
            System.out.println("Enter the number \n");
            double n;
            n=sc.nextDouble();
            System.out.println("Output= ");
            System.out.println(Math.sqrt(n));
        }
        if(x==2)
        {
            System.out.println("Enter the number \n");
            int n;
            n=sc.nextInt();
            System.out.println("Output= ");
            System.out.println(factorial(n));
        }
        if(x==3)
        {
            System.out.println("Enter the number \n");
            double n;
            n=sc.nextDouble();
            System.out.println("Output= ");
            System.out.println(Math.log(n));
        }
        if(x==4)
        {
            System.out.println("Enter two numbers in format a^b \n");
            System.out.println("Enter a:");
            int a;
            a=sc.nextInt();
            System.out.println("\nEnter b:");
            double b;
            b=sc.nextDouble();
            System.out.println("Output= ");
            System.out.println(Math.pow(a,b));
        }
    }
}