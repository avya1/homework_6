

public class JavaProgram16 {
    public static void addTwoBinary() {
        String n1 = "10", n2 = "11";//Taking binary number into string form
        System.out.println("First binary input number: " + n1);
        System.out.println("Second binary input number: " + n2);
        int i1 = Integer.parseInt(n1, 2);
        int i2 = Integer.parseInt(n2, 2);
        int result = i1 + i2;
        System.out.println("Addition of two binary number is: " + (Integer.toBinaryString(result)));
    }

    public static void main(String[] args) {

        addTwoBinary();//calling static method
    }
}
