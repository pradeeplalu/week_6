package homeworkweek6;

import java.util.Scanner;

public class SixthProgramme {
    //declare main method
    public static void main(String[] args) {
        double radius,area;// enter the radius
       Scanner input = new Scanner(System.in); //create object for scanner class
        System.out.println("Enter the radius of the circle");//enter radius
        radius = input.nextDouble();//input radius value
        input.close();
        area = Math.PI * radius * radius; //area of circle by  multiplying the radius twice as per equation
        System.out.println("Area of the Circle is "+area);



    }

}
