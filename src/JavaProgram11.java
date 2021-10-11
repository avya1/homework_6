public class JavaProgram11 {
    public void printPattern()//instance method
    {
        System.out.println("pattern is ");
        System.out.println("J  a  v  v  a");
        System.out.println("J  a a  v  v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println("J  J  a   a  V a   a");
    }

    public static void main(String[] args)//main method
    {
        JavaProgram11 obj = new JavaProgram11();//object creation
        obj.printPattern();//calling instance method with the help of object
    }
}
