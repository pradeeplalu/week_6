package homeworkweek6;

public class FirstProgramme {
    // declare instance variables
    int x = 1;// instance variable
    int y = 2;// instance variable

    //declare instance method
    public void addition() {
        // call both variable in to instance method
        // we can direct call variable in instance method
        System.out.println(x);
        System.out.println(y);
    }
      //declare instance method
      public void multiply(){
     //calling instance variable
          System.out.println(x);
          System.out.println(y);
      }

    // declare main method
    public static void main(String[] args) {
        FirstProgramme study = new FirstProgramme();//create object
        study.addition();
        study.multiply();
    }

}
