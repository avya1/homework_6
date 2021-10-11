public class JavaProgram19 {
    public void upperToLower()//instance method
    {
        String s = "THE QUICK BROWN FOX JUMPS OVER THE LAZE DOG";
        System.out.println("The given sentence is ");
        System.out.println(s);
        System.out.println("Lower case conversion of the given sentence is");
        System.out.println(s.toLowerCase());
    }

    public static void main(String[] args)//main method
    {
        JavaProgram19 obj = new JavaProgram19();//object creation
        obj.upperToLower();//calling instance method through object
    }
}
