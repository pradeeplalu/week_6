package homeworkweek6;

public class SixteenthProgramme {
    public static void main(String[] args) {

        //two input strings containing the binary representation of the two values
        String binaryNumber1 = "10", binaryNumber2 = "11";
        // converting strings into binary format numbers
        int integer1 = Integer.parseInt(binaryNumber1, 2);
        int integer2 = Integer.parseInt(binaryNumber2, 2);
        System.out.println("Input first binary number:" + Integer.toBinaryString(integer1));
        System.out.println("Input second binary number:" + Integer.toBinaryString(integer2));


        // adding two integers
        int output = integer1 + integer2;

        // converting output back to Binary Integer
        System.out.println("Sum of two binary numbers:" + Integer.toBinaryString(output));
    }
}
