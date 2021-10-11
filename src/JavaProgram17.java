public class JavaProgram17 {
    public static void convertDecimalToBinary()//static method
    {
        //static area
        int a = 5;
        String s = Integer.toBinaryString(a);
        System.out.println("Given decimal number to convert in binary: " + a);
        System.out.println(s);
    }

    public static void main(String[] args)//main method
    {
        convertDecimalToBinary();//calling static method
    }
}
