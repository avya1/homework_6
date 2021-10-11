public class JavaProgram4 {
    int a = 5, b = 10;//instance variable
    static int c = 15, d = 20;//static variable

    public void methodAdd()//instance method
    {
        // instance area
        System.out.println("First instance variable is " + a + " Second instance variable " + b);
        System.out.println("Addition of two instance variables " + (a + b));
        System.out.println("First static variable is " + c + " Second static variable " + d);
        System.out.println("Addition of two static variables " + (c + d));
    }

    public static void methodMul()//static method
    {
        //static area
        JavaProgram4 obj1 = new JavaProgram4();
        System.out.println("First instance variable is " + obj1.a + " Second instance variable " + obj1.b);
        System.out.println("Multiplication of two instance variables is  " + obj1.a * obj1.b);
        System.out.println("First static variable is " + c + " Second static variable " + d);
        System.out.println("Multiplication of two static variables is  " + (c * d));
    }

    public static void main(String[] args)//main method
    {
        JavaProgram4 obj = new JavaProgram4();//object creation
        obj.methodAdd();//calling instance method with the help of object
        methodMul();//calling static method

    }

}
