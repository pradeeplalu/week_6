package homeworkweek6;

public class FourteenthProgramme {
    //enter main method
    public static void main(String[] args) {

        final double width = 5.6;// enter value of width
        final double height = 8.5;//enter value of height

        double perimeter = 2*(height + width);// find the perimeter
        double area = width * height;// find the area
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    }
}
