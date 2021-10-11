import java.util.Scanner;

public class JavaProgram7 {
    public static void convertTem(double a) {
        double c = (a - 32) * 5 / 9;
        System.out.println("Conversion of entered temperature fahrenheit to degree celsius is  " + c);
    }

    public static void main(String[] args) {
        System.out.println("Please enter temperature in fahrenheit  ");
        Scanner scanner = new Scanner(System.in);
        double f = scanner.nextDouble();
        convertTem(f);
    }
}
