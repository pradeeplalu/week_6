package homeworkweek6;

public class ThirdProgramme {
    String name = "softwaretester";// instance variable
    static String b="designation";// static variable

        //declare instance method
    public void designation() {
        System.out.println(b);//call static variable
        System.out.println(name);// call instance variable
    }
        //declare static method
        public static void softwaretester(){
            ThirdProgramme obj = new ThirdProgramme();// create object
            System.out.println(obj.name);//call instance variable via object
            System.out.println(b);// call static variable

    }
        //declare main method
        public static void main(String[] args) {
            ThirdProgramme abc=new ThirdProgramme();//create object
            abc.designation();//call instance method via object
            softwaretester();//call static method


        }


    }

