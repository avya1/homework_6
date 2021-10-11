import java.util.Scanner;

public class JavaProgram5 {
    public static void addition(double a, double b)//static method
    {
        System.out.println("Addition of two variables is  " + (a + b));
    }

    public static void subtraction(double a, double b)//static method
    {
        System.out.println("Subtraction of two variables is  " + (a - b));
    }

    public void multiplication(double a, double b)//instance method
    {
        System.out.println("Multiplication of two variables is  " + (a * b));
    }

    public void division(double a, double b)//instance method
    {
        System.out.println("Division of two variables is  " + (a / b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        double c = scanner.nextDouble();
        System.out.println("Enter second value");
        double d = scanner.nextDouble();
        addition(c, d);
        subtraction(c, d);
        JavaProgram5 obj = new JavaProgram5();
        obj.multiplication(c, d);
        obj.division(c, d);
    }
}
