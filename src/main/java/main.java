import java.awt.*;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public int factorial(int N)
    {
        // Initialize result
        int f=1;

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f*i;

        return f;
    }
     public double squareroot(double n)
    {
        return Math.sqrt(n);
    }
     public double logarithm(double n)
    {
        return Math.log(n);
    }
    public double power(double a,double b)
    {
        return Math.pow(a,b);
    }
    public static void main(String[] args) {
        System.out.println("Welcome!!");
        main obj=new main();
        while (true) {
            System.out.println("Enter \n 1 for Square root \n 2 for Factorial \n 3 for Natural logarithm \n 4 for Power function \n 5 for exit \n");
            int x;
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            if (x == 1) {
                System.out.println("Enter the number \n");
                double n;
                n = sc.nextDouble();
                System.out.println("Output= ");
                System.out.println(obj.squareroot(n));
            }
            if (x == 2) {
                System.out.println("Enter the number \n");
                int n;
                n = sc.nextInt();
                System.out.println("Output= ");
                System.out.println(obj.factorial(n));
            }
            if (x == 3) {
                System.out.println("Enter the number \n");
                double n;
                n = sc.nextDouble();
                System.out.println("Output= ");
                System.out.println(obj.logarithm(n));
            }
            if (x == 4) {
                System.out.println("Enter two numbers in format a^b \n");
                System.out.println("Enter a:");
                double a;
                a = sc.nextDouble();
                System.out.println("\nEnter b:");
                double b;
                b = sc.nextDouble();
                System.out.println("Output= ");
                System.out.println(obj.power(a,b));
            }
            if(x==5)
            {
                System.out.println("Thanks\n Bye!! Have a good day!! \n");
                break;
            }
        }
    }
}