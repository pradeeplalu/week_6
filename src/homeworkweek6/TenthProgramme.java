package homeworkweek6;

import java.util.Scanner;

public class TenthProgramme {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);// create an object of scanner

        System.out.print("Input a number: ");// input a number
        int num1 = in.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " x " + (i + 1) + " = " +
                    (num1 * (i + 1)));
        }
    }
}