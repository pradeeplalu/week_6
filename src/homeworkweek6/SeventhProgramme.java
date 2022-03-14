package homeworkweek6;

import java.util.Scanner;

public class SeventhProgramme {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// create object of scanner class
        System.out.println(" Enter temperature in fahrenheit :");//enter fahrenheit
        double f = s.nextDouble();
        double c = 5.0 / 9.0 * (f - 32);
        System.out.printf("%.21f%cF is eual to %.21f%c C%n", f, 248, c, 248);

    }

    }
