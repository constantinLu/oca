package _14ConditionalOperators;

public class ConditionalOp {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = a && b; // false
        boolean e = a || b; // true
        boolean f = a^b; // true


        int f1 = 4;
        boolean g = false && (f1++ < 4);
        boolean h = (f1-- == 4) && !g;

        System.out.println(g + " " + h);




    }
}
