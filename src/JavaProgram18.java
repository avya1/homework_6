public class JavaProgram18 {
    public void calculation() {
        int a = 125, b = 24;
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Sum of first and second number is: " + (a + b));
        System.out.println("Subtraction of first and second number is: " + (a - b));
        System.out.println("Multiplication of first and second number is: " + (a * b));
        System.out.println("Division  of first and second number is: " + (a / b));
        System.out.println("Modulus  of first and second number is: " + (a % b));
    }

    public static void main(String[] args) {
        JavaProgram18 obj = new JavaProgram18();
        obj.calculation();
    }
}
