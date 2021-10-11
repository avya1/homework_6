import java.util.Scanner;

public class JavaProgram6 {
    public void circleRadius(double r) //instance method
    {
        //instance area
        double pi = 3.142;
        double a = pi * r * r;
        System.out.println("Radius of Circle is " + a);
    }

    public static void main(String[] args) //main method
    {
        System.out.println("Enter the value for radius ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        JavaProgram6 obj = new JavaProgram6();
        obj.circleRadius(radius);
    }
}
