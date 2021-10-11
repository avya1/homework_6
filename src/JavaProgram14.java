public class JavaProgram14 {
    float w = 5.6f, h = 8.5f;

    public void area()//instance method
    {
        //instance area
        float a = w * h;
        System.out.println("Area of given rectangle is " + a);
    }

    public void perimeter()//instance method
    {
        //instance area
        float p = 2 * (w + h);
        System.out.println("Perimeter of given rectangle is " + p);
    }

    public static void main(String[] args) //main method
    {
        JavaProgram14 obj = new JavaProgram14();//object creation
        obj.area();//calling instance method with the help of object of the class
        obj.perimeter();
    }
}
