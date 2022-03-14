package homeworkweek6;
public class FourthProgramme {

   //instance variable
    int r = 1;
    int s = 2;
    //static variable
    static int t= 3;
    static int u= 4;
    //declare instance method
    public void multiply(){
        //calling instance and static variable

        System.out.println(r*s*t*u);

    }
    // declare static method
    public static void add(){
        FourthProgramme one = new FourthProgramme();// create object
        // calling instance variable and static variable
        System.out.println(one.r+ one.s+t+u);//
    }
        //declare main method
        public static void main(String[] args) {
            FourthProgramme obj= new FourthProgramme();// create object
            obj.multiply();//calling instance method
            add();//calling main method
        }

}









