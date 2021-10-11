import java.util.Scanner;

public class JavaProgram10 {
    public static void table() {
        int a = 8;
        System.out.println("Table of number 8 is ");
        System.out.println(a * 1);
        System.out.println(a * 2);
        System.out.println(a * 3);
        System.out.println(a * 4);
        System.out.println(a * 5);
        System.out.println(a * 6);
        System.out.println(a * 7);
        System.out.println(a * 8);
        System.out.println(a * 9);
        System.out.println(a * 10);
    }
    /*other way to do when user give number at runtime
    public static void table1(int a)
    {
        System.out.println("Table of the given number is ");
        System.out.println(a*1);
        System.out.println(a*2);
        System.out.println(a*3);
        System.out.println(a*4);
        System.out.println(a*5);
        System.out.println(a*6);
        System.out.println(a*7);
        System.out.println(a*8);
        System.out.println(a*9);
        System.out.println(a*10);

    }
     */

    public static void main(String[] args) {
        table();
        /*System.out.println("Enter number ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        table1(n);
         */
    }
}
