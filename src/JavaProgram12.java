public class JavaProgram12 {
    double a = 25.5, b = 3.5, c = 40.5, d = 4.5;//instance variable

    public void calculate() //instance method
    {
        System.out.println("Result of the given expression = " + (a * b - b * b) / (c - d));
    }

    public static void main(String[] args) //main method
    {
        System.out.println("The given expression = (25.5*3.5-3.5*3.5)/(40.5-4.5)");
        JavaProgram12 obj = new JavaProgram12();
        obj.calculate();//calling instance method with the help of object

    }
}
