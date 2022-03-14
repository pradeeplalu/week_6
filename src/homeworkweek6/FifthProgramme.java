package homeworkweek6;

import java.util.Scanner;

public class FifthProgramme {
    static int a1;
    static int a2;
    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// create object for scanner class
        System.out.println("enter 1st number;");// enter first number
        a1= sc.nextInt();
        System.out.println("enter 2nd number;");//enter second number
        a2 = sc.nextInt();
        addition();
        substraction();

      FifthProgramme p5 = new FifthProgramme();
        p5.divison();
        p5.multiplication();

    }

    public static void addition() // static method
    {
        int sum = a1+a2;

        System.out.println("Addition of numbers is: " + sum );

    }

    public static void substraction() // static method
    {
        int sum = a1-a2;
        System.out.println("Substraction of numbers is: "+ sum);
    }

    public void divison() // instance method
    {

        int sum = a1/a2;
        System.out.println("Division of numbers is: "+ sum);
    }

    public void multiplication() // instance method
    {
        int sum = a1*a2;
        System.out.println("Multiplication of numbers is: "+ sum);
    }

    }


