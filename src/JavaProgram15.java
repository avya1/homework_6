import java.util.Scanner;

public class JavaProgram15 {
    int c;//instance variable

    public void swap(int a, int b)//instance method
    {
        c = a;
        a = b;
        System.out.println("After swapping");
        System.out.println("First value " + a);
        System.out.println("Second value " + c);
    }

    public static void main(String[] args)//main method
    {
        System.out.println("Enter value to perform swapping ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("First value");
        int k = scanner.nextInt();
        System.out.println("Second value");
        int j = scanner.nextInt();
        JavaProgram15 obj = new JavaProgram15();
        obj.swap(k, j);

    }
}
