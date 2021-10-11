public class JavaProgram2 {

    static String name = "Anchal", surname = "Rathod";//static variable

    public static void staticMethod()//static method
    {
        //static area
        System.out.println("Name is " + name);//Direct using static variable to print value
        System.out.println("Surname is " + surname);
        /* other way to use static variable in static method
        System.out.println(JavaProgram2.name);//access static variable with class name
        System.out.println(JavaProgram2.surname);
         */
    }


    public static void main(String[] args)//main method
    {
        staticMethod();//directly calling static method in main method
    }
}
