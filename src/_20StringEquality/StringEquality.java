public class StringEquality {

    public static void main(String[] args) {

        String name = "John";
        String anotherName = "John"; // gets the same reference
        String jhon  = "Jo" + "hn"; // gets the same reference
        String newName = new String("John"); // creates another reference of the String object.

        System.out.println("name == anotherNamdsdse : " + (name == anotherName));
        System.out.println("name == jhon : " + (name == jhon));
        System.out.println("name == newName : " + (name == newName));
        System.out.println("plm");

    }

    // String name = "Jhon" -> creates the object in the String pool.
    // for "=="  : is for comparing the object references.
    // for .equals() -> for comparing the values form that object.

}
