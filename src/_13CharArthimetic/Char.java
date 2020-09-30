public class Char {

    public static void main(String[] args) {

        //char 0 - 655535
        char myCharA = 'A';
        char myCharNum = '1';

        System.out.println("mycharA " + myCharA);
        System.out.println(Character.isLetter(myCharA));


        System.out.println("myCharNum " + myCharNum);
        System.out.println(Character.isLetter(myCharNum));
        System.out.println();

        //exam example

        char letter = 65; // A
        int myInt = letter + 3;
        char myNewLetter = (char) myInt;
        System.out.println(letter);
        System.out.println(myInt);
        System.out.println(myNewLetter);



    }
}

