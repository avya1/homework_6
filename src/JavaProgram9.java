
import java.util.Scanner;

public class JavaProgram9 {
    public void converter(String a) {
        System.out.println("Lower case conversion of the given value is " + a.toLowerCase());
        System.out.println("Upper case conversion of the given value is " + a.toUpperCase());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word in capital letters ");
        String s = scanner.nextLine();
        JavaProgram9 obj = new JavaProgram9();
        obj.converter(s);

    }
}
