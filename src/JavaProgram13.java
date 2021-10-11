import java.util.Scanner;

public class JavaProgram13 {
    public void average(double a, double b, double c)//instance method
    {
        double avg = (a + b + c) / 3;
        System.out.println("Average of given three value is :" + avg);
    }

    /* Other way with static method for same average

   public static  void average1(double a,double b,double c)// Static method
   {
       double avg=(a+b+c)/3;
       System.out.println("Average of given three value is :"+avg);
   }
     */
    // main method
    public static void main(String[] args) {
        System.out.println("Please enter 3 no to get the average:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Value:");
        double a = scanner.nextDouble();
        System.out.println("Second Value:");
        double b = scanner.nextDouble();
        System.out.println("Third Value:");
        double c = scanner.nextDouble();
        JavaProgram13 obj = new JavaProgram13();
        obj.average(a, b, c);
        //average1(a,b,c);//static method calling directly without help of object

    }
}
