import java.awt.*;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {
    private static final Logger logger = LogManager.getLogger(main.class);
    public double factorial(int N)
    {
        // Initialize result
        logger.info("[Factorial of number] - " + N);
        double f=1;

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f*i;

        logger.info("[factorial output=] - " + f);
        return f;

    }
     public double squareroot(double n)
    {
        logger.info("[Square root of number=] - " + n);
        double res=Math.sqrt(n);
        logger.info("[Square root output=] - " + res);
        return res;
    }
     public double logarithm(double n)
    {
        logger.info("[Natural log of number=] - " + n);
        double res= Math.log(n);
        logger.info("[Natural log output=] - " + res);
        return res;
    }
    public double power(double a,double b)
    {
        logger.info("[Power " + a + " raised to] " + b);
        double res= Math.pow(a,b);
        logger.info("[Output of power function=] - " + res);
        return res;
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