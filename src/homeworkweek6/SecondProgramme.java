package homeworkweek6;

public class SecondProgramme {
       // declare static variables

    static int p = 20;// static variable
    static String name = " watford"; //static variable

        //declare static method
    public static void mycity() {
        // call static variable in to static method
        System.out.println(name);
        System.out.println(p);
    }
       // declare main method
    public static void main(String[] args) {
        //call the static method
        mycity();
    }
}


