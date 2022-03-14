package homeworkweek6;

public class FifteenthProgramme {
    public static void main(String[] args) {
        int a= 1;
        int b= 2;

        System.out.println("before swap");
        System.out.println("a = " + a);// enter number a
        System.out.println("b = " + b);// enter number b

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap");// after swapping
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}




