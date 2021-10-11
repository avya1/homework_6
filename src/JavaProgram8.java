import java.util.Scanner;

public class JavaProgram8 {
    public void areaOfTriangle(double b, double h) {
        double area = (b * h) / 2;
        System.out.println("Area of given triangle is " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base value of the triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter height of the triangle:");
        double height = scanner.nextDouble();
        JavaProgram8 area = new JavaProgram8();
        area.areaOfTriangle(base, height);

    }
}
