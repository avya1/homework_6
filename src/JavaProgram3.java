public class JavaProgram3 {
    static int a = 10;//static variable
    int c = 20;//instance variable

    public static void myStaticMethod() //static method
    {
        //static area
        System.out.println("Value of static variable is " + a);
        JavaProgram3 obj1 = new JavaProgram3();
        System.out.println("Value of instance variable is " + obj1.c);
        System.out.println("Addition of static and instance variable is: " + (a + obj1.c));
    }

    public void myInstanceMethod() //instance method
    {
        //instance method
        System.out.println("Value of static variable is " + a);
        System.out.println("Value of instance variable is " + c);
        System.out.println("Multiplication  of static and instance variable is: " + (a * c));
    }

    public static void main(String[] args)//main method
    {
        JavaProgram3 obj = new JavaProgram3();//object creation
        myStaticMethod();//calling static method directly
        obj.myInstanceMethod();//calling instance method through object
    }
}
