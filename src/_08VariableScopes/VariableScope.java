package acd.lp;

public class VariableScope {

    static int myNewInt = 5;  //globalVar

    public static void main(String[] args) {

        int myLocalInt = 10;


        {
            int myOtherInt = 20;
            System.out.println("myOtherInt= " + myOtherInt);
            System.out.println("incodeBlock myLocalInt= " + myLocalInt);
        }

        System.out.println("myOtherInt= " + myLocalInt);
    }

    public static void myMethod() {

    }
}
