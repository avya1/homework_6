public class JavaProgram1 {
    int a = 10, b = 20;//instance variable

    public void instanceMethod()//instance method
    {
        //Instance Area
        System.out.print("First Instance Variable is " + a);
        System.out.println(" Second Instance variable is " + b);
        /*other way to use instance variable
        JavaProgram1 obj1=new JavaProgram1();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        */
    }
    public static void main(String[] args)//main method
    {
        JavaProgram1 obj = new JavaProgram1();//object creation
        obj.instanceMethod();//calling instance method with the help of object
    }
}
