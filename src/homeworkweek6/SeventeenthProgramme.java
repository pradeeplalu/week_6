package homeworkweek6;

import java.util.Scanner;

public class SeventeenthProgramme {
    public static void main(String[] args) {

        int a;
        //create an object of Scanner class
        Scanner bin=new Scanner(System.in);
        //Enter a decimal number
        System.out.println("Enter a decimal number:");
        //Enter a decimal number
        a= bin.nextInt();
        //Binary number
        System.out.println("Binary number is:"+Integer.toBinaryString(a));
    }
}







